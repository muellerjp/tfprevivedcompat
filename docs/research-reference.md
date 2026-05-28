# MineColonies on TerraFirmaCraft — Research Reference

Complete research catalogue generated from the dependency graph, organised by **branch** then by **column**. Each entry lists its TFC tier, material cost, research and building prerequisites, what it unlocks, and its effect.

**Tier ladder:** T0 Stone Age · T1 Copper/Pottery · T2 Bronze · T3 Wrought Iron · T4 Steel · T5 Black Steel · T6 Red/Blue Steel.

**How to read dependencies:** *Requires research* is the parent in the tree (must be completed first). *Requires building* lists the colony buildings (and levels) that must exist; `AND` means all are needed, `(X OR Y)` means either satisfies it, `L1+` means that many total levels of a non-unique building. Effective tier is the highest of: the material cost, the University level for that column, any prerequisite building's tier, the parent research's tier, and (for Nether items) the Nether Mine.

**Totals:** 206 researches — 68 civilian, 57 combat, 77 technology, 4 unlockables.

---

## Civilian Branch

Citizen quality-of-life: health, happiness, saturation, child growth, walk speed, XP, healing, citizen cap, and the Mystical Site / Graveyard / Hospital / School / Library unlocks.

### Column 1  ·  University level 1 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Ambition** | T2 | 1 diamond | Mystical Site | Unlocks the Mystical Site building |
| **First Aid** | T1 | 8 hay | — | Citizen max health +2 |
| **Higher Learning** | T1 | 3 books | School | Unlocks the School building |
| **Keen** | T1 | 3 books | Library | Unlocks the Library building |
| **Remembrance** | T1 | 8 bones | Graveyard | Unlocks the Graveyard building |
| **Stamina** | T1 | 1 carrot | Hospital | Unlocks the Hospital building |

#### Ambition  — T2 (Bronze)

- **Cost:** 1 diamond
- **Requires research:** none (top-level)
- **Unlocks building:** Mystical Site
- **Effect:** Unlocks the Mystical Site building

#### First Aid  — T1 (Copper/Pottery)

- **Cost:** 8 hay
- **Requires research:** none (top-level)
- **Requires building:** Town Hall L1+
- **Effect:** Citizen max health +2

#### Higher Learning  — T1 (Copper/Pottery)

- **Cost:** 3 books
- **Requires research:** none (top-level)
- **Requires building:** Residence L1+
- **Unlocks building:** School
- **Effect:** Unlocks the School building

#### Keen  — T1 (Copper/Pottery)

- **Cost:** 3 books
- **Requires research:** none (top-level)
- **Requires building:** Residence L1+
- **Unlocks building:** Library
- **Effect:** Unlocks the Library building

#### Remembrance  — T1 (Copper/Pottery)

- **Cost:** 8 bones
- **Requires research:** none (top-level)
- **Requires building:** Town Hall L2
- **Unlocks building:** Graveyard
- **Effect:** Unlocks the Graveyard building

#### Stamina  — T1 (Copper/Pottery)

- **Cost:** 1 carrot
- **Requires research:** none (top-level)
- **Unlocks building:** Hospital
- **Effect:** Unlocks the Hospital building


### Column 2  ·  University level 2 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Aaaiooooiooo** | T2 | 64 tfc jungle/hanging vines | — | Citizens can climb vines |
| **Band Aid** | T2 | 1 golden carrot | — | Citizen regeneration +10% |
| **Circus** | T2 | 1 tfc:cake | — | Citizen happiness +5% |
| **Diligent** | T2 | 6 books | — | Citizen XP growth +5% |
| **First Aid II** | T2 | 16 hay | — | Citizen max health +2 |
| **Gourmand** | T2 | 32 cookies | — | Saturation gained per meal +10% |
| **Grave Decay I** | T2 | 64 rotten flesh | — | Graves take 5 more minutes to decay |
| **Haste** | T2 | 1 rabbit foot | — | Citizen walk speed +5% |
| **More Books** | T2 | 6 books | — | XP gained while studying +5% |
| **Nurture** | T2 | 32 tfc:food/cooked_chicken | — | Child growth rate +5% |
| **Outpost** | T2 | 64 tfc:food/cooked_beef | — | Max colony citizens +25 (to 50) |
| **Rails** | T3 | 64 rails - needs iron | — | Citizens use rails to move faster |
| **Resistance** | T2 | 1 golden apple | — | Healing min-saturation threshold -0.5 |
| **Resurrection Chance I** | T4 | 1 ghast tear | — | Undertaker resurrection chance +1% |
| **Scuba** | T2 | 1 ea tfc clam/mollusk/mussels | — | Citizens can stay underwater longer |
| **Undertaker Emergency** | T2 | 1 tfc bronze greaves | — | Undertaker gains the run ability |

#### Aaaiooooiooo  — T2 (Bronze)

- **Cost:** 64 tfc jungle/hanging vines
- **Requires research:** Keen
- **Requires building:** Residence L1+
- **Effect:** Citizens can climb vines

#### Band Aid  — T2 (Bronze)

- **Cost:** 1 golden carrot
- **Requires research:** Stamina
- **Requires building:** Library L1+
- **Effect:** Citizen regeneration +10%

#### Circus  — T2 (Bronze)

- **Cost:** 1 tfc:cake
- **Requires research:** First Aid
- **Requires building:** Restaurant L1+
- **Effect:** Citizen happiness +5%

#### Diligent  — T2 (Bronze)

- **Cost:** 6 books
- **Requires research:** Keen
- **Requires building:** Library L1+
- **Effect:** Citizen XP growth +5%

#### First Aid II  — T2 (Bronze)

- **Cost:** 16 hay
- **Requires research:** First Aid
- **Requires building:** Town Hall L2
- **Effect:** Citizen max health +2

#### Gourmand  — T2 (Bronze)

- **Cost:** 32 cookies
- **Requires research:** First Aid
- **Requires building:** Restaurant L1+ AND Bakery L2
- **Effect:** Saturation gained per meal +10%

#### Grave Decay I  — T2 (Bronze)

- **Cost:** 64 rotten flesh
- **Requires research:** Remembrance
- **Requires building:** Graveyard L1+
- **Effect:** Graves take 5 more minutes to decay

#### Haste  — T2 (Bronze)

- **Cost:** 1 rabbit foot
- **Requires research:** Keen
- **Requires building:** Town Hall L3
- **Effect:** Citizen walk speed +5%

#### More Books  — T2 (Bronze)

- **Cost:** 6 books
- **Requires research:** Higher Learning
- **Requires building:** School L1+
- **Effect:** XP gained while studying +5%

#### Nurture  — T2 (Bronze)

- **Cost:** 32 tfc:food/cooked_chicken
- **Requires research:** Higher Learning
- **Requires building:** School L1+
- **Effect:** Child growth rate +5%

#### Outpost  — T2 (Bronze)

- **Cost:** 64 tfc:food/cooked_beef
- **Requires research:** Keen
- **Requires building:** Residence L1+
- **Effect:** Max colony citizens +25 (to 50)

#### Rails  — T3 (Wrought Iron)

- **Cost:** 64 rails - needs iron
- **Requires research:** Keen
- **Requires building:** Courier L1+
- **Effect:** Citizens use rails to move faster

#### Resistance  — T2 (Bronze)

- **Cost:** 1 golden apple
- **Requires research:** Stamina
- **Requires building:** Restaurant L1+
- **Effect:** Healing min-saturation threshold -0.5

#### Resurrection Chance I  — T4 (Steel)

- **Cost:** 1 ghast tear
- **Requires research:** Remembrance
- **Requires building:** Graveyard L1+
- **Effect:** Undertaker resurrection chance +1%
- **Dimension:** Nether item — gated by Nether Mine L1 *(subject to revision)*

#### Scuba  — T2 (Bronze)

- **Cost:** 1 ea tfc clam/mollusk/mussels
- **Requires research:** Ambition
- **Effect:** Citizens can stay underwater longer

#### Undertaker Emergency  — T2 (Bronze)

- **Cost:** 1 tfc bronze greaves
- **Requires research:** Remembrance
- **Requires building:** Graveyard L1+
- **Effect:** Undertaker gains the run ability


