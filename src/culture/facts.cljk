(ns culture.facts
  "Regional-culture catalog for Abuja -- local dishes, protected
  products, beverages, festivals and heritage sites, piggybacked
  onto this municipality compliance repo per ADR-2607171400
  (cloud-itonami-municipality-culture-catalog, in com-junkawasaki/root),
  sibling namespace to `ordinance.facts` (ADR-2607141700).

  Every entry cites a source URL that was actually fetched and read on
  :culture/retrieved-at -- never fabricated. Summaries state only what the
  cited source confirms. An item not in this table has NO spec-basis, full
  stop; extend `catalog`, do not invent an id/url.")

(def catalog
  "municipality-slug -> vector of culture entries."
  {"abuja"
   [{:culture/id "abuja.dish.jollof-rice"
     :culture/name "Jollof rice"
     :culture/municipality "abuja"
     :culture/country "NGA"
     :culture/kind :dish
     :culture/summary "West African rice dish made with rice, tomatoes and spices, originating from Senegal; widely eaten in Nigeria and a source of national pride."
     :culture/url "https://en.wikipedia.org/wiki/Jollof_rice"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "abuja.dish.suya"
     :culture/name "Suya"
     :culture/municipality "abuja"
     :culture/country "NGA"
     :culture/kind :dish
     :culture/summary "Traditional Hausa smoke-grilled spiced meat on a skewer, originating in Northern Nigeria and widely popular across Nigeria and West Africa."
     :culture/url "https://en.wikipedia.org/wiki/Suya"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "abuja.dish.pounded-yam"
     :culture/name "Pounded yam"
     :culture/municipality "abuja"
     :culture/country "NGA"
     :culture/kind :dish
     :culture/summary "Nigerian swallow (okele) food from West Africa, traditionally prepared by pounding boiled yam with a mortar and pestle."
     :culture/url "https://en.wikipedia.org/wiki/Pounded_yam"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "abuja.dish.egusi-soup"
     :culture/name "Egusi soup"
     :culture/municipality "abuja"
     :culture/country "NGA"
     :culture/kind :dish
     :culture/summary "Soup made with the protein-rich seeds of cucurbitaceous plants, very popular in West Africa including Nigeria, with considerable local variations."
     :culture/url "https://en.wikipedia.org/wiki/Egusi"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "abuja.beverage.zobo"
     :culture/name "Zobo"
     :culture/municipality "abuja"
     :culture/country "NGA"
     :culture/kind :beverage
     :culture/summary "Infusion of roselle flower sepals; in Nigeria the drink is called zobo and is commonly sold in restaurants and on roadsides."
     :culture/url "https://en.wikipedia.org/wiki/Hibiscus_tea"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "abuja.heritage.aso-rock"
     :culture/name "Aso Rock"
     :culture/municipality "abuja"
     :culture/country "NGA"
     :culture/kind :heritage
     :culture/summary "Large granitic monolith with a peak height of 936 metres on the outskirts of Abuja, Nigeria's capital."
     :culture/url "https://en.wikipedia.org/wiki/Aso_Rock"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "abuja.heritage.abuja-national-mosque"
     :culture/name "Abuja National Mosque"
     :culture/municipality "abuja"
     :culture/country "NGA"
     :culture/kind :heritage
     :culture/summary "National mosque of Nigeria, located in the capital city Abuja, constructed in 1984."
     :culture/url "https://en.wikipedia.org/wiki/Abuja_National_Mosque"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "abuja.heritage.zuma-rock"
     :culture/name "Zuma Rock"
     :culture/municipality "abuja"
     :culture/country "NGA"
     :culture/kind :heritage
     :culture/summary "Large natural monolith of gabbro and granodiorite in Madalla, Niger State, just west of Nigeria's capital Abuja along the main road to Kaduna."
     :culture/url "https://en.wikipedia.org/wiki/Zuma_Rock"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}]})

(defn spec-basis [muni] (get catalog muni))

(defn coverage
  ([] (coverage (keys catalog)))
  ([munis]
   (let [have (filter catalog munis)
         missing (remove catalog munis)]
     {:requested (count munis)
      :covered (count have)
      :covered-municipalities (vec (sort have))
      :missing-municipalities (vec (sort missing))
      :note (str "cloud-itonami-municipality-nga-abuja culture catalog "
                 "(ADR-2607171400): " (count (get catalog "abuja"))
                 " Abuja entries, each with a fetched-and-read citation. "
                 "Extend `culture.facts/catalog`, never fabricate an id/url.")})))

(defn by-kind [muni kind]
  (filterv #(= (:culture/kind %) kind) (spec-basis muni)))
