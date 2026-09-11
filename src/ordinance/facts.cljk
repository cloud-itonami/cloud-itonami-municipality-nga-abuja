(ns ordinance.facts
  "Municipal-ordinance compliance catalog for Abuja -- the
  THIRTY-EIGHTH municipality-level entry (see cloud-itonami-municipality-jpn-tokyo,
  -usa-washington-dc, -gbr-london, -can-toronto, -deu-berlin, -fra-paris,
  -nld-amsterdam, -esp-madrid, -kor-seoul, -ita-roma, -aus-sydney,
  -arg-buenos-aires, -fin-helsinki, -dnk-copenhagen, -nor-oslo,
  -bel-brussels, -chl-santiago, -col-bogota, -cri-san-jose,
  -bra-sao-paulo, -ury-montevideo, -zaf-cape-town, -ecu-quito,
  -swe-gothenburg, -pry-asuncion, -mex-guadalajara, -fra-lyon,
  -ind-new-delhi, -pol-warsaw, -ken-nairobi, -tha-bangkok, -are-abu-dhabi,
  -vnm-hanoi, -idn-jakarta, -phl-manila, -egy-cairo, -tur-ankara for the
  first thirty-seven) per ADR-2607141700
  (cloud-itonami-compliance-fact-federation). The axis's fourth
  African entry (after Nairobi tick 92, Cape Town, Cairo tick 110).

  Abuja replaced Lagos as Nigeria's capital on 12 December 1991, a
  fully completed historical transition with no ongoing ambiguity,
  unlike Egypt/Indonesia checked earlier this session.

  amacfct.org.ng (Abuja Municipal Area Council's own portal) returned
  a DNS failure (ENOTFOUND). A candidate second law (a 2019 Act to
  establish the FCT Area Councils Service Commission, HB.975) was
  abandoned after cross-checking found news coverage describing it as
  still at bill/second-reading stage rather than confirmed enacted --
  citing it as an 'Act' would have been unverified.

  Federal Capital Territory Act (Decree No. 6 of 1976) -- title,
  decree number, and 4 February 1976 promulgation date directly
  confirmed by reading lawsofnigeria.placng.org's own hosted PDF text
  via the Read-tool saved-path fallback (WebFetch itself reported the
  PDF as illegible/binary). This is the founding-charter law that
  created the Federal Capital Territory and designated Abuja as its
  seat, matching the pattern used for other municipalities when the
  city's own domain was unreliable.

  Abuja Environmental Protection Board Act (Act No. 10 of 1997) --
  number directly confirmed via fcta.gov.ng (the official Federal
  Capital Territory Administration government domain, live and
  reachable, unlike aepb.abj.gov.ng itself which showed an account
  suspension page); the exact day/month of enactment was not
  independently confirmed via a successfully-rendered page, so
  :enacted-date is year-only rather than guessed.

  An ordinance not in this table has NO spec-basis, full stop; extend
  `catalog`, do not invent an id/url/date.")

(def catalog
  "municipality-slug -> vector of ordinance entries."
  {"abuja"
   [{:ordinance/id "abuja.decree-6-1976-federal-capital-territory-act"
     :ordinance/title "Federal Capital Territory Act (Decree No. 6 of 1976)"
     :ordinance/municipality "abuja"
     :ordinance/country "NGA"
     :ordinance/kind :local-act
     :ordinance/number "1976 No. 6"
     :ordinance/url "http://lawsofnigeria.placng.org/laws/F6.pdf"
     :ordinance/url-provenance :placng-org-legal-database
     :ordinance/enacted-date "1976-02-04"
     :ordinance/retrieved-at "2026-07-17"
     :ordinance/topic #{:governance}}
    {:ordinance/id "abuja.act-10-1997-abuja-environmental-protection-board"
     :ordinance/title "Abuja Environmental Protection Board Act"
     :ordinance/municipality "abuja"
     :ordinance/country "NGA"
     :ordinance/kind :local-act
     :ordinance/number "Act No. 10 of 1997"
     :ordinance/url "https://www.fcta.gov.ng/ova_dep/abuja-environmental-protection-board-aepb/"
     :ordinance/url-provenance :official-fcta-gov-ng
     :ordinance/enacted-date "1997"
     :ordinance/retrieved-at "2026-07-17"
     :ordinance/topic #{:environment}}]})

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
      :note (str "cloud-itonami-municipality-nga-abuja Wave 0 (ADR-2607141700): "
                 (count (get catalog "abuja")) " Abuja entries seeded "
                 "with placng.org/fcta.gov.ng citations. "
                 "Extend `ordinance.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [muni topic]
  (filterv #(contains? (:ordinance/topic %) topic) (spec-basis muni)))