### Column 3  ·  University level 3 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Bookworm** | T3 | 6 tfc:wood/bookshelf/<type> | — | XP gained while studying +5% |
| **Festival** | T3 | 9 tfc:cake | — | Citizen happiness +5% |
| **Gorger** | T3 | 64 cookies | — | Saturation gained per meal +10% |
| **Grave Decay II** | T4 | 8 nether wart blk | — | Graves take 5 more minutes to decay |
| **Hamlet** | T3 | 128 tfc:food/cooked_beef | — | Max colony citizens +50 (to 100) |
| **Healing Cream** | T3 | 8 golden carrots | — | Citizen regeneration +15% |
| **Hormones** | T3 | 64 tfc:food/cooked_chicken | — | Child growth rate +5% |
| **Lifesaver** | T3 | 32 hay | — | Citizen max health +2 |
| **Masks** | T3 | 32 white wool | — | Reduces disease transmission |
| **Night Owl** | T3 | 25 golden carrots | — | Worker day length +1 hour |
| **Nimble** | T3 | 4 rabbit feet | — | Citizen walk speed +5% |
| **Resilience** | T3 | 8 golden apples | — | Healing min-saturation threshold -0.5 |
| **Resurrection Chance II** | T4 | 16 chorus | — | Undertaker resurrection chance +2% |
| **Studious** | T3 | 12 books | — | Citizen XP growth +5% |

#### Bookworm  — T3 (Wrought Iron)

- **Cost:** 6 tfc:wood/bookshelf/<type>
- **Requires research:** More Books
- **Requires building:** School L1+
- **Effect:** XP gained while studying +5%

#### Festival  — T3 (Wrought Iron)

- **Cost:** 9 tfc:cake
- **Requires research:** Circus
- **Requires building:** Restaurant L1+
- **Effect:** Citizen happiness +5%

#### Gorger  — T3 (Wrought Iron)

- **Cost:** 64 cookies
- **Requires research:** Gourmand
- **Requires building:** Restaurant L1+
- **Effect:** Saturation gained per meal +10%

#### Grave Decay II  — T4 (Steel)

- **Cost:** 8 nether wart blk
- **Requires research:** Grave Decay I
- **Requires building:** Graveyard L1+
- **Effect:** Graves take 5 more minutes to decay
- **Dimension:** Nether item — gated by Nether Mine L1 *(subject to revision)*

#### Hamlet  — T3 (Wrought Iron)

- **Cost:** 128 tfc:food/cooked_beef
- **Requires research:** Outpost
- **Requires building:** Residence L1+
- **Effect:** Max colony citizens +50 (to 100)

#### Healing Cream  — T3 (Wrought Iron)

- **Cost:** 8 golden carrots
- **Requires research:** Band Aid
- **Requires building:** Library L1+
- **Effect:** Citizen regeneration +15%

#### Hormones  — T3 (Wrought Iron)

- **Cost:** 64 tfc:food/cooked_chicken
- **Requires research:** Nurture
- **Requires building:** School L1+
- **Effect:** Child growth rate +5%

#### Lifesaver  — T3 (Wrought Iron)

- **Cost:** 32 hay
- **Requires research:** First Aid II
- **Requires building:** Town Hall L3
- **Effect:** Citizen max health +2

#### Masks  — T3 (Wrought Iron)

- **Cost:** 32 white wool
- **Requires research:** First Aid II
- **Requires building:** Library L1+
- **Effect:** Reduces disease transmission

#### Night Owl  — T3 (Wrought Iron)

- **Cost:** 25 golden carrots
- **Requires research:** Circus
- **Requires building:** Library L1+
- **Effect:** Worker day length +1 hour

#### Nimble  — T3 (Wrought Iron)

- **Cost:** 4 rabbit feet
- **Requires research:** Haste
- **Requires building:** Town Hall L3
- **Effect:** Citizen walk speed +5%

#### Resilience  — T3 (Wrought Iron)

- **Cost:** 8 golden apples
- **Requires research:** Resistance
- **Requires building:** Restaurant L1+
- **Effect:** Healing min-saturation threshold -0.5

#### Resurrection Chance II  — T4 (Steel)

- **Cost:** 16 chorus
- **Requires research:** Resurrection Chance I
- **Requires building:** Graveyard L1+
- **Effect:** Undertaker resurrection chance +2%
- **Dimension:** End item *(subject to revision)*

#### Studious  — T3 (Wrought Iron)

- **Cost:** 12 books
- **Requires research:** Diligent
- **Requires building:** Library L1+
- **Effect:** Citizen XP growth +5%


### Column 4  ·  University level 4 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Agile** | T4 | 8 rabbit feet | — | Citizen walk speed +5% |
| **Bachelor** | T4 | 12 tfc:wood/bookshelf/<type> | — | XP gained while studying +15% |
| **Bandages** | T4 | 16 golden carrots | — | Citizen regeneration +25% |
| **Lifesaver II** | T4 | 64 hay | — | Citizen max health +2 |
| **Night Owl II** | T4 | 75 golden carrots | — | Worker day length +1 hour |
| **Puberty** | T4 | 128 tfc:food/cooked_chicken | — | Child growth rate +15% |
| **Raising The Dead** | T6 | 1 totem | — | Undertaker can use Totems of Undying to resurrect |
| **Scholarly** | T4 | 24 books | — | Citizen XP growth +15% |
| **Spectacle** | T4 | 18 tfc:cake | — | Citizen happiness +5% |
| **Stuffer** | T4 | 128 cookies | — | Saturation gained per meal +10% |
| **Vaccines** | T4 | 64 eggs | — | Citizens stay immune longer after treatment |
| **Village** | T4 | 256 tfc:food/cooked_beef | — | Max colony citizens +50 (to 150) |
| **Vitality** | T4 | 16 golden apples | — | Healing min-saturation threshold -0.5 |

#### Agile  — T4 (Steel)

- **Cost:** 8 rabbit feet
- **Requires research:** Nimble
- **Requires building:** Town Hall L4
- **Effect:** Citizen walk speed +5%

#### Bachelor  — T4 (Steel)

- **Cost:** 12 tfc:wood/bookshelf/<type>
- **Requires research:** Bookworm
- **Requires building:** Library L1+
- **Effect:** XP gained while studying +15%

#### Bandages  — T4 (Steel)

- **Cost:** 16 golden carrots
- **Requires research:** Healing Cream
- **Requires building:** Library L1+
- **Effect:** Citizen regeneration +25%

#### Lifesaver II  — T4 (Steel)

- **Cost:** 64 hay
- **Requires research:** Lifesaver
- **Requires building:** Town Hall L4
- **Effect:** Citizen max health +2

#### Night Owl II  — T4 (Steel)

- **Cost:** 75 golden carrots
- **Requires research:** Night Owl
- **Requires building:** Town Hall L3
- **Effect:** Worker day length +1 hour

#### Puberty  — T4 (Steel)

- **Cost:** 128 tfc:food/cooked_chicken
- **Requires research:** Hormones
- **Requires building:** Library L1+
- **Effect:** Child growth rate +15%

#### Raising The Dead  — T6 (Red/Blue Steel)

- **Cost:** 1 totem
- **Requires research:** Resurrection Chance II
- **Requires building:** Graveyard L1+
- **Effect:** Undertaker can use Totems of Undying to resurrect

#### Scholarly  — T4 (Steel)

- **Cost:** 24 books
- **Requires research:** Studious
- **Requires building:** Library L1+
- **Effect:** Citizen XP growth +15%

#### Spectacle  — T4 (Steel)

- **Cost:** 18 tfc:cake
- **Requires research:** Festival
- **Requires building:** Restaurant L1+
- **Effect:** Citizen happiness +5%

#### Stuffer  — T4 (Steel)

- **Cost:** 128 cookies
- **Requires research:** Gorger
- **Requires building:** Restaurant L1+
- **Effect:** Saturation gained per meal +10%

#### Vaccines  — T4 (Steel)

- **Cost:** 64 eggs
- **Requires research:** Masks
- **Requires building:** Hospital L1+
- **Effect:** Citizens stay immune longer after treatment

#### Village  — T4 (Steel)

- **Cost:** 256 tfc:food/cooked_beef
- **Requires research:** Hamlet
- **Requires building:** Town Hall L4
- **Effect:** Max colony citizens +50 (to 150)

#### Vitality  — T4 (Steel)

- **Cost:** 16 golden apples
- **Requires research:** Resilience
- **Requires building:** Restaurant L1+
- **Effect:** Healing min-saturation threshold -0.5


### Column 5  ·  University level 5 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **City** | T5 | 512 tfc:food/cooked_beef | — | Max colony citizens (up to 500) |
| **Compress** | T5 | 32 golden carrots | — | Citizen regeneration +50% |
| **Epicure** | T5 | 256 cookies | — | Saturation gained per meal +10% |
| **Fortitude** | T5 | 32 golden apples | — | Healing min-saturation threshold -0.5 |
| **Growth** | T5 | 256 tfc:food/cooked_chicken | — | Child growth rate +25% |
| **Guardian Angel** | T5 | 128 hay | — | Citizen max health +2 |
| **Master** | T5 | 24 tfc:wood/bookshelf/<type> | — | XP gained while studying +25% |
| **Opera** | T5 | 27 tfc:cake | — | Citizen happiness +5% |
| **Reflective** | T5 | 48 books | — | Citizen XP growth +25% |
| **Swift** | T5 | 32 rabbit feet | — | Citizen walk speed +5% |

