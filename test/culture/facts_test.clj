(ns culture.facts-test
  (:require [clojure.edn :as edn]
            [clojure.string :as str]
            [clojure.test :refer [deftest is]]
            [culture.facts :as facts]))

(deftest abuja-has-culture-basis
  (let [sb (facts/spec-basis "abuja")]
    (is (= 8 (count sb)))
    (is (= (count sb) (count (set (map :culture/id sb)))))
    (is (every? #(str/starts-with? (:culture/url %) "https://") sb))
    (is (every? #(= "abuja" (:culture/municipality %)) sb))
    (is (every? #(= "NGA" (:culture/country %)) sb))
    (is (every? #(seq (:culture/summary %)) sb))
    (is (every? #(string? (:culture/retrieved-at %)) sb))))

(deftest unknown-municipality-has-no-basis
  (is (nil? (facts/spec-basis "lagos")))
  (is (nil? (facts/spec-basis "zzz"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["abuja" "lagos"])]
    (is (= 2 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["lagos"] (:missing-municipalities c)))))

(deftest by-kind-filters
  (is (= 4 (count (facts/by-kind "abuja" :dish))))
  (is (= ["abuja.beverage.zobo"]
         (mapv :culture/id (facts/by-kind "abuja" :beverage))))
  (is (empty? (facts/by-kind "abuja" :craft)))
  (is (empty? (facts/by-kind "lagos" :dish))))

(deftest tx-file-matches-catalog
  (let [tx (edn/read-string (slurp "data/culture-tx.edn"))
        flat (mapcat val (sort-by key facts/catalog))]
    (is (= (vec flat) (vec tx)))))
