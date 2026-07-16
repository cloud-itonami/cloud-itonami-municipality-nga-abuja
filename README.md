# cloud-itonami-municipality-nga-abuja

Municipal-ordinance compliance catalog for **Abuja** — the
THIRTY-EIGHTH municipality-level entry alongside
[`cloud-itonami-municipality-jpn-tokyo`](https://github.com/cloud-itonami/cloud-itonami-municipality-jpn-tokyo),
[`cloud-itonami-municipality-usa-washington-dc`](https://github.com/cloud-itonami/cloud-itonami-municipality-usa-washington-dc),
[`cloud-itonami-municipality-gbr-london`](https://github.com/cloud-itonami/cloud-itonami-municipality-gbr-london),
[`cloud-itonami-municipality-can-toronto`](https://github.com/cloud-itonami/cloud-itonami-municipality-can-toronto),
[`cloud-itonami-municipality-deu-berlin`](https://github.com/cloud-itonami/cloud-itonami-municipality-deu-berlin),
[`cloud-itonami-municipality-fra-paris`](https://github.com/cloud-itonami/cloud-itonami-municipality-fra-paris),
[`cloud-itonami-municipality-nld-amsterdam`](https://github.com/cloud-itonami/cloud-itonami-municipality-nld-amsterdam),
[`cloud-itonami-municipality-esp-madrid`](https://github.com/cloud-itonami/cloud-itonami-municipality-esp-madrid),
[`cloud-itonami-municipality-kor-seoul`](https://github.com/cloud-itonami/cloud-itonami-municipality-kor-seoul),
[`cloud-itonami-municipality-ita-roma`](https://github.com/cloud-itonami/cloud-itonami-municipality-ita-roma),
[`cloud-itonami-municipality-aus-sydney`](https://github.com/cloud-itonami/cloud-itonami-municipality-aus-sydney),
[`cloud-itonami-municipality-arg-buenos-aires`](https://github.com/cloud-itonami/cloud-itonami-municipality-arg-buenos-aires),
[`cloud-itonami-municipality-fin-helsinki`](https://github.com/cloud-itonami/cloud-itonami-municipality-fin-helsinki),
[`cloud-itonami-municipality-dnk-copenhagen`](https://github.com/cloud-itonami/cloud-itonami-municipality-dnk-copenhagen),
[`cloud-itonami-municipality-nor-oslo`](https://github.com/cloud-itonami/cloud-itonami-municipality-nor-oslo),
[`cloud-itonami-municipality-bel-brussels`](https://github.com/cloud-itonami/cloud-itonami-municipality-bel-brussels),
[`cloud-itonami-municipality-chl-santiago`](https://github.com/cloud-itonami/cloud-itonami-municipality-chl-santiago),
[`cloud-itonami-municipality-col-bogota`](https://github.com/cloud-itonami/cloud-itonami-municipality-col-bogota),
[`cloud-itonami-municipality-cri-san-jose`](https://github.com/cloud-itonami/cloud-itonami-municipality-cri-san-jose),
[`cloud-itonami-municipality-bra-sao-paulo`](https://github.com/cloud-itonami/cloud-itonami-municipality-bra-sao-paulo),
[`cloud-itonami-municipality-ury-montevideo`](https://github.com/cloud-itonami/cloud-itonami-municipality-ury-montevideo),
[`cloud-itonami-municipality-zaf-cape-town`](https://github.com/cloud-itonami/cloud-itonami-municipality-zaf-cape-town),
[`cloud-itonami-municipality-ecu-quito`](https://github.com/cloud-itonami/cloud-itonami-municipality-ecu-quito),
[`cloud-itonami-municipality-swe-gothenburg`](https://github.com/cloud-itonami/cloud-itonami-municipality-swe-gothenburg),
[`cloud-itonami-municipality-pry-asuncion`](https://github.com/cloud-itonami/cloud-itonami-municipality-pry-asuncion),
[`cloud-itonami-municipality-mex-guadalajara`](https://github.com/cloud-itonami/cloud-itonami-municipality-mex-guadalajara),
[`cloud-itonami-municipality-fra-lyon`](https://github.com/cloud-itonami/cloud-itonami-municipality-fra-lyon),
[`cloud-itonami-municipality-ind-new-delhi`](https://github.com/cloud-itonami/cloud-itonami-municipality-ind-new-delhi),
[`cloud-itonami-municipality-pol-warsaw`](https://github.com/cloud-itonami/cloud-itonami-municipality-pol-warsaw),
[`cloud-itonami-municipality-ken-nairobi`](https://github.com/cloud-itonami/cloud-itonami-municipality-ken-nairobi),
[`cloud-itonami-municipality-tha-bangkok`](https://github.com/cloud-itonami/cloud-itonami-municipality-tha-bangkok),
[`cloud-itonami-municipality-are-abu-dhabi`](https://github.com/cloud-itonami/cloud-itonami-municipality-are-abu-dhabi),
[`cloud-itonami-municipality-vnm-hanoi`](https://github.com/cloud-itonami/cloud-itonami-municipality-vnm-hanoi),
[`cloud-itonami-municipality-idn-jakarta`](https://github.com/cloud-itonami/cloud-itonami-municipality-idn-jakarta),
[`cloud-itonami-municipality-phl-manila`](https://github.com/cloud-itonami/cloud-itonami-municipality-phl-manila),
[`cloud-itonami-municipality-egy-cairo`](https://github.com/cloud-itonami/cloud-itonami-municipality-egy-cairo),
and
[`cloud-itonami-municipality-tur-ankara`](https://github.com/cloud-itonami/cloud-itonami-municipality-tur-ankara).
Part of the [`cloud-itonami`](https://github.com/cloud-itonami)
compliance-fact family (ADR-2607141700,
`cloud-itonami-compliance-fact-federation`, in `com-junkawasaki/root`).

Abuja is the axis's fourth African entry (after Nairobi, Cape Town,
and Cairo).

## Sourcing note

Abuja replaced Lagos as Nigeria's capital on 12 December 1991, a
fully completed historical transition with no ongoing ambiguity,
unlike Egypt/Indonesia checked earlier in this project.

`amacfct.org.ng` (Abuja Municipal Area Council's own portal) returned
a DNS failure. A candidate second law (a 2019 Act to establish the
FCT Area Councils Service Commission) was abandoned after
cross-checking found news coverage describing it as still at
bill/second-reading stage rather than confirmed enacted.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on the Federal
Capital Territory Administration's behalf.

Coverage is reported honestly (see `ordinance.facts/coverage`): a
municipality not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/ordinance/facts.cljc` — the catalog, source of truth.
- `schema/ordinance.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

Both entries directly confirmed: the **Federal Capital Territory Act**
(Decree No. 6 of 1976, 4 February 1976, via lawsofnigeria.placng.org)
and the **Abuja Environmental Protection Board Act** (Act No. 10 of
1997, year-only date, via fcta.gov.ng, the official FCT Administration
government domain).

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Law text itself
remains the Federal Republic of Nigeria's; this repo stores only
citation metadata (id/title/url/dates), not full text.