#### City  — T5 (Black Steel)

- **Cost:** 512 tfc:food/cooked_beef
- **Requires research:** Village
- **Requires building:** Town Hall L5
- **Effect:** Max colony citizens (up to 500)

#### Compress  — T5 (Black Steel)

- **Cost:** 32 golden carrots
- **Requires research:** Bandages
- **Requires building:** Library L1+
- **Effect:** Citizen regeneration +50%

#### Epicure  — T5 (Black Steel)

- **Cost:** 256 cookies
- **Requires research:** Stuffer
- **Requires building:** Restaurant L1+
- **Effect:** Saturation gained per meal +10%

#### Fortitude  — T5 (Black Steel)

- **Cost:** 32 golden apples
- **Requires research:** Vitality
- **Requires building:** Restaurant L1+
- **Effect:** Healing min-saturation threshold -0.5

#### Growth  — T5 (Black Steel)

- **Cost:** 256 tfc:food/cooked_chicken
- **Requires research:** Puberty
- **Requires building:** Library L1+
- **Effect:** Child growth rate +25%

#### Guardian Angel  — T5 (Black Steel)

- **Cost:** 128 hay
- **Requires research:** Lifesaver II
- **Requires building:** Town Hall L5
- **Effect:** Citizen max health +2

#### Master  — T5 (Black Steel)

- **Cost:** 24 tfc:wood/bookshelf/<type>
- **Requires research:** Bachelor
- **Requires building:** Library L1+
- **Effect:** XP gained while studying +25%

#### Opera  — T5 (Black Steel)

- **Cost:** 27 tfc:cake
- **Requires research:** Spectacle
- **Requires building:** Restaurant L1+
- **Effect:** Citizen happiness +5%

#### Reflective  — T5 (Black Steel)

- **Cost:** 48 books
- **Requires research:** Scholarly
- **Requires building:** Library L1+
- **Effect:** Citizen XP growth +25%

#### Swift  — T5 (Black Steel)

- **Cost:** 32 rabbit feet
- **Requires research:** Agile
- **Requires building:** Town Hall L5
- **Effect:** Citizen walk speed +5%


### Column 6  ·  University level 5 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Academic** | T5 | 96 books | — | Citizen XP growth +50% |
| **Athlete** | T5 | 64 rabbit feet | — | Citizen walk speed +5% |
| **Beanstalk** | T5 | 512 tfc:food/cooked_chicken | — | Child growth rate +50% |
| **Cast** | T5 | 64 golden carrots | — | Citizen regeneration +100% |
| **Glutton** | T5 | 512 cookies | — | Saturation gained per meal +10% |
| **Guardian Angel II** | T5 | 256 hay | — | Citizen max health +10 |
| **Indefatigability** | T5 | 64 golden apples | — | Healing min-saturation threshold -3 |
| **PhD** | T5 | 48 tfc:wood/bookshelf/<type> | — | XP gained while studying +50% |
| **Theater** | T6 | 16 ench golden apples | — | Citizen happiness +10% |

#### Academic  — T5 (Black Steel)

- **Cost:** 96 books
- **Requires research:** Reflective
- **Effect:** Citizen XP growth +50%

#### Athlete  — T5 (Black Steel)

- **Cost:** 64 rabbit feet
- **Requires research:** Swift
- **Effect:** Citizen walk speed +5%

#### Beanstalk  — T5 (Black Steel)

- **Cost:** 512 tfc:food/cooked_chicken
- **Requires research:** Growth
- **Effect:** Child growth rate +50%

#### Cast  — T5 (Black Steel)

- **Cost:** 64 golden carrots
- **Requires research:** Compress
- **Effect:** Citizen regeneration +100%

#### Glutton  — T5 (Black Steel)

- **Cost:** 512 cookies
- **Requires research:** Epicure
- **Effect:** Saturation gained per meal +10%

#### Guardian Angel II  — T5 (Black Steel)

- **Cost:** 256 hay
- **Requires research:** Guardian Angel
- **Effect:** Citizen max health +10

#### Indefatigability  — T5 (Black Steel)

- **Cost:** 64 golden apples
- **Requires research:** Fortitude
- **Effect:** Healing min-saturation threshold -3

#### PhD  — T5 (Black Steel)

- **Cost:** 48 tfc:wood/bookshelf/<type>
- **Requires research:** Master
- **Effect:** XP gained while studying +50%

#### Theater  — T6 (Red/Blue Steel)

- **Cost:** 16 ench golden apples
- **Requires research:** Opera
- **Effect:** Citizen happiness +10%


---

## Combat Branch

Guard and military progression: damage, armour, shields, archery, the flee line, and the Barracks / Archery / Combat Academy unlocks.

### Column 1  ·  University level 1 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Accuracy** | T2 | 16 tfc bronze ingots | — | Guards gain a chance to land critical hits |
| **Avoidance** | T2 | 3 tfc bronze blocks | — | Knights can use shields to block |
| **Improved Leather** | T1 | 32 leather | — | Guard armor durability +10% |
| **Tactic Training** | T2 | 3 tfc bronze blocks | Barracks | Unlocks the Barracks building |
| **Taunt** | T1 | 8 flesh/bone/eye | — | Knights can force mobs to target them |

#### Accuracy  — T2 (Bronze)

- **Cost:** 16 tfc bronze ingots
- **Requires research:** none (top-level)
- **Requires building:** Guard Tower L1+
- **Effect:** Guards gain a chance to land critical hits

#### Avoidance  — T2 (Bronze)

- **Cost:** 3 tfc bronze blocks
- **Requires research:** none (top-level)
- **Requires building:** Guard Tower L1+
- **Effect:** Knights can use shields to block

#### Improved Leather  — T1 (Copper/Pottery)

- **Cost:** 32 leather
- **Requires research:** none (top-level)
- **Requires building:** Town Hall L1+
- **Effect:** Guard armor durability +10%

#### Tactic Training  — T2 (Bronze)

- **Cost:** 3 tfc bronze blocks
- **Requires research:** none (top-level)
- **Requires building:** Guard Tower L1+
- **Unlocks building:** Barracks
- **Effect:** Unlocks the Barracks building

#### Taunt  — T1 (Copper/Pottery)

- **Cost:** 8 flesh/bone/eye
- **Requires research:** none (top-level)
- **Requires building:** Guard Tower L1+
- **Effect:** Knights can force mobs to target them


### Column 2  ·  University level 2 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Boiled Leather** | T2 | 64 leather | — | Guard armor durability +10% |
| **Coffee** | T2 | 4 golden carrots | — | Guards need less sleep |
| **Consume Arrows** | T2 | 64 arrows | — | Archers consume arrows for +2 damage |
| **Dodge** | T2 | 16 leather | — | Archer armor +5% |
| **Improved Bows** | T3 | 6 tfc:metal/block/wrought_iron | Archery | Unlocks the Archery building |
| **Improved Swords** | T3 | 6 tfc:metal/block/wrought_iron | Combat Academy | Unlocks the Combat Academy building |
| **Parry** | T3 | 16 tfc:metal/ingot/wrought_iron | — | Knight armor +5% |
| **Precise Shot** | T2 | 16 flint | — | Archer damage +0.5 |
| **Quick Draw** | T3 | 2 tfc:metal/block/wrought_iron | — | Knight damage +0.5 |
| **Regeneration** | T2 | 1 tfc:gem/emerald | — | Guards flee below 20% health |

#### Boiled Leather  — T2 (Bronze)

- **Cost:** 64 leather
- **Requires research:** Improved Leather
- **Requires building:** Town Hall L2
- **Effect:** Guard armor durability +10%

#### Coffee  — T2 (Bronze)

- **Cost:** 4 golden carrots
- **Requires research:** Tactic Training
- **Effect:** Guards need less sleep

#### Consume Arrows  — T2 (Bronze)

- **Cost:** 64 arrows
- **Requires research:** Taunt
- **Requires building:** Guard Tower L1+
- **Effect:** Archers consume arrows for +2 damage

#### Dodge  — T2 (Bronze)

- **Cost:** 16 leather
- **Requires research:** Avoidance
- **Requires building:** Smeltery L1+
- **Effect:** Archer armor +5%

#### Improved Bows  — T3 (Wrought Iron)

- **Cost:** 6 tfc:metal/block/wrought_iron
- **Requires research:** Tactic Training
- **Requires building:** Barracks L1+
- **Unlocks building:** Archery
- **Effect:** Unlocks the Archery building

#### Improved Swords  — T3 (Wrought Iron)

- **Cost:** 6 tfc:metal/block/wrought_iron
- **Requires research:** Tactic Training
- **Requires building:** Barracks L1+
- **Unlocks building:** Combat Academy
- **Effect:** Unlocks the Combat Academy building

#### Parry  — T3 (Wrought Iron)

