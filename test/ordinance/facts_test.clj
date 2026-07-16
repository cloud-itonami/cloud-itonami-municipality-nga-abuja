(ns ordinance.facts-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is]]
            [ordinance.facts :as facts]))

(deftest abuja-has-spec-basis
  (let [sb (facts/spec-basis "abuja")]
    (is (= 2 (count sb)))
    (is (every? #(str/starts-with? (:ordinance/url %) "http") sb))
    (is (every? :ordinance/number sb))))

(deftest unknown-municipality-has-no-spec-basis
  (is (nil? (facts/spec-basis "lagos")))
  (is (nil? (facts/spec-basis "zzz"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["abuja" "lagos"])]
    (is (= 2 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["lagos"] (:missing-municipalities c)))))

(deftest by-topic-filters
  (is (= ["abuja.act-10-1997-abuja-environmental-protection-board"]
         (mapv :ordinance/id (facts/by-topic "abuja" :environment))))
  (is (empty? (facts/by-topic "abuja" :labor)))
  (is (empty? (facts/by-topic "lagos" :environment))))