- **Cost:** 16 tfc:metal/ingot/wrought_iron
- **Requires research:** Avoidance
- **Requires building:** Smeltery L1+
- **Effect:** Knight armor +5%

#### Precise Shot  — T2 (Bronze)

- **Cost:** 16 flint
- **Requires research:** Accuracy
- **Requires building:** Barracks L1+
- **Effect:** Archer damage +0.5

#### Quick Draw  — T3 (Wrought Iron)

- **Cost:** 2 tfc:metal/block/wrought_iron
- **Requires research:** Accuracy
- **Requires building:** Barracks L1+
- **Effect:** Knight damage +0.5

#### Regeneration  — T2 (Bronze)

- **Cost:** 1 tfc:gem/emerald
- **Requires research:** Improved Leather
- **Requires building:** Guard Tower L1+
- **Effect:** Guards flee below 20% health


### Column 3  ·  University level 3 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Arrow Piercing** | T3 | 64 arrow/redstone | — | Archers gain Piercing II |
| **Avoid** | T3 | 8 tfc:gem/emerald | — | Fleeing guards gain Swiftness |
| **Feint** | T3 | 8 tfc:gem/emerald | — | Guards take -20% damage while fleeing |
| **Improved Dodge** | T3 | 32 leather | — | Archer armor +5% |
| **Iron Skin** | T3 | 16 tfc:metal/ingot/wrought_iron | — | Guard armor durability +10% |
| **Panoramix** | T3 | 64 mistletoe | — | Druids request magic potions for new abilities |
| **Penetrating Shot** | T3 | 32 flint | — | Archer damage +0.5 |
| **Power Attack** | T3 | 4 tfc:metal/block/wrought_iron | — | Knight damage +0.5 |
| **Riposte** | T3 | 32 tfc:metal/ingot/wrought_iron | — | Knight armor +5% |
| **Squire Training** | T3 | 4 tfc:metal/shield/wrought_iron | — | Knight shield-block chance +5% |
| **Trick Shot** | T3 | 5 bows | — | Archer multishot +5% |

#### Arrow Piercing  — T3 (Wrought Iron)

- **Cost:** 64 arrow/redstone
- **Requires research:** Consume Arrows
- **Requires building:** Archery L1+
- **Effect:** Archers gain Piercing II

#### Avoid  — T3 (Wrought Iron)

- **Cost:** 8 tfc:gem/emerald
- **Requires research:** Regeneration
- **Requires building:** Guard Tower L1+
- **Effect:** Fleeing guards gain Swiftness

#### Feint  — T3 (Wrought Iron)

- **Cost:** 8 tfc:gem/emerald
- **Requires research:** Regeneration
- **Requires building:** Guard Tower L1+
- **Effect:** Guards take -20% damage while fleeing

#### Improved Dodge  — T3 (Wrought Iron)

- **Cost:** 32 leather
- **Requires research:** Dodge
- **Requires building:** Archery L1+
- **Effect:** Archer armor +5%

#### Iron Skin  — T3 (Wrought Iron)

- **Cost:** 16 tfc:metal/ingot/wrought_iron
- **Requires research:** Boiled Leather
- **Requires building:** Town Hall L3
- **Effect:** Guard armor durability +10%

#### Panoramix  — T3 (Wrought Iron)

- **Cost:** 64 mistletoe
- **Requires research:** Consume Arrows
- **Requires building:** Barracks L1+
- **Effect:** Druids request magic potions for new abilities

#### Penetrating Shot  — T3 (Wrought Iron)

- **Cost:** 32 flint
- **Requires research:** Precise Shot
- **Requires building:** Archery L1+
- **Effect:** Archer damage +0.5

#### Power Attack  — T3 (Wrought Iron)

- **Cost:** 4 tfc:metal/block/wrought_iron
- **Requires research:** Quick Draw
- **Requires building:** Combat Academy L1+
- **Effect:** Knight damage +0.5

#### Riposte  — T3 (Wrought Iron)

- **Cost:** 32 tfc:metal/ingot/wrought_iron
- **Requires research:** Parry
- **Requires building:** Combat Academy L1+
- **Effect:** Knight armor +5%

#### Squire Training  — T3 (Wrought Iron)

- **Cost:** 4 tfc:metal/shield/wrought_iron
- **Requires research:** Improved Swords
- **Requires building:** Combat Academy L1+
- **Effect:** Knight shield-block chance +5%

#### Trick Shot  — T3 (Wrought Iron)

- **Cost:** 5 bows
- **Requires research:** Improved Bows
- **Requires building:** Archery L1+
- **Effect:** Archer multishot +5%


### Column 4  ·  University level 4 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Cleave** | T4 | 8 tfc:metal/block/steel | — | Knight damage +0.5 |
| **Duelist** | T4 | 64 tfc:metal/ingot/steel | — | Knight armor +15% |
| **Evade** | T4 | 16 tfc:gem/emerald | — | Fleeing guards gain Swiftness |
| **Evasion** | T4 | 64 leather | — | Archer armor +15% |
| **Fear** | T4 | 16 tfc:gem/emerald | — | Guards take -20% damage while fleeing |
| **Iron Armor** | T4 | 32 tfc:metal/ingot/steel | — | Guard armor durability +10% |
| **Knight Training** | T4 | 4 tfc:metal/shield/steel | — | Knight shield-block chance +5% |
| **Multishot** | T4 | 9 bows | — | Archer multishot +5% |
| **Piercing Shot** | T4 | 64 flint | — | Archer damage +0.5 |
| **Telescope** | T4 | 16 tfc:gem/emerald | — | Increases rallying banner range |
| **Whirlwind** | T4 | 64 redstone/64 tfc:metal/ingot/gold/128 tfc:gem/lapis_lazuli | — | Knights learn a knockback special attack |

#### Cleave  — T4 (Steel)

- **Cost:** 8 tfc:metal/block/steel
- **Requires research:** Power Attack
- **Requires building:** Guard Tower L1+
- **Effect:** Knight damage +0.5

#### Duelist  — T4 (Steel)

- **Cost:** 64 tfc:metal/ingot/steel
- **Requires research:** Riposte
- **Requires building:** Smeltery L1+
- **Effect:** Knight armor +15%

#### Evade  — T4 (Steel)

- **Cost:** 16 tfc:gem/emerald
- **Requires research:** Avoid
- **Requires building:** Guard Tower L1+
- **Effect:** Fleeing guards gain Swiftness

#### Evasion  — T4 (Steel)

- **Cost:** 64 leather
- **Requires research:** Improved Dodge
- **Requires building:** Smeltery L1+
- **Effect:** Archer armor +15%

#### Fear  — T4 (Steel)

- **Cost:** 16 tfc:gem/emerald
- **Requires research:** Feint
- **Requires building:** Guard Tower L1+
- **Effect:** Guards take -20% damage while fleeing

#### Iron Armor  — T4 (Steel)

- **Cost:** 32 tfc:metal/ingot/steel
- **Requires research:** Iron Skin
- **Requires building:** Town Hall L4
- **Effect:** Guard armor durability +10%

#### Knight Training  — T4 (Steel)

- **Cost:** 4 tfc:metal/shield/steel
- **Requires research:** Squire Training
- **Requires building:** Combat Academy L1+
- **Effect:** Knight shield-block chance +5%

#### Multishot  — T4 (Steel)

- **Cost:** 9 bows
- **Requires research:** Trick Shot
- **Requires building:** Archery L1+
- **Effect:** Archer multishot +5%

#### Piercing Shot  — T4 (Steel)

- **Cost:** 64 flint
- **Requires research:** Penetrating Shot
- **Requires building:** Guard Tower L1+
- **Effect:** Archer damage +0.5

#### Telescope  — T4 (Steel)

- **Cost:** 16 tfc:gem/emerald
- **Requires research:** Iron Skin
- **Requires building:** Barracks L1+
- **Effect:** Increases rallying banner range

#### Whirlwind  — T4 (Steel)

- **Cost:** 64 redstone/64 tfc:metal/ingot/gold/128 tfc:gem/lapis_lazuli
- **Requires research:** Arrow Piercing
- **Requires building:** Barracks L1+
- **Effect:** Knights learn a knockback special attack


### Column 5  ·  University level 5 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Captain Training** | T5 | 4 tfc:metal/shield/black_steel | — | Knight shield-block chance +15% |
| **Flee** | T5 | 32 tfc:gem/emerald | — | Fleeing guards gain Swiftness |
| **Improved Evasion** | T5 | 16 tfc:gem/diamond | — | Archer armor +25% |
| **Mighty Cleave** | T5 | 16 tfc:metal/block/black_steel | — | Knight damage +0.5 |
| **Plate Armor** | T5 | 32 tfc:metal/ingot/black_steel | — | Blacksmith learns Plate Armor recipes |
| **Provost** | T5 | 16 tfc:gem/diamond | — | Knight armor +25% |
| **Rapid Shot** | T5 | 18 bows | — | Archer multishot +15% |
| **Retreat** | T5 | 32 tfc:gem/emerald | — | Guards take -20% damage while fleeing |
| **Standard** | T5 | 32 tfc:gem/emerald | — | Place a Rallying Banner at a location |
| **Steel Armor** | T5 | 64 tfc:metal/ingot/black_steel | — | Guard armor durability +10% |
| **Wounding Shot** | T5 | 128 flint | — | Archer damage +0.5 |

#### Captain Training  — T5 (Black Steel)

- **Cost:** 4 tfc:metal/shield/black_steel
- **Requires research:** Knight Training
- **Requires building:** Combat Academy L1+
- **Effect:** Knight shield-block chance +15%

#### Flee  — T5 (Black Steel)

- **Cost:** 32 tfc:gem/emerald
- **Requires research:** Evade
- **Requires building:** Guard Tower L1+
- **Effect:** Fleeing guards gain Swiftness

#### Improved Evasion  — T5 (Black Steel)

- **Cost:** 16 tfc:gem/diamond
- **Requires research:** Evasion
- **Requires building:** Archery L1+
- **Effect:** Archer armor +25%

#### Mighty Cleave  — T5 (Black Steel)

- **Cost:** 16 tfc:metal/block/black_steel
- **Requires research:** Cleave
- **Requires building:** Barracks L1+
- **Effect:** Knight damage +0.5

#### Plate Armor  — T5 (Black Steel)

- **Cost:** 32 tfc:metal/ingot/black_steel
- **Requires research:** Iron Armor
- **Requires building:** Blacksmith L1+
- **Effect:** Blacksmith learns Plate Armor recipes

#### Provost  — T5 (Black Steel)

- **Cost:** 16 tfc:gem/diamond
- **Requires research:** Duelist
- **Requires building:** Combat Academy L1+
- **Effect:** Knight armor +25%

#### Rapid Shot  — T5 (Black Steel)

- **Cost:** 18 bows
- **Requires research:** Multishot
- **Requires building:** Archery L1+
- **Effect:** Archer multishot +15%

#### Retreat  — T5 (Black Steel)

- **Cost:** 32 tfc:gem/emerald
- **Requires research:** Fear
- **Requires building:** Guard Tower L1+
- **Effect:** Guards take -20% damage while fleeing

#### Standard  — T5 (Black Steel)

- **Cost:** 32 tfc:gem/emerald
- **Requires research:** Telescope
- **Requires building:** Barracks L1+
- **Effect:** Place a Rallying Banner at a location

#### Steel Armor  — T5 (Black Steel)

- **Cost:** 64 tfc:metal/ingot/black_steel
- **Requires research:** Iron Armor
- **Requires building:** Town Hall L5
- **Effect:** Guard armor durability +10%

#### Wounding Shot  — T5 (Black Steel)

- **Cost:** 128 flint
- **Requires research:** Piercing Shot
- **Requires building:** Barracks L1+
- **Effect:** Archer damage +0.5


### Column 6  ·  University level 5 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Agile Archer** | T5 | 64 tfc:gem/diamond | — | Archer armor +50% |
| **Captain of the Guard** | T5 | 8 tfc:metal/shield/black_steel | — | Knight shield-block chance +25% |
| **Deadly Aim** | T5 | 256 flint | — | Archer damage +2 |
| **Diamond Skin** | T5 | 64 tfc:gem/diamond | — | Guard armor durability +50% |
| **Full Retreat** | T5 | 64 tfc:gem/emerald | — | Guards take -20% damage while fleeing |
| **Hotfoot** | T5 | 64 tfc:gem/emerald | — | Fleeing guards gain Swiftness |
| **Master Bowman** | T5 | 27 bows | — | Archer multishot +25% |
| **Master Swordsman** | T5 | 64 tfc:gem/diamond | — | Knight armor +50% |
| **Savage Strike** | T5 | 32 tfc:metal/block/black_steel | — | Knight damage +2 |

#### Agile Archer  — T5 (Black Steel)

- **Cost:** 64 tfc:gem/diamond
- **Requires research:** Improved Evasion
- **Effect:** Archer armor +50%

#### Captain of the Guard  — T5 (Black Steel)

- **Cost:** 8 tfc:metal/shield/black_steel
- **Requires research:** Captain Training
- **Effect:** Knight shield-block chance +25%

#### Deadly Aim  — T5 (Black Steel)

- **Cost:** 256 flint
- **Requires research:** Wounding Shot
- **Effect:** Archer damage +2

#### Diamond Skin  — T5 (Black Steel)

- **Cost:** 64 tfc:gem/diamond
- **Requires research:** Steel Armor
- **Effect:** Guard armor durability +50%

#### Full Retreat  — T5 (Black Steel)

- **Cost:** 64 tfc:gem/emerald
- **Requires research:** Retreat
- **Effect:** Guards take -20% damage while fleeing

#### Hotfoot  — T5 (Black Steel)

- **Cost:** 64 tfc:gem/emerald
- **Requires research:** Flee
- **Effect:** Fleeing guards gain Swiftness

#### Master Bowman  — T5 (Black Steel)

- **Cost:** 27 bows
- **Requires research:** Rapid Shot
- **Effect:** Archer multishot +25%

#### Master Swordsman  — T5 (Black Steel)

- **Cost:** 64 tfc:gem/diamond
- **Requires research:** Provost
- **Effect:** Knight armor +50%

#### Savage Strike  — T5 (Black Steel)

- **Cost:** 32 tfc:metal/block/black_steel
- **Requires research:** Mighty Cleave
- **Effect:** Knight damage +2


---

## Technology Branch

Industry and infrastructure: most building unlocks (Blacksmith, Smeltery, Stonemason, Sawmill, Crusher, Sifter, Fletcher, Brickyard, Glassblower, Mechanic, Composter, Plantation, Dyer, Flower Shop, Concrete Mixer, Nether Mine, Alchemist Lab) plus mining, farming, recipe, tool, block-speed and inventory lines.

### Column 1  ·  University level 1 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Biodegradable** | T1 | 64 bone meal | Composter | Unlocks the Composter building |
| **Hitting Iron!** | T2 | 1 tfc bronze anvil | Blacksmith | Unlocks the Blacksmith building |
| **Hot!** | T1 | 64 tfc:powder/flux | Smeltery | Unlocks the Smeltery building |
| **More Scrolls** | T2 | 64 paper/1 ancient tome/64 tfc:gem/lapis_lazuli | — | Enchanter learns scroll recipes (locate workers, summon guards) |
| **Soft Shoes** | T1 | 16 wool/feather | — | Farmers no longer trample crops |
| **Stone Cake** | T1 | 64 c:stone/smooth | Stonemason | Unlocks the Stonemason building |
| **Woodwork** | T1 | 64 tfc:wood/planks/<type> | Sawmill | Unlocks the Sawmill building |

#### Biodegradable  — T1 (Copper/Pottery)

- **Cost:** 64 bone meal
- **Requires research:** none (top-level)
- **Requires building:** Farmer L1+
- **Unlocks building:** Composter
- **Effect:** Unlocks the Composter building

#### Hitting Iron!  — T2 (Bronze)

- **Cost:** 1 tfc bronze anvil
- **Requires research:** none (top-level)
- **Requires building:** Mine L1+
- **Unlocks building:** Blacksmith
- **Effect:** Unlocks the Blacksmith building

#### Hot!  — T1 (Copper/Pottery)

- **Cost:** 64 tfc:powder/flux
- **Requires research:** none (top-level)
- **Requires building:** Mine L1+
- **Unlocks building:** Smeltery
- **Effect:** Unlocks the Smeltery building

#### More Scrolls  — T2 (Bronze)

- **Cost:** 64 paper/1 ancient tome/64 tfc:gem/lapis_lazuli
- **Requires research:** none (top-level)
- **Requires building:** Enchanter Tower L1+
- **Effect:** Enchanter learns scroll recipes (locate workers, summon guards)

#### Soft Shoes  — T1 (Copper/Pottery)

- **Cost:** 16 wool/feather
- **Requires research:** none (top-level)
- **Effect:** Farmers no longer trample crops

#### Stone Cake  — T1 (Copper/Pottery)

- **Cost:** 64 c:stone/smooth
- **Requires research:** none (top-level)
- **Requires building:** Mine L1+
- **Unlocks building:** Stonemason
- **Effect:** Unlocks the Stonemason building

#### Woodwork  — T1 (Copper/Pottery)

- **Cost:** 64 tfc:wood/planks/<type>
- **Requires research:** none (top-level)
- **Requires building:** Forester L1+
- **Unlocks building:** Sawmill
- **Effect:** Unlocks the Sawmill building


### Column 2  ·  University level 2 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Ability** | T2 | 64 tfc bronze ingots | — | Citizen block-place speed +10% |
| **Bonemeal** | T2 | 64 c:seeds | — | Farmers harvest +10% crops |
| **Flower Power** | T2 | 64 compost | Flower Shop | Unlocks the Flower Shop building |
| **Green Revolution** | T2 | 32 compost | — | Crops grow outward in offshoots |
| **Is This Redstone?** | T2 | 128 redstone | — | Citizen block-break speed +10% |
| **Let It Grow** | T2 | 16 compost | Plantation | Unlocks the Plantation building |
| **Memory Aid** | T2 | 32 paper | — | Workers can learn +25% more recipes |
| **Open the Nether** | T2 | 6 tfc:metal/block/gold | Nether Mine | Unlocks the Nether Mine building |
| **Podzol Chance** | T2 | 8 minecolonies:composted_dirt | — | Composters produce +100% more podzol |
| **Professional Assistant** | T2 | 2 tfc bronze blocks | — | Blacksmith learns advanced Builder hammer recipes |
| **Rainbow Heaven** | T2 | 64 tfc:plant/poppy | Dyer | Unlocks the Dyer building |
| **Rocking Roll** | T2 | 64 c:stone | Crusher | Unlocks the Crusher building |
| **Sieving** | T2 | 64 string | Sifter | Unlocks the Sifter building |
| **Skilled Butcher** | T2 | 1 tfc bronze axe/1 ench book/1 tfc bronze anvil | — | Herders gain Looting I |
| **Stringwork** | T2 | 16 string | Fletcher | Unlocks the Fletcher building |
| **Strong** | T2 | 8 tfc:gem/diamond | — | Citizen tool durability +5% |
| **The Flintstones** | T2 | 64 tfc mud bricks | Brickyard | Unlocks the Brickyard building |
| **Those Lungs!** | T2 | 64 glass | Glassblower | Unlocks the Glassblower building |
| **Veinminer** | T2 | 32 c:ores/poor | — | Miners find +10% more ores |
| **What ya Need?** | T2 | 64 redstone | Mechanic | Unlocks the Mechanic building |

#### Ability  — T2 (Bronze)

- **Cost:** 64 tfc bronze ingots
- **Requires research:** Hitting Iron!
- **Requires building:** Mine L1+
- **Effect:** Citizen block-place speed +10%

#### Bonemeal  — T2 (Bronze)

- **Cost:** 64 c:seeds
- **Requires research:** Biodegradable
- **Requires building:** (Farmer L1+ OR Composter L1+)
- **Effect:** Farmers harvest +10% crops

#### Flower Power  — T2 (Bronze)

- **Cost:** 64 compost
- **Requires research:** Biodegradable
- **Requires building:** Composter L1+
- **Unlocks building:** Flower Shop
- **Effect:** Unlocks the Flower Shop building

#### Green Revolution  — T2 (Bronze)

- **Cost:** 32 compost
- **Requires research:** Biodegradable
- **Requires building:** Farmer L1+
- **Effect:** Crops grow outward in offshoots

#### Is This Redstone?  — T2 (Bronze)

- **Cost:** 128 redstone
- **Requires research:** Hot!
- **Effect:** Citizen block-break speed +10%

#### Let It Grow  — T2 (Bronze)

- **Cost:** 16 compost
- **Requires research:** Biodegradable
- **Requires building:** Farmer L1+
- **Unlocks building:** Plantation
- **Effect:** Unlocks the Plantation building

#### Memory Aid  — T2 (Bronze)

- **Cost:** 32 paper
- **Requires research:** Woodwork
- **Requires building:** Sawmill L1+
- **Effect:** Workers can learn +25% more recipes

#### Open the Nether  — T2 (Bronze)

- **Cost:** 6 tfc:metal/block/gold
- **Requires research:** More Scrolls
- **Unlocks building:** Nether Mine
- **Effect:** Unlocks the Nether Mine building
- **Dimension:** Nether access bootstrap — grants the Nether Mine *(subject to revision)*

#### Podzol Chance  — T2 (Bronze)

- **Cost:** 8 minecolonies:composted_dirt
- **Requires research:** Biodegradable
- **Requires building:** Composter L1+
- **Effect:** Composters produce +100% more podzol

#### Professional Assistant  — T2 (Bronze)

- **Cost:** 2 tfc bronze blocks
- **Requires research:** Hitting Iron!
- **Requires building:** Blacksmith L1+
- **Effect:** Blacksmith learns advanced Builder hammer recipes

#### Rainbow Heaven  — T2 (Bronze)

- **Cost:** 64 tfc:plant/poppy
- **Requires research:** Biodegradable
- **Requires building:** Composter L1+
- **Unlocks building:** Dyer
- **Effect:** Unlocks the Dyer building

#### Rocking Roll  — T2 (Bronze)

- **Cost:** 64 c:stone
- **Requires research:** Stone Cake
- **Requires building:** Stonemason L1+
- **Unlocks building:** Crusher
- **Effect:** Unlocks the Crusher building

#### Sieving  — T2 (Bronze)

- **Cost:** 64 string
- **Requires research:** Woodwork
- **Requires building:** Fisher L1+
- **Unlocks building:** Sifter
- **Effect:** Unlocks the Sifter building

#### Skilled Butcher  — T2 (Bronze)

- **Cost:** 1 tfc bronze axe/1 ench book/1 tfc bronze anvil
- **Requires research:** Biodegradable
- **Requires building:** Enchanter Tower L1+ AND Blacksmith L1+
- **Effect:** Herders gain Looting I

#### Stringwork  — T2 (Bronze)

- **Cost:** 16 string
- **Requires research:** Woodwork
- **Requires building:** Sawmill L1+
- **Unlocks building:** Fletcher
- **Effect:** Unlocks the Fletcher building

#### Strong  — T2 (Bronze)

- **Cost:** 8 tfc:gem/diamond
- **Requires research:** Hitting Iron!
- **Requires building:** Blacksmith L1+
- **Effect:** Citizen tool durability +5%

#### The Flintstones  — T2 (Bronze)

- **Cost:** 64 tfc mud bricks
- **Requires research:** Stone Cake
- **Requires building:** Stonemason L1+
- **Unlocks building:** Brickyard
- **Effect:** Unlocks the Brickyard building

#### Those Lungs!  — T2 (Bronze)

- **Cost:** 64 glass
- **Requires research:** Hot!
- **Requires building:** Smeltery L1+
- **Unlocks building:** Glassblower
- **Effect:** Unlocks the Glassblower building

#### Veinminer  — T2 (Bronze)

- **Cost:** 32 c:ores/poor
- **Requires research:** Hitting Iron!
- **Requires building:** Mine L1+
- **Effect:** Miners find +10% more ores

#### What ya Need?  — T2 (Bronze)

- **Cost:** 64 redstone
- **Requires research:** Hitting Iron!
- **Requires building:** Blacksmith L1+
- **Unlocks building:** Mechanic
- **Effect:** Unlocks the Mechanic building


### Column 3  ·  University level 3 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Builder Modes** | T3 | 1 tfc bronze axe | — | Builder gains additional build modes |
| **Cheat Sheet** | T3 | 64 paper | — | Workers can learn +25% more recipes |
| **Crop Rotation** | T3 | 32 tfc:food/sugarcane/32 tfc barrel_cactus or silken_pincushion_cactus | — | Plantations unlock Sugar Cane and Cactus fields |
| **Dung** | T3 | 128 c:seeds | — | Farmers harvest +15% crops |
| **Enhanced Gates I** | T4 | 64 wooden gate/2 ancient tome/5 tfc:metal/block/wrought_iron | — | Gates gain +100% raider swarm resistance |
| **Exotic Fruits** | T3 | 32 glow berries | — | Plantations unlock the Glowberry field |
| **Gaze into the Pits** | T4 | eye of ender/tome | — | Adds an Expedition Log to the Nether Mine |
| **Gilded Hammer** | T3 | 64 c:gravels/64 c:sands/64 clay | — | Crushers gain additional crushing recipes |
| **Good Veins** | T3 | 64 c:ores/normal | — | Miners find +15% more ores |
| **Hardened** | T3 | 16 tfc:gem/diamond | — | Citizen tool durability +15% |
| **Honey Pot** | T3 | 16 beehive | — | Beekeepers harvest honey bottles and combs together |
| **Hot Boots** | T3 | 32 leather/16 tfc:metal/ingot/wrought_iron | — | Guards become immune to fire/lava damage |
| **Jungle Master** | T3 | 16 cocoa beans/16 tfc jungle/hanging vines | — | Plantations unlock Cocoa and Vines fields |
| **Know the End** | T3 | 64 chorus fruit | — | Stonemason learns Endstone; Bakers learn Chorus Bread |
| **Knowledge of the Depth** | T3 | 64 tfc:rock/raw/tuff | — | Miners gain a chance for double ore drops |
| **Magic Potions** | T4 | 16 nether wart | Alchemist Lab | Unlocks the Alchemist Laboratory building |
| **Minimum Order Quantity** | T3 | clipboard/book | — | Buildings wait longer before placing orders |
| **Pave the Road** | T3 | 32 concrete | Concrete Mixer | Unlocks the Concrete Mixer building |
| **Podzol Chance II** | T3 | 32 podzol | — | Composters produce +100% more podzol |
| **Redstone Powered** | T3 | 256 redstone | — | Citizen block-break speed +25% |
| **Skills** | T3 | 128 tfc:metal/ingot/wrought_iron | — | Citizen block-place speed +15% |
| **Space** | T3 | 16 rack | — | Buildings can minimum-stock 50% more |
| **Taking Diving Lessons** | T3 | 16 tfc kelp/16 tfc:sea_pickle/16 tfc:tide_pool_blocks | — | Plantations unlock Kelp, Sea Pickle and Tide-pool fields |
| **Warehouse Master** | T3 | 3 rack | — | Recipes can be selected based on warehouse stock |

#### Builder Modes  — T3 (Wrought Iron)

- **Cost:** 1 tfc bronze axe
- **Requires research:** Memory Aid
- **Requires building:** Builder L1+
- **Effect:** Builder gains additional build modes

#### Cheat Sheet  — T3 (Wrought Iron)

- **Cost:** 64 paper
- **Requires research:** Memory Aid
- **Requires building:** Sawmill L1+
- **Effect:** Workers can learn +25% more recipes

#### Crop Rotation  — T3 (Wrought Iron)

- **Cost:** 32 tfc:food/sugarcane/32 tfc barrel_cactus or silken_pincushion_cactus
- **Requires research:** Let It Grow
- **Requires building:** Plantation L1+
- **Effect:** Plantations unlock Sugar Cane and Cactus fields

#### Dung  — T3 (Wrought Iron)

- **Cost:** 128 c:seeds
- **Requires research:** Bonemeal
- **Requires building:** (Farmer L1+ OR Composter L1+)
- **Effect:** Farmers harvest +15% crops

#### Enhanced Gates I  — T4 (Steel)

- **Cost:** 64 wooden gate/2 ancient tome/5 tfc:metal/block/wrought_iron
- **Requires research:** What ya Need?
- **Requires building:** Mechanic L1+
- **Effect:** Gates gain +100% raider swarm resistance

#### Exotic Fruits  — T3 (Wrought Iron)

- **Cost:** 32 glow berries
- **Requires research:** Let It Grow
- **Requires building:** Plantation L1+
- **Effect:** Plantations unlock the Glowberry field

#### Gaze into the Pits  — T4 (Steel)

- **Cost:** eye of ender/tome
- **Requires research:** Open the Nether
- **Requires building:** Nether Mine L1+
- **Effect:** Adds an Expedition Log to the Nether Mine
- **Dimension:** Nether item — gated by Nether Mine L1 *(subject to revision)*

#### Gilded Hammer  — T3 (Wrought Iron)

- **Cost:** 64 c:gravels/64 c:sands/64 clay
- **Requires research:** Rocking Roll
- **Requires building:** Crusher L1+
- **Effect:** Crushers gain additional crushing recipes

#### Good Veins  — T3 (Wrought Iron)

- **Cost:** 64 c:ores/normal
- **Requires research:** Veinminer
- **Requires building:** Mine L1+
- **Effect:** Miners find +15% more ores

#### Hardened  — T3 (Wrought Iron)

- **Cost:** 16 tfc:gem/diamond
- **Requires research:** Strong
- **Requires building:** Blacksmith L1+
- **Effect:** Citizen tool durability +15%

#### Honey Pot  — T3 (Wrought Iron)

- **Cost:** 16 beehive
- **Requires research:** Rainbow Heaven
- **Requires building:** Apiary L1+
- **Effect:** Beekeepers harvest honey bottles and combs together

#### Hot Boots  — T3 (Wrought Iron)

- **Cost:** 32 leather/16 tfc:metal/ingot/wrought_iron
- **Requires research:** Stringwork
- **Requires building:** Fletcher L1+
- **Effect:** Guards become immune to fire/lava damage

#### Jungle Master  — T3 (Wrought Iron)

- **Cost:** 16 cocoa beans/16 tfc jungle/hanging vines
- **Requires research:** Let It Grow
- **Requires building:** Plantation L1+
- **Effect:** Plantations unlock Cocoa and Vines fields

#### Know the End  — T3 (Wrought Iron)

- **Cost:** 64 chorus fruit
- **Requires research:** The Flintstones
- **Requires building:** Bakery L1+
- **Effect:** Stonemason learns Endstone; Bakers learn Chorus Bread
- **Dimension:** End item *(subject to revision)*

#### Knowledge of the Depth  — T3 (Wrought Iron)

- **Cost:** 64 tfc:rock/raw/tuff
- **Requires research:** Rocking Roll
- **Requires building:** Crusher L1+
- **Effect:** Miners gain a chance for double ore drops

#### Magic Potions  — T4 (Steel)

- **Cost:** 16 nether wart
- **Requires research:** Open the Nether
- **Unlocks building:** Alchemist Lab
- **Effect:** Unlocks the Alchemist Laboratory building
- **Dimension:** Nether item — gated by Nether Mine L1 *(subject to revision)*

#### Minimum Order Quantity  — T3 (Wrought Iron)

- **Cost:** clipboard/book
- **Requires research:** Memory Aid
- **Requires building:** Courier L1+
- **Effect:** Buildings wait longer before placing orders

#### Pave the Road  — T3 (Wrought Iron)

- **Cost:** 32 concrete
- **Requires research:** Rocking Roll
- **Requires building:** Crusher L1+
- **Unlocks building:** Concrete Mixer
- **Effect:** Unlocks the Concrete Mixer building

#### Podzol Chance II  — T3 (Wrought Iron)

- **Cost:** 32 podzol
- **Requires research:** Podzol Chance
- **Requires building:** Composter L1+
- **Effect:** Composters produce +100% more podzol

#### Redstone Powered  — T3 (Wrought Iron)

- **Cost:** 256 redstone
- **Requires research:** Is This Redstone?
- **Effect:** Citizen block-break speed +25%

#### Skills  — T3 (Wrought Iron)

- **Cost:** 128 tfc:metal/ingot/wrought_iron
- **Requires research:** Ability
- **Requires building:** Mine L1+
- **Effect:** Citizen block-place speed +15%

#### Space  — T3 (Wrought Iron)

- **Cost:** 16 rack
- **Requires research:** Sieving
- **Requires building:** Mine L1+
- **Effect:** Buildings can minimum-stock 50% more

#### Taking Diving Lessons  — T3 (Wrought Iron)

- **Cost:** 16 tfc kelp/16 tfc:sea_pickle/16 tfc:tide_pool_blocks
- **Requires research:** Let It Grow
- **Requires building:** Plantation L1+
- **Effect:** Plantations unlock Kelp, Sea Pickle and Tide-pool fields

#### Warehouse Master  — T3 (Wrought Iron)

- **Cost:** 3 rack
- **Requires research:** Memory Aid
- **Requires building:** Warehouse L3 AND (Sawmill L3 OR Stonemason L3)
- **Effect:** Recipes can be selected based on warehouse stock


### Column 4  ·  University level 4 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Capacity** | T4 | 32 rack | — | Buildings can minimum-stock 50% more |
| **Compost** | T4 | 256 c:seeds | — | Farmers harvest +20% crops |
| **Deep Pockets** | T4 | 64 tfc:gem/emerald | — | Citizen inventory +9 slots |
| **Enhanced Gates II** | T4 | gate/tome/obsidian | — | Gates gain +100% raider swarm resistance |
| **Gargamel** | T4 | 16 crimson/16 warped fungus | — | Plantations unlock Fungi, Roots and Nether Vines fields |
| **Heavy Machinery** | T4 | 512 redstone | — | Citizen block-break speed +25% |
| **Ocean\u2019s Heart** | T4 | 1 ea tfc clam/mollusk/mussels | — | Fishers can find treasure outside the ocean |
| **Recipe Book** | T4 | 128 paper | — | Workers can learn +50% more recipes |
| **Reinforced** | T4 | 32 tfc:gem/diamond | — | Citizen tool durability +15% |
| **Rich Veins** | T4 | 32 c:ores/rich | — | Miners find +25% more ores |
| **Tools** | T4 | 128 tfc:metal/ingot/steel | — | Citizen block-place speed +25% |

#### Capacity  — T4 (Steel)

- **Cost:** 32 rack
- **Requires research:** Space
- **Requires building:** Mine L1+
- **Effect:** Buildings can minimum-stock 50% more

#### Compost  — T4 (Steel)

- **Cost:** 256 c:seeds
- **Requires research:** Dung
- **Requires building:** (Farmer L1+ OR Composter L1+)
- **Effect:** Farmers harvest +20% crops

#### Deep Pockets  — T4 (Steel)

- **Cost:** 64 tfc:gem/emerald
- **Requires research:** Cheat Sheet
- **Requires building:** Library L1+
- **Effect:** Citizen inventory +9 slots

#### Enhanced Gates II  — T4 (Steel)

- **Cost:** gate/tome/obsidian
- **Requires research:** Enhanced Gates I
- **Effect:** Gates gain +100% raider swarm resistance

#### Gargamel  — T4 (Steel)

- **Cost:** 16 crimson/16 warped fungus
- **Requires research:** Crop Rotation
- **Requires building:** Plantation L1+ AND Nether Mine L1+
- **Effect:** Plantations unlock Fungi, Roots and Nether Vines fields
- **Dimension:** Nether item — gated by Nether Mine L1 *(subject to revision)*

#### Heavy Machinery  — T4 (Steel)

- **Cost:** 512 redstone
- **Requires research:** Redstone Powered
- **Effect:** Citizen block-break speed +25%

#### Ocean\u2019s Heart  — T4 (Steel)

- **Cost:** 1 ea tfc clam/mollusk/mussels
- **Requires research:** Magic Potions
- **Requires building:** Fisher L1+
- **Effect:** Fishers can find treasure outside the ocean

#### Recipe Book  — T4 (Steel)

- **Cost:** 128 paper
- **Requires research:** Cheat Sheet
- **Requires building:** Sawmill L1+
- **Effect:** Workers can learn +50% more recipes

#### Reinforced  — T4 (Steel)

- **Cost:** 32 tfc:gem/diamond
- **Requires research:** Hardened
- **Requires building:** Blacksmith L1+
- **Effect:** Citizen tool durability +15%

#### Rich Veins  — T4 (Steel)

- **Cost:** 32 c:ores/rich
- **Requires research:** Good Veins
- **Requires building:** Mine L1+
- **Effect:** Miners find +25% more ores

#### Tools  — T4 (Steel)

- **Cost:** 128 tfc:metal/ingot/steel
- **Requires research:** Skills
- **Requires building:** Blacksmith L1+
- **Effect:** Citizen block-place speed +25%


### Column 5  ·  University level 5 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Amazing Veins** | T5 | 64 c:ores/rich | — | Miners find +50% more ores |
| **Fertilizer** | T5 | 512 c:seeds | — | Farmers harvest +25% crops |
| **Full Stock!** | T5 | 64 rack | — | Buildings can minimum-stock 100% more |
| **Loaded** | T5 | 128 tfc:gem/emerald | — | Citizen inventory +9 slots |
| **RTM** | T5 | 256 paper | — | Workers can learn +100% more recipes |
| **Seems Automatic** | T5 | 128 tfc:metal/ingot/black_steel | — | Citizen block-place speed +50% |
| **Steel Bracing** | T5 | 64 tfc:gem/diamond | — | Citizen tool durability +25% |
| **What Is This Speed?** | T5 | 1024 redstone | — | Citizen block-break speed +50% |

#### Amazing Veins  — T5 (Black Steel)

- **Cost:** 64 c:ores/rich
- **Requires research:** Rich Veins
- **Requires building:** Mine L1+
- **Effect:** Miners find +50% more ores

#### Fertilizer  — T5 (Black Steel)

- **Cost:** 512 c:seeds
- **Requires research:** Compost
- **Requires building:** Smeltery L1+
- **Effect:** Farmers harvest +25% crops

#### Full Stock!  — T5 (Black Steel)

- **Cost:** 64 rack
- **Requires research:** Capacity
- **Requires building:** Mine L1+
- **Effect:** Buildings can minimum-stock 100% more

#### Loaded  — T5 (Black Steel)

- **Cost:** 128 tfc:gem/emerald
- **Requires research:** Deep Pockets
- **Requires building:** Library L1+
- **Effect:** Citizen inventory +9 slots

#### RTM  — T5 (Black Steel)

- **Cost:** 256 paper
- **Requires research:** Recipe Book
- **Requires building:** Sawmill L1+
- **Effect:** Workers can learn +100% more recipes

#### Seems Automatic  — T5 (Black Steel)

- **Cost:** 128 tfc:metal/ingot/black_steel
- **Requires research:** Tools
- **Requires building:** Blacksmith L1+
- **Effect:** Citizen block-place speed +50%

#### Steel Bracing  — T5 (Black Steel)

- **Cost:** 64 tfc:gem/diamond
- **Requires research:** Reinforced
- **Requires building:** Blacksmith L1+
- **Effect:** Citizen tool durability +25%

#### What Is This Speed?  — T5 (Black Steel)

- **Cost:** 1024 redstone
- **Requires research:** Heavy Machinery
- **Effect:** Citizen block-break speed +50%


### Column 6  ·  University level 5 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Diamond Coated** | T5 | 128 tfc:gem/diamond | — | Citizen tool durability +40% |
| **Heavily Loaded** | T5 | 256 tfc:gem/emerald | — | Citizen inventory +9 slots |
| **Lightning** | T5 | 2048 redstone | — | Citizen block-break speed +100% |
| **Madness!** | T5 | 128 tfc:metal/ingot/black_steel | — | Citizen block-place speed +100% |
| **Magic Compost** | T5 | 512 c:seeds | — | Farmers harvest +125% crops |
| **Motherlode** | T5 | 64 tfc:gem/diamond | — | Miners find +100% more ores |
| **Rainman** | T6 | 5 tfc red/blue steel buckets | — | Citizens continue working in the rain |

#### Diamond Coated  — T5 (Black Steel)

- **Cost:** 128 tfc:gem/diamond
- **Requires research:** Steel Bracing
- **Effect:** Citizen tool durability +40%

#### Heavily Loaded  — T5 (Black Steel)

- **Cost:** 256 tfc:gem/emerald
- **Requires research:** Loaded
- **Effect:** Citizen inventory +9 slots

#### Lightning  — T5 (Black Steel)

- **Cost:** 2048 redstone
- **Requires research:** What Is This Speed?
- **Effect:** Citizen block-break speed +100%

#### Madness!  — T5 (Black Steel)

- **Cost:** 128 tfc:metal/ingot/black_steel
- **Requires research:** Seems Automatic
- **Effect:** Citizen block-place speed +100%

#### Magic Compost  — T5 (Black Steel)

- **Cost:** 512 c:seeds
- **Requires research:** Fertilizer
- **Effect:** Farmers harvest +125% crops

#### Motherlode  — T5 (Black Steel)

- **Cost:** 64 tfc:gem/diamond
- **Requires research:** Amazing Veins
- **Effect:** Miners find +100% more ores

#### Rainman  — T6 (Red/Blue Steel)

- **Cost:** 5 tfc red/blue steel buckets
- **Requires research:** RTM
- **Effect:** Citizens continue working in the rain


---

## Unlockables Branch

The Sifter mesh chain: String -> Flint -> Iron -> Diamond meshes, each gated by a higher Sifter level.

### Column 1  ·  University level 1 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **String Mesh** | T2 | (no material cost) | — | Fletcher learns to make String Meshes for the Sifter |

#### String Mesh  — T2 (Bronze)

- **Cost:** (no material cost)
- **Requires research:** none (top-level)
- **Requires building:** Sifter L1+
- **Effect:** Fletcher learns to make String Meshes for the Sifter


### Column 2  ·  University level 2 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Flint Mesh** | T2 | (no material cost) | — | Stonemason learns to make Flint Meshes for the Sifter |

#### Flint Mesh  — T2 (Bronze)

- **Cost:** (no material cost)
- **Requires research:** String Mesh
- **Requires building:** Sifter L1+
- **Effect:** Stonemason learns to make Flint Meshes for the Sifter


### Column 3  ·  University level 3 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Iron Mesh** | T3 | (no material cost) | — | Blacksmith learns to make Iron Meshes for the Sifter |

#### Iron Mesh  — T3 (Wrought Iron)

- **Cost:** (no material cost)
- **Requires research:** Flint Mesh
- **Requires building:** Sifter L1+
- **Effect:** Blacksmith learns to make Iron Meshes for the Sifter


### Column 4  ·  University level 4 required

| Research | Tier | Cost | Unlocks | Effect |
|---|---|---|---|---|
| **Diamond Mesh** | T4 | (no material cost) | — | Mechanic learns to make Diamond Meshes for the Sifter |

#### Diamond Mesh  — T4 (Steel)

- **Cost:** (no material cost)
- **Requires research:** Iron Mesh
- **Requires building:** Sifter L1+
- **Effect:** Mechanic learns to make Diamond Meshes for the Sifter


---
