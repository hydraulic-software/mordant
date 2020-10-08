package com.github.ajalt.mordant.internal.gen

internal class CellWidthTableEntry(val low: Int, val high: Int, val width: Byte)

internal val CELL_WIDTH_TABLE: Array<CellWidthTableEntry> = arrayOf<CellWidthTableEntry>(
        CellWidthTableEntry(0x0, 0x1f, 0), // <control-0000>..<control-001F>
        CellWidthTableEntry(0x7f, 0x9f, 0), // <control-007F>..<control-009F>
        CellWidthTableEntry(0x300, 0x36f, 0), // COMBINING GRAVE ACCENT..COMBINING LATIN SMALL LETTER X
        CellWidthTableEntry(0x34f, 0x34f, 0), // COMBINING GRAPHEME JOINER
        CellWidthTableEntry(0x483, 0x489, 0), // COMBINING CYRILLIC TITLO..COMBINING CYRILLIC MILLIONS SIGN
        CellWidthTableEntry(0x591, 0x5bd, 0), // HEBREW ACCENT ETNAHTA..HEBREW POINT METEG
        CellWidthTableEntry(0x5bf, 0x5bf, 0), // HEBREW POINT RAFE
        CellWidthTableEntry(0x5c1, 0x5c2, 0), // HEBREW POINT SHIN DOT..HEBREW POINT SIN DOT
        CellWidthTableEntry(0x5c4, 0x5c5, 0), // HEBREW MARK UPPER DOT..HEBREW MARK LOWER DOT
        CellWidthTableEntry(0x5c7, 0x5c7, 0), // HEBREW POINT QAMATS QATAN
        CellWidthTableEntry(0x610, 0x61a, 0), // ARABIC SIGN SALLALLAHOU ALAYHE WASSALLAM..ARABIC SMALL KASRA
        CellWidthTableEntry(0x64b, 0x65f, 0), // ARABIC FATHATAN..ARABIC WAVY HAMZA BELOW
        CellWidthTableEntry(0x670, 0x670, 0), // ARABIC LETTER SUPERSCRIPT ALEF
        CellWidthTableEntry(0x6d6, 0x6dc, 0), // ARABIC SMALL HIGH LIGATURE SAD WITH LAM WITH ALEF MAKSURA..ARABIC SMALL HIGH SEEN
        CellWidthTableEntry(0x6df, 0x6e4, 0), // ARABIC SMALL HIGH ROUNDED ZERO..ARABIC SMALL HIGH MADDA
        CellWidthTableEntry(0x6e7, 0x6e8, 0), // ARABIC SMALL HIGH YEH..ARABIC SMALL HIGH NOON
        CellWidthTableEntry(0x6ea, 0x6ed, 0), // ARABIC EMPTY CENTRE LOW STOP..ARABIC SMALL LOW MEEM
        CellWidthTableEntry(0x711, 0x711, 0), // SYRIAC LETTER SUPERSCRIPT ALAPH
        CellWidthTableEntry(0x730, 0x74a, 0), // SYRIAC PTHAHA ABOVE..SYRIAC BARREKH
        CellWidthTableEntry(0x7a6, 0x7b0, 0), // THAANA ABAFILI..THAANA SUKUN
        CellWidthTableEntry(0x7eb, 0x7f3, 0), // NKO COMBINING SHORT HIGH TONE..NKO COMBINING DOUBLE DOT ABOVE
        CellWidthTableEntry(0x7fd, 0x7fd, 0), // NKO DANTAYALAN
        CellWidthTableEntry(0x816, 0x819, 0), // SAMARITAN MARK IN..SAMARITAN MARK DAGESH
        CellWidthTableEntry(0x81b, 0x823, 0), // SAMARITAN MARK EPENTHETIC YUT..SAMARITAN VOWEL SIGN A
        CellWidthTableEntry(0x825, 0x827, 0), // SAMARITAN VOWEL SIGN SHORT A..SAMARITAN VOWEL SIGN U
        CellWidthTableEntry(0x829, 0x82d, 0), // SAMARITAN VOWEL SIGN LONG I..SAMARITAN MARK NEQUDAA
        CellWidthTableEntry(0x859, 0x85b, 0), // MANDAIC AFFRICATION MARK..MANDAIC GEMINATION MARK
        CellWidthTableEntry(0x8d3, 0x8e1, 0), // ARABIC SMALL LOW WAW..ARABIC SMALL HIGH SIGN SAFHA
        CellWidthTableEntry(0x8e3, 0x902, 0), // ARABIC TURNED DAMMA BELOW..DEVANAGARI SIGN ANUSVARA
        CellWidthTableEntry(0x93a, 0x93a, 0), // DEVANAGARI VOWEL SIGN OE
        CellWidthTableEntry(0x93c, 0x93c, 0), // DEVANAGARI SIGN NUKTA
        CellWidthTableEntry(0x941, 0x948, 0), // DEVANAGARI VOWEL SIGN U..DEVANAGARI VOWEL SIGN AI
        CellWidthTableEntry(0x94d, 0x94d, 0), // DEVANAGARI SIGN VIRAMA
        CellWidthTableEntry(0x951, 0x957, 0), // DEVANAGARI STRESS SIGN UDATTA..DEVANAGARI VOWEL SIGN UUE
        CellWidthTableEntry(0x962, 0x963, 0), // DEVANAGARI VOWEL SIGN VOCALIC L..DEVANAGARI VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0x981, 0x981, 0), // BENGALI SIGN CANDRABINDU
        CellWidthTableEntry(0x9bc, 0x9bc, 0), // BENGALI SIGN NUKTA
        CellWidthTableEntry(0x9c1, 0x9c4, 0), // BENGALI VOWEL SIGN U..BENGALI VOWEL SIGN VOCALIC RR
        CellWidthTableEntry(0x9cd, 0x9cd, 0), // BENGALI SIGN VIRAMA
        CellWidthTableEntry(0x9e2, 0x9e3, 0), // BENGALI VOWEL SIGN VOCALIC L..BENGALI VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0x9fe, 0x9fe, 0), // BENGALI SANDHI MARK
        CellWidthTableEntry(0xa01, 0xa02, 0), // GURMUKHI SIGN ADAK BINDI..GURMUKHI SIGN BINDI
        CellWidthTableEntry(0xa3c, 0xa3c, 0), // GURMUKHI SIGN NUKTA
        CellWidthTableEntry(0xa41, 0xa42, 0), // GURMUKHI VOWEL SIGN U..GURMUKHI VOWEL SIGN UU
        CellWidthTableEntry(0xa47, 0xa48, 0), // GURMUKHI VOWEL SIGN EE..GURMUKHI VOWEL SIGN AI
        CellWidthTableEntry(0xa4b, 0xa4d, 0), // GURMUKHI VOWEL SIGN OO..GURMUKHI SIGN VIRAMA
        CellWidthTableEntry(0xa51, 0xa51, 0), // GURMUKHI SIGN UDAAT
        CellWidthTableEntry(0xa70, 0xa71, 0), // GURMUKHI TIPPI..GURMUKHI ADDAK
        CellWidthTableEntry(0xa75, 0xa75, 0), // GURMUKHI SIGN YAKASH
        CellWidthTableEntry(0xa81, 0xa82, 0), // GUJARATI SIGN CANDRABINDU..GUJARATI SIGN ANUSVARA
        CellWidthTableEntry(0xabc, 0xabc, 0), // GUJARATI SIGN NUKTA
        CellWidthTableEntry(0xac1, 0xac5, 0), // GUJARATI VOWEL SIGN U..GUJARATI VOWEL SIGN CANDRA E
        CellWidthTableEntry(0xac7, 0xac8, 0), // GUJARATI VOWEL SIGN E..GUJARATI VOWEL SIGN AI
        CellWidthTableEntry(0xacd, 0xacd, 0), // GUJARATI SIGN VIRAMA
        CellWidthTableEntry(0xae2, 0xae3, 0), // GUJARATI VOWEL SIGN VOCALIC L..GUJARATI VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0xafa, 0xaff, 0), // GUJARATI SIGN SUKUN..GUJARATI SIGN TWO-CIRCLE NUKTA ABOVE
        CellWidthTableEntry(0xb01, 0xb01, 0), // ORIYA SIGN CANDRABINDU
        CellWidthTableEntry(0xb3c, 0xb3c, 0), // ORIYA SIGN NUKTA
        CellWidthTableEntry(0xb3f, 0xb3f, 0), // ORIYA VOWEL SIGN I
        CellWidthTableEntry(0xb41, 0xb44, 0), // ORIYA VOWEL SIGN U..ORIYA VOWEL SIGN VOCALIC RR
        CellWidthTableEntry(0xb4d, 0xb4d, 0), // ORIYA SIGN VIRAMA
        CellWidthTableEntry(0xb55, 0xb56, 0), // ORIYA SIGN OVERLINE..ORIYA AI LENGTH MARK
        CellWidthTableEntry(0xb62, 0xb63, 0), // ORIYA VOWEL SIGN VOCALIC L..ORIYA VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0xb82, 0xb82, 0), // TAMIL SIGN ANUSVARA
        CellWidthTableEntry(0xbc0, 0xbc0, 0), // TAMIL VOWEL SIGN II
        CellWidthTableEntry(0xbcd, 0xbcd, 0), // TAMIL SIGN VIRAMA
        CellWidthTableEntry(0xc00, 0xc00, 0), // TELUGU SIGN COMBINING CANDRABINDU ABOVE
        CellWidthTableEntry(0xc04, 0xc04, 0), // TELUGU SIGN COMBINING ANUSVARA ABOVE
        CellWidthTableEntry(0xc3e, 0xc40, 0), // TELUGU VOWEL SIGN AA..TELUGU VOWEL SIGN II
        CellWidthTableEntry(0xc46, 0xc48, 0), // TELUGU VOWEL SIGN E..TELUGU VOWEL SIGN AI
        CellWidthTableEntry(0xc4a, 0xc4d, 0), // TELUGU VOWEL SIGN O..TELUGU SIGN VIRAMA
        CellWidthTableEntry(0xc55, 0xc56, 0), // TELUGU LENGTH MARK..TELUGU AI LENGTH MARK
        CellWidthTableEntry(0xc62, 0xc63, 0), // TELUGU VOWEL SIGN VOCALIC L..TELUGU VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0xc81, 0xc81, 0), // KANNADA SIGN CANDRABINDU
        CellWidthTableEntry(0xcbc, 0xcbc, 0), // KANNADA SIGN NUKTA
        CellWidthTableEntry(0xcbf, 0xcbf, 0), // KANNADA VOWEL SIGN I
        CellWidthTableEntry(0xcc6, 0xcc6, 0), // KANNADA VOWEL SIGN E
        CellWidthTableEntry(0xccc, 0xccd, 0), // KANNADA VOWEL SIGN AU..KANNADA SIGN VIRAMA
        CellWidthTableEntry(0xce2, 0xce3, 0), // KANNADA VOWEL SIGN VOCALIC L..KANNADA VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0xd00, 0xd01, 0), // MALAYALAM SIGN COMBINING ANUSVARA ABOVE..MALAYALAM SIGN CANDRABINDU
        CellWidthTableEntry(0xd3b, 0xd3c, 0), // MALAYALAM SIGN VERTICAL BAR VIRAMA..MALAYALAM SIGN CIRCULAR VIRAMA
        CellWidthTableEntry(0xd41, 0xd44, 0), // MALAYALAM VOWEL SIGN U..MALAYALAM VOWEL SIGN VOCALIC RR
        CellWidthTableEntry(0xd4d, 0xd4d, 0), // MALAYALAM SIGN VIRAMA
        CellWidthTableEntry(0xd62, 0xd63, 0), // MALAYALAM VOWEL SIGN VOCALIC L..MALAYALAM VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0xd81, 0xd81, 0), // SINHALA SIGN CANDRABINDU
        CellWidthTableEntry(0xdca, 0xdca, 0), // SINHALA SIGN AL-LAKUNA
        CellWidthTableEntry(0xdd2, 0xdd4, 0), // SINHALA VOWEL SIGN KETTI IS-PILLA..SINHALA VOWEL SIGN KETTI PAA-PILLA
        CellWidthTableEntry(0xdd6, 0xdd6, 0), // SINHALA VOWEL SIGN DIGA PAA-PILLA
        CellWidthTableEntry(0xe31, 0xe31, 0), // THAI CHARACTER MAI HAN-AKAT
        CellWidthTableEntry(0xe34, 0xe3a, 0), // THAI CHARACTER SARA I..THAI CHARACTER PHINTHU
        CellWidthTableEntry(0xe47, 0xe4e, 0), // THAI CHARACTER MAITAIKHU..THAI CHARACTER YAMAKKAN
        CellWidthTableEntry(0xeb1, 0xeb1, 0), // LAO VOWEL SIGN MAI KAN
        CellWidthTableEntry(0xeb4, 0xebc, 0), // LAO VOWEL SIGN I..LAO SEMIVOWEL SIGN LO
        CellWidthTableEntry(0xec8, 0xecd, 0), // LAO TONE MAI EK..LAO NIGGAHITA
        CellWidthTableEntry(0xf18, 0xf19, 0), // TIBETAN ASTROLOGICAL SIGN -KHYUD PA..TIBETAN ASTROLOGICAL SIGN SDONG TSHUGS
        CellWidthTableEntry(0xf35, 0xf35, 0), // TIBETAN MARK NGAS BZUNG NYI ZLA
        CellWidthTableEntry(0xf37, 0xf37, 0), // TIBETAN MARK NGAS BZUNG SGOR RTAGS
        CellWidthTableEntry(0xf39, 0xf39, 0), // TIBETAN MARK TSA -PHRU
        CellWidthTableEntry(0xf71, 0xf7e, 0), // TIBETAN VOWEL SIGN AA..TIBETAN SIGN RJES SU NGA RO
        CellWidthTableEntry(0xf80, 0xf84, 0), // TIBETAN VOWEL SIGN REVERSED I..TIBETAN MARK HALANTA
        CellWidthTableEntry(0xf86, 0xf87, 0), // TIBETAN SIGN LCI RTAGS..TIBETAN SIGN YANG RTAGS
        CellWidthTableEntry(0xf8d, 0xf97, 0), // TIBETAN SUBJOINED SIGN LCE TSA CAN..TIBETAN SUBJOINED LETTER JA
        CellWidthTableEntry(0xf99, 0xfbc, 0), // TIBETAN SUBJOINED LETTER NYA..TIBETAN SUBJOINED LETTER FIXED-FORM RA
        CellWidthTableEntry(0xfc6, 0xfc6, 0), // TIBETAN SYMBOL PADMA GDAN
        CellWidthTableEntry(0x102d, 0x1030, 0), // MYANMAR VOWEL SIGN I..MYANMAR VOWEL SIGN UU
        CellWidthTableEntry(0x1032, 0x1037, 0), // MYANMAR VOWEL SIGN AI..MYANMAR SIGN DOT BELOW
        CellWidthTableEntry(0x1039, 0x103a, 0), // MYANMAR SIGN VIRAMA..MYANMAR SIGN ASAT
        CellWidthTableEntry(0x103d, 0x103e, 0), // MYANMAR CONSONANT SIGN MEDIAL WA..MYANMAR CONSONANT SIGN MEDIAL HA
        CellWidthTableEntry(0x1058, 0x1059, 0), // MYANMAR VOWEL SIGN VOCALIC L..MYANMAR VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0x105e, 0x1060, 0), // MYANMAR CONSONANT SIGN MON MEDIAL NA..MYANMAR CONSONANT SIGN MON MEDIAL LA
        CellWidthTableEntry(0x1071, 0x1074, 0), // MYANMAR VOWEL SIGN GEBA KAREN I..MYANMAR VOWEL SIGN KAYAH EE
        CellWidthTableEntry(0x1082, 0x1082, 0), // MYANMAR CONSONANT SIGN SHAN MEDIAL WA
        CellWidthTableEntry(0x1085, 0x1086, 0), // MYANMAR VOWEL SIGN SHAN E ABOVE..MYANMAR VOWEL SIGN SHAN FINAL Y
        CellWidthTableEntry(0x108d, 0x108d, 0), // MYANMAR SIGN SHAN COUNCIL EMPHATIC TONE
        CellWidthTableEntry(0x109d, 0x109d, 0), // MYANMAR VOWEL SIGN AITON AI
        CellWidthTableEntry(0x1100, 0x115f, 2), // HANGUL CHOSEONG KIYEOK..HANGUL CHOSEONG FILLER
        CellWidthTableEntry(0x135d, 0x135f, 0), // ETHIOPIC COMBINING GEMINATION AND VOWEL LENGTH MARK..ETHIOPIC COMBINING GEMINATION MARK
        CellWidthTableEntry(0x1712, 0x1714, 0), // TAGALOG VOWEL SIGN I..TAGALOG SIGN VIRAMA
        CellWidthTableEntry(0x1732, 0x1734, 0), // HANUNOO VOWEL SIGN I..HANUNOO SIGN PAMUDPOD
        CellWidthTableEntry(0x1752, 0x1753, 0), // BUHID VOWEL SIGN I..BUHID VOWEL SIGN U
        CellWidthTableEntry(0x1772, 0x1773, 0), // TAGBANWA VOWEL SIGN I..TAGBANWA VOWEL SIGN U
        CellWidthTableEntry(0x17b4, 0x17b5, 0), // KHMER VOWEL INHERENT AQ..KHMER VOWEL INHERENT AA
        CellWidthTableEntry(0x17b7, 0x17bd, 0), // KHMER VOWEL SIGN I..KHMER VOWEL SIGN UA
        CellWidthTableEntry(0x17c6, 0x17c6, 0), // KHMER SIGN NIKAHIT
        CellWidthTableEntry(0x17c9, 0x17d3, 0), // KHMER SIGN MUUSIKATOAN..KHMER SIGN BATHAMASAT
        CellWidthTableEntry(0x17dd, 0x17dd, 0), // KHMER SIGN ATTHACAN
        CellWidthTableEntry(0x180b, 0x180d, 0), // MONGOLIAN FREE VARIATION SELECTOR ONE..MONGOLIAN FREE VARIATION SELECTOR THREE
        CellWidthTableEntry(0x1885, 0x1886, 0), // MONGOLIAN LETTER ALI GALI BALUDA..MONGOLIAN LETTER ALI GALI THREE BALUDA
        CellWidthTableEntry(0x18a9, 0x18a9, 0), // MONGOLIAN LETTER ALI GALI DAGALGA
        CellWidthTableEntry(0x1920, 0x1922, 0), // LIMBU VOWEL SIGN A..LIMBU VOWEL SIGN U
        CellWidthTableEntry(0x1927, 0x1928, 0), // LIMBU VOWEL SIGN E..LIMBU VOWEL SIGN O
        CellWidthTableEntry(0x1932, 0x1932, 0), // LIMBU SMALL LETTER ANUSVARA
        CellWidthTableEntry(0x1939, 0x193b, 0), // LIMBU SIGN MUKPHRENG..LIMBU SIGN SA-I
        CellWidthTableEntry(0x1a17, 0x1a18, 0), // BUGINESE VOWEL SIGN I..BUGINESE VOWEL SIGN U
        CellWidthTableEntry(0x1a1b, 0x1a1b, 0), // BUGINESE VOWEL SIGN AE
        CellWidthTableEntry(0x1a56, 0x1a56, 0), // TAI THAM CONSONANT SIGN MEDIAL LA
        CellWidthTableEntry(0x1a58, 0x1a5e, 0), // TAI THAM SIGN MAI KANG LAI..TAI THAM CONSONANT SIGN SA
        CellWidthTableEntry(0x1a60, 0x1a60, 0), // TAI THAM SIGN SAKOT
        CellWidthTableEntry(0x1a62, 0x1a62, 0), // TAI THAM VOWEL SIGN MAI SAT
        CellWidthTableEntry(0x1a65, 0x1a6c, 0), // TAI THAM VOWEL SIGN I..TAI THAM VOWEL SIGN OA BELOW
        CellWidthTableEntry(0x1a73, 0x1a7c, 0), // TAI THAM VOWEL SIGN OA ABOVE..TAI THAM SIGN KHUEN-LUE KARAN
        CellWidthTableEntry(0x1a7f, 0x1a7f, 0), // TAI THAM COMBINING CRYPTOGRAMMIC DOT
        CellWidthTableEntry(0x1ab0, 0x1ac0, 0), // COMBINING DOUBLED CIRCUMFLEX ACCENT..COMBINING LATIN SMALL LETTER TURNED W BELOW
        CellWidthTableEntry(0x1b00, 0x1b03, 0), // BALINESE SIGN ULU RICEM..BALINESE SIGN SURANG
        CellWidthTableEntry(0x1b34, 0x1b34, 0), // BALINESE SIGN REREKAN
        CellWidthTableEntry(0x1b36, 0x1b3a, 0), // BALINESE VOWEL SIGN ULU..BALINESE VOWEL SIGN RA REPA
        CellWidthTableEntry(0x1b3c, 0x1b3c, 0), // BALINESE VOWEL SIGN LA LENGA
        CellWidthTableEntry(0x1b42, 0x1b42, 0), // BALINESE VOWEL SIGN PEPET
        CellWidthTableEntry(0x1b6b, 0x1b73, 0), // BALINESE MUSICAL SYMBOL COMBINING TEGEH..BALINESE MUSICAL SYMBOL COMBINING GONG
        CellWidthTableEntry(0x1b80, 0x1b81, 0), // SUNDANESE SIGN PANYECEK..SUNDANESE SIGN PANGLAYAR
        CellWidthTableEntry(0x1ba2, 0x1ba5, 0), // SUNDANESE CONSONANT SIGN PANYAKRA..SUNDANESE VOWEL SIGN PANYUKU
        CellWidthTableEntry(0x1ba8, 0x1ba9, 0), // SUNDANESE VOWEL SIGN PAMEPET..SUNDANESE VOWEL SIGN PANEULEUNG
        CellWidthTableEntry(0x1bab, 0x1bad, 0), // SUNDANESE SIGN VIRAMA..SUNDANESE CONSONANT SIGN PASANGAN WA
        CellWidthTableEntry(0x1be6, 0x1be6, 0), // BATAK SIGN TOMPI
        CellWidthTableEntry(0x1be8, 0x1be9, 0), // BATAK VOWEL SIGN PAKPAK E..BATAK VOWEL SIGN EE
        CellWidthTableEntry(0x1bed, 0x1bed, 0), // BATAK VOWEL SIGN KARO O
        CellWidthTableEntry(0x1bef, 0x1bf1, 0), // BATAK VOWEL SIGN U FOR SIMALUNGUN SA..BATAK CONSONANT SIGN H
        CellWidthTableEntry(0x1c2c, 0x1c33, 0), // LEPCHA VOWEL SIGN E..LEPCHA CONSONANT SIGN T
        CellWidthTableEntry(0x1c36, 0x1c37, 0), // LEPCHA SIGN RAN..LEPCHA SIGN NUKTA
        CellWidthTableEntry(0x1cd0, 0x1cd2, 0), // VEDIC TONE KARSHANA..VEDIC TONE PRENKHA
        CellWidthTableEntry(0x1cd4, 0x1ce0, 0), // VEDIC SIGN YAJURVEDIC MIDLINE SVARITA..VEDIC TONE RIGVEDIC KASHMIRI INDEPENDENT SVARITA
        CellWidthTableEntry(0x1ce2, 0x1ce8, 0), // VEDIC SIGN VISARGA SVARITA..VEDIC SIGN VISARGA ANUDATTA WITH TAIL
        CellWidthTableEntry(0x1ced, 0x1ced, 0), // VEDIC SIGN TIRYAK
        CellWidthTableEntry(0x1cf4, 0x1cf4, 0), // VEDIC TONE CANDRA ABOVE
        CellWidthTableEntry(0x1cf8, 0x1cf9, 0), // VEDIC TONE RING ABOVE..VEDIC TONE DOUBLE RING ABOVE
        CellWidthTableEntry(0x1dc0, 0x1df9, 0), // COMBINING DOTTED GRAVE ACCENT..COMBINING WIDE INVERTED BRIDGE BELOW
        CellWidthTableEntry(0x1dfb, 0x1dff, 0), // COMBINING DELETION MARK..COMBINING RIGHT ARROWHEAD AND DOWN ARROWHEAD BELOW
        CellWidthTableEntry(0x200b, 0x200f, 0), // ZERO WIDTH SPACE..RIGHT-TO-LEFT MARK
        CellWidthTableEntry(0x2028, 0x202e, 0), // LINE SEPARATOR..RIGHT-TO-LEFT OVERRIDE
        CellWidthTableEntry(0x2060, 0x2063, 0), // WORD JOINER..INVISIBLE SEPARATOR
        CellWidthTableEntry(0x20d0, 0x20f0, 0), // COMBINING LEFT HARPOON ABOVE..COMBINING ASTERISK ABOVE
        CellWidthTableEntry(0x231a, 0x231b, 2), // WATCH..HOURGLASS
        CellWidthTableEntry(0x2329, 0x232a, 2), // LEFT-POINTING ANGLE BRACKET..RIGHT-POINTING ANGLE BRACKET
        CellWidthTableEntry(0x23e9, 0x23ec, 2), // BLACK RIGHT-POINTING DOUBLE TRIANGLE..BLACK DOWN-POINTING DOUBLE TRIANGLE
        CellWidthTableEntry(0x23f0, 0x23f0, 2), // ALARM CLOCK
        CellWidthTableEntry(0x23f3, 0x23f3, 2), // HOURGLASS WITH FLOWING SAND
        CellWidthTableEntry(0x25fd, 0x25fe, 2), // WHITE MEDIUM SMALL SQUARE..BLACK MEDIUM SMALL SQUARE
        CellWidthTableEntry(0x2614, 0x2615, 2), // UMBRELLA WITH RAIN DROPS..HOT BEVERAGE
        CellWidthTableEntry(0x2648, 0x2653, 2), // ARIES..PISCES
        CellWidthTableEntry(0x267f, 0x267f, 2), // WHEELCHAIR SYMBOL
        CellWidthTableEntry(0x2693, 0x2693, 2), // ANCHOR
        CellWidthTableEntry(0x26a1, 0x26a1, 2), // HIGH VOLTAGE SIGN
        CellWidthTableEntry(0x26aa, 0x26ab, 2), // MEDIUM WHITE CIRCLE..MEDIUM BLACK CIRCLE
        CellWidthTableEntry(0x26bd, 0x26be, 2), // SOCCER BALL..BASEBALL
        CellWidthTableEntry(0x26c4, 0x26c5, 2), // SNOWMAN WITHOUT SNOW..SUN BEHIND CLOUD
        CellWidthTableEntry(0x26ce, 0x26ce, 2), // OPHIUCHUS
        CellWidthTableEntry(0x26d4, 0x26d4, 2), // NO ENTRY
        CellWidthTableEntry(0x26ea, 0x26ea, 2), // CHURCH
        CellWidthTableEntry(0x26f2, 0x26f3, 2), // FOUNTAIN..FLAG IN HOLE
        CellWidthTableEntry(0x26f5, 0x26f5, 2), // SAILBOAT
        CellWidthTableEntry(0x26fa, 0x26fa, 2), // TENT
        CellWidthTableEntry(0x26fd, 0x26fd, 2), // FUEL PUMP
        CellWidthTableEntry(0x2705, 0x2705, 2), // WHITE HEAVY CHECK MARK
        CellWidthTableEntry(0x270a, 0x270b, 2), // RAISED FIST..RAISED HAND
        CellWidthTableEntry(0x2728, 0x2728, 2), // SPARKLES
        CellWidthTableEntry(0x274c, 0x274c, 2), // CROSS MARK
        CellWidthTableEntry(0x274e, 0x274e, 2), // NEGATIVE SQUARED CROSS MARK
        CellWidthTableEntry(0x2753, 0x2755, 2), // BLACK QUESTION MARK ORNAMENT..WHITE EXCLAMATION MARK ORNAMENT
        CellWidthTableEntry(0x2757, 0x2757, 2), // HEAVY EXCLAMATION MARK SYMBOL
        CellWidthTableEntry(0x2795, 0x2797, 2), // HEAVY PLUS SIGN..HEAVY DIVISION SIGN
        CellWidthTableEntry(0x27b0, 0x27b0, 2), // CURLY LOOP
        CellWidthTableEntry(0x27bf, 0x27bf, 2), // DOUBLE CURLY LOOP
        CellWidthTableEntry(0x2b1b, 0x2b1c, 2), // BLACK LARGE SQUARE..WHITE LARGE SQUARE
        CellWidthTableEntry(0x2b50, 0x2b50, 2), // WHITE MEDIUM STAR
        CellWidthTableEntry(0x2b55, 0x2b55, 2), // HEAVY LARGE CIRCLE
        CellWidthTableEntry(0x2cef, 0x2cf1, 0), // COPTIC COMBINING NI ABOVE..COPTIC COMBINING SPIRITUS LENIS
        CellWidthTableEntry(0x2d7f, 0x2d7f, 0), // TIFINAGH CONSONANT JOINER
        CellWidthTableEntry(0x2de0, 0x2dff, 0), // COMBINING CYRILLIC LETTER BE..COMBINING CYRILLIC LETTER IOTIFIED BIG YUS
        CellWidthTableEntry(0x2e80, 0x2e99, 2), // CJK RADICAL REPEAT..CJK RADICAL RAP
        CellWidthTableEntry(0x2e9b, 0x2ef3, 2), // CJK RADICAL CHOKE..CJK RADICAL C-SIMPLIFIED TURTLE
        CellWidthTableEntry(0x2f00, 0x2fd5, 2), // KANGXI RADICAL ONE..KANGXI RADICAL FLUTE
        CellWidthTableEntry(0x2ff0, 0x2ffb, 2), // IDEOGRAPHIC DESCRIPTION CHARACTER LEFT TO RIGHT..IDEOGRAPHIC DESCRIPTION CHARACTER OVERLAID
        CellWidthTableEntry(0x3000, 0x3029, 2), // IDEOGRAPHIC SPACE..HANGZHOU NUMERAL NINE
        CellWidthTableEntry(0x302a, 0x302d, 0), // IDEOGRAPHIC LEVEL TONE MARK..IDEOGRAPHIC ENTERING TONE MARK
        CellWidthTableEntry(0x302a, 0x303e, 2), // IDEOGRAPHIC LEVEL TONE MARK..IDEOGRAPHIC VARIATION INDICATOR
        CellWidthTableEntry(0x3041, 0x3096, 2), // HIRAGANA LETTER SMALL A..HIRAGANA LETTER SMALL KE
        CellWidthTableEntry(0x3099, 0x309a, 0), // COMBINING KATAKANA-HIRAGANA VOICED SOUND MARK..COMBINING KATAKANA-HIRAGANA SEMI-VOICED SOUND MARK
        CellWidthTableEntry(0x3099, 0x30ff, 2), // COMBINING KATAKANA-HIRAGANA VOICED SOUND MARK..KATAKANA DIGRAPH KOTO
        CellWidthTableEntry(0x3105, 0x312f, 2), // BOPOMOFO LETTER B..BOPOMOFO LETTER NN
        CellWidthTableEntry(0x3131, 0x318e, 2), // HANGUL LETTER KIYEOK..HANGUL LETTER ARAEAE
        CellWidthTableEntry(0x3190, 0x31e3, 2), // IDEOGRAPHIC ANNOTATION LINKING MARK..CJK STROKE Q
        CellWidthTableEntry(0x31f0, 0x321e, 2), // KATAKANA LETTER SMALL KU..PARENTHESIZED KOREAN CHARACTER O HU
        CellWidthTableEntry(0x3220, 0x3247, 2), // PARENTHESIZED IDEOGRAPH ONE..CIRCLED IDEOGRAPH KOTO
        CellWidthTableEntry(0x3250, 0x4dbf, 2), // PARTNERSHIP SIGN..CJK UNIFIED IDEOGRAPH-4DBF
        CellWidthTableEntry(0x4e00, 0xa48c, 2), // CJK UNIFIED IDEOGRAPH-4E00..YI SYLLABLE YYR
        CellWidthTableEntry(0xa490, 0xa4c6, 2), // YI RADICAL QOT..YI RADICAL KE
        CellWidthTableEntry(0xa66f, 0xa672, 0), // COMBINING CYRILLIC VZMET..COMBINING CYRILLIC THOUSAND MILLIONS SIGN
        CellWidthTableEntry(0xa674, 0xa67d, 0), // COMBINING CYRILLIC LETTER UKRAINIAN IE..COMBINING CYRILLIC PAYEROK
        CellWidthTableEntry(0xa69e, 0xa69f, 0), // COMBINING CYRILLIC LETTER EF..COMBINING CYRILLIC LETTER IOTIFIED E
        CellWidthTableEntry(0xa6f0, 0xa6f1, 0), // BAMUM COMBINING MARK KOQNDON..BAMUM COMBINING MARK TUKWENTIS
        CellWidthTableEntry(0xa802, 0xa802, 0), // SYLOTI NAGRI SIGN DVISVARA
        CellWidthTableEntry(0xa806, 0xa806, 0), // SYLOTI NAGRI SIGN HASANTA
        CellWidthTableEntry(0xa80b, 0xa80b, 0), // SYLOTI NAGRI SIGN ANUSVARA
        CellWidthTableEntry(0xa825, 0xa826, 0), // SYLOTI NAGRI VOWEL SIGN U..SYLOTI NAGRI VOWEL SIGN E
        CellWidthTableEntry(0xa82c, 0xa82c, 0), // SYLOTI NAGRI SIGN ALTERNATE HASANTA
        CellWidthTableEntry(0xa8c4, 0xa8c5, 0), // SAURASHTRA SIGN VIRAMA..SAURASHTRA SIGN CANDRABINDU
        CellWidthTableEntry(0xa8e0, 0xa8f1, 0), // COMBINING DEVANAGARI DIGIT ZERO..COMBINING DEVANAGARI SIGN AVAGRAHA
        CellWidthTableEntry(0xa8ff, 0xa8ff, 0), // DEVANAGARI VOWEL SIGN AY
        CellWidthTableEntry(0xa926, 0xa92d, 0), // KAYAH LI VOWEL UE..KAYAH LI TONE CALYA PLOPHU
        CellWidthTableEntry(0xa947, 0xa951, 0), // REJANG VOWEL SIGN I..REJANG CONSONANT SIGN R
        CellWidthTableEntry(0xa960, 0xa97c, 2), // HANGUL CHOSEONG TIKEUT-MIEUM..HANGUL CHOSEONG SSANGYEORINHIEUH
        CellWidthTableEntry(0xa980, 0xa982, 0), // JAVANESE SIGN PANYANGGA..JAVANESE SIGN LAYAR
        CellWidthTableEntry(0xa9b3, 0xa9b3, 0), // JAVANESE SIGN CECAK TELU
        CellWidthTableEntry(0xa9b6, 0xa9b9, 0), // JAVANESE VOWEL SIGN WULU..JAVANESE VOWEL SIGN SUKU MENDUT
        CellWidthTableEntry(0xa9bc, 0xa9bd, 0), // JAVANESE VOWEL SIGN PEPET..JAVANESE CONSONANT SIGN KERET
        CellWidthTableEntry(0xa9e5, 0xa9e5, 0), // MYANMAR SIGN SHAN SAW
        CellWidthTableEntry(0xaa29, 0xaa2e, 0), // CHAM VOWEL SIGN AA..CHAM VOWEL SIGN OE
        CellWidthTableEntry(0xaa31, 0xaa32, 0), // CHAM VOWEL SIGN AU..CHAM VOWEL SIGN UE
        CellWidthTableEntry(0xaa35, 0xaa36, 0), // CHAM CONSONANT SIGN LA..CHAM CONSONANT SIGN WA
        CellWidthTableEntry(0xaa43, 0xaa43, 0), // CHAM CONSONANT SIGN FINAL NG
        CellWidthTableEntry(0xaa4c, 0xaa4c, 0), // CHAM CONSONANT SIGN FINAL M
        CellWidthTableEntry(0xaa7c, 0xaa7c, 0), // MYANMAR SIGN TAI LAING TONE-2
        CellWidthTableEntry(0xaab0, 0xaab0, 0), // TAI VIET MAI KANG
        CellWidthTableEntry(0xaab2, 0xaab4, 0), // TAI VIET VOWEL I..TAI VIET VOWEL U
        CellWidthTableEntry(0xaab7, 0xaab8, 0), // TAI VIET MAI KHIT..TAI VIET VOWEL IA
        CellWidthTableEntry(0xaabe, 0xaabf, 0), // TAI VIET VOWEL AM..TAI VIET TONE MAI EK
        CellWidthTableEntry(0xaac1, 0xaac1, 0), // TAI VIET TONE MAI THO
        CellWidthTableEntry(0xaaec, 0xaaed, 0), // MEETEI MAYEK VOWEL SIGN UU..MEETEI MAYEK VOWEL SIGN AAI
        CellWidthTableEntry(0xaaf6, 0xaaf6, 0), // MEETEI MAYEK VIRAMA
        CellWidthTableEntry(0xabe5, 0xabe5, 0), // MEETEI MAYEK VOWEL SIGN ANAP
        CellWidthTableEntry(0xabe8, 0xabe8, 0), // MEETEI MAYEK VOWEL SIGN UNAP
        CellWidthTableEntry(0xabed, 0xabed, 0), // MEETEI MAYEK APUN IYEK
        CellWidthTableEntry(0xac00, 0xd7a3, 2), // HANGUL SYLLABLE GA..HANGUL SYLLABLE HIH
        CellWidthTableEntry(0xf900, 0xfaff, 2), // CJK COMPATIBILITY IDEOGRAPH-F900..<reserved-FAFF>
        CellWidthTableEntry(0xfb1e, 0xfb1e, 0), // HEBREW POINT JUDEO-SPANISH VARIKA
        CellWidthTableEntry(0xfe00, 0xfe0f, 0), // VARIATION SELECTOR-1..VARIATION SELECTOR-16
        CellWidthTableEntry(0xfe10, 0xfe19, 2), // PRESENTATION FORM FOR VERTICAL COMMA..PRESENTATION FORM FOR VERTICAL HORIZONTAL ELLIPSIS
        CellWidthTableEntry(0xfe20, 0xfe2f, 0), // COMBINING LIGATURE LEFT HALF..COMBINING CYRILLIC TITLO RIGHT HALF
        CellWidthTableEntry(0xfe30, 0xfe52, 2), // PRESENTATION FORM FOR VERTICAL TWO DOT LEADER..SMALL FULL STOP
        CellWidthTableEntry(0xfe54, 0xfe66, 2), // SMALL SEMICOLON..SMALL EQUALS SIGN
        CellWidthTableEntry(0xfe68, 0xfe6b, 2), // SMALL REVERSE SOLIDUS..SMALL COMMERCIAL AT
        CellWidthTableEntry(0xff01, 0xff60, 2), // FULLWIDTH EXCLAMATION MARK..FULLWIDTH RIGHT WHITE PARENTHESIS
        CellWidthTableEntry(0xffe0, 0xffe6, 2), // FULLWIDTH CENT SIGN..FULLWIDTH WON SIGN
        CellWidthTableEntry(0x101fd, 0x101fd, 0), // PHAISTOS DISC SIGN COMBINING OBLIQUE STROKE
        CellWidthTableEntry(0x102e0, 0x102e0, 0), // COPTIC EPACT THOUSANDS MARK
        CellWidthTableEntry(0x10376, 0x1037a, 0), // COMBINING OLD PERMIC LETTER AN..COMBINING OLD PERMIC LETTER SII
        CellWidthTableEntry(0x10a01, 0x10a03, 0), // KHAROSHTHI VOWEL SIGN I..KHAROSHTHI VOWEL SIGN VOCALIC R
        CellWidthTableEntry(0x10a05, 0x10a06, 0), // KHAROSHTHI VOWEL SIGN E..KHAROSHTHI VOWEL SIGN O
        CellWidthTableEntry(0x10a0c, 0x10a0f, 0), // KHAROSHTHI VOWEL LENGTH MARK..KHAROSHTHI SIGN VISARGA
        CellWidthTableEntry(0x10a38, 0x10a3a, 0), // KHAROSHTHI SIGN BAR ABOVE..KHAROSHTHI SIGN DOT BELOW
        CellWidthTableEntry(0x10a3f, 0x10a3f, 0), // KHAROSHTHI VIRAMA
        CellWidthTableEntry(0x10ae5, 0x10ae6, 0), // MANICHAEAN ABBREVIATION MARK ABOVE..MANICHAEAN ABBREVIATION MARK BELOW
        CellWidthTableEntry(0x10d24, 0x10d27, 0), // HANIFI ROHINGYA SIGN HARBAHAY..HANIFI ROHINGYA SIGN TASSI
        CellWidthTableEntry(0x10eab, 0x10eac, 0), // YEZIDI COMBINING HAMZA MARK..YEZIDI COMBINING MADDA MARK
        CellWidthTableEntry(0x10f46, 0x10f50, 0), // SOGDIAN COMBINING DOT BELOW..SOGDIAN COMBINING STROKE BELOW
        CellWidthTableEntry(0x11001, 0x11001, 0), // BRAHMI SIGN ANUSVARA
        CellWidthTableEntry(0x11038, 0x11046, 0), // BRAHMI VOWEL SIGN AA..BRAHMI VIRAMA
        CellWidthTableEntry(0x1107f, 0x11081, 0), // BRAHMI NUMBER JOINER..KAITHI SIGN ANUSVARA
        CellWidthTableEntry(0x110b3, 0x110b6, 0), // KAITHI VOWEL SIGN U..KAITHI VOWEL SIGN AI
        CellWidthTableEntry(0x110b9, 0x110ba, 0), // KAITHI SIGN VIRAMA..KAITHI SIGN NUKTA
        CellWidthTableEntry(0x11100, 0x11102, 0), // CHAKMA SIGN CANDRABINDU..CHAKMA SIGN VISARGA
        CellWidthTableEntry(0x11127, 0x1112b, 0), // CHAKMA VOWEL SIGN A..CHAKMA VOWEL SIGN UU
        CellWidthTableEntry(0x1112d, 0x11134, 0), // CHAKMA VOWEL SIGN AI..CHAKMA MAAYYAA
        CellWidthTableEntry(0x11173, 0x11173, 0), // MAHAJANI SIGN NUKTA
        CellWidthTableEntry(0x11180, 0x11181, 0), // SHARADA SIGN CANDRABINDU..SHARADA SIGN ANUSVARA
        CellWidthTableEntry(0x111b6, 0x111be, 0), // SHARADA VOWEL SIGN U..SHARADA VOWEL SIGN O
        CellWidthTableEntry(0x111c9, 0x111cc, 0), // SHARADA SANDHI MARK..SHARADA EXTRA SHORT VOWEL MARK
        CellWidthTableEntry(0x111cf, 0x111cf, 0), // SHARADA SIGN INVERTED CANDRABINDU
        CellWidthTableEntry(0x1122f, 0x11231, 0), // KHOJKI VOWEL SIGN U..KHOJKI VOWEL SIGN AI
        CellWidthTableEntry(0x11234, 0x11234, 0), // KHOJKI SIGN ANUSVARA
        CellWidthTableEntry(0x11236, 0x11237, 0), // KHOJKI SIGN NUKTA..KHOJKI SIGN SHADDA
        CellWidthTableEntry(0x1123e, 0x1123e, 0), // KHOJKI SIGN SUKUN
        CellWidthTableEntry(0x112df, 0x112df, 0), // KHUDAWADI SIGN ANUSVARA
        CellWidthTableEntry(0x112e3, 0x112ea, 0), // KHUDAWADI VOWEL SIGN U..KHUDAWADI SIGN VIRAMA
        CellWidthTableEntry(0x11300, 0x11301, 0), // GRANTHA SIGN COMBINING ANUSVARA ABOVE..GRANTHA SIGN CANDRABINDU
        CellWidthTableEntry(0x1133b, 0x1133c, 0), // COMBINING BINDU BELOW..GRANTHA SIGN NUKTA
        CellWidthTableEntry(0x11340, 0x11340, 0), // GRANTHA VOWEL SIGN II
        CellWidthTableEntry(0x11366, 0x1136c, 0), // COMBINING GRANTHA DIGIT ZERO..COMBINING GRANTHA DIGIT SIX
        CellWidthTableEntry(0x11370, 0x11374, 0), // COMBINING GRANTHA LETTER A..COMBINING GRANTHA LETTER PA
        CellWidthTableEntry(0x11438, 0x1143f, 0), // NEWA VOWEL SIGN U..NEWA VOWEL SIGN AI
        CellWidthTableEntry(0x11442, 0x11444, 0), // NEWA SIGN VIRAMA..NEWA SIGN ANUSVARA
        CellWidthTableEntry(0x11446, 0x11446, 0), // NEWA SIGN NUKTA
        CellWidthTableEntry(0x1145e, 0x1145e, 0), // NEWA SANDHI MARK
        CellWidthTableEntry(0x114b3, 0x114b8, 0), // TIRHUTA VOWEL SIGN U..TIRHUTA VOWEL SIGN VOCALIC LL
        CellWidthTableEntry(0x114ba, 0x114ba, 0), // TIRHUTA VOWEL SIGN SHORT E
        CellWidthTableEntry(0x114bf, 0x114c0, 0), // TIRHUTA SIGN CANDRABINDU..TIRHUTA SIGN ANUSVARA
        CellWidthTableEntry(0x114c2, 0x114c3, 0), // TIRHUTA SIGN VIRAMA..TIRHUTA SIGN NUKTA
        CellWidthTableEntry(0x115b2, 0x115b5, 0), // SIDDHAM VOWEL SIGN U..SIDDHAM VOWEL SIGN VOCALIC RR
        CellWidthTableEntry(0x115bc, 0x115bd, 0), // SIDDHAM SIGN CANDRABINDU..SIDDHAM SIGN ANUSVARA
        CellWidthTableEntry(0x115bf, 0x115c0, 0), // SIDDHAM SIGN VIRAMA..SIDDHAM SIGN NUKTA
        CellWidthTableEntry(0x115dc, 0x115dd, 0), // SIDDHAM VOWEL SIGN ALTERNATE U..SIDDHAM VOWEL SIGN ALTERNATE UU
        CellWidthTableEntry(0x11633, 0x1163a, 0), // MODI VOWEL SIGN U..MODI VOWEL SIGN AI
        CellWidthTableEntry(0x1163d, 0x1163d, 0), // MODI SIGN ANUSVARA
        CellWidthTableEntry(0x1163f, 0x11640, 0), // MODI SIGN VIRAMA..MODI SIGN ARDHACANDRA
        CellWidthTableEntry(0x116ab, 0x116ab, 0), // TAKRI SIGN ANUSVARA
        CellWidthTableEntry(0x116ad, 0x116ad, 0), // TAKRI VOWEL SIGN AA
        CellWidthTableEntry(0x116b0, 0x116b5, 0), // TAKRI VOWEL SIGN U..TAKRI VOWEL SIGN AU
        CellWidthTableEntry(0x116b7, 0x116b7, 0), // TAKRI SIGN NUKTA
        CellWidthTableEntry(0x1171d, 0x1171f, 0), // AHOM CONSONANT SIGN MEDIAL LA..AHOM CONSONANT SIGN MEDIAL LIGATING RA
        CellWidthTableEntry(0x11722, 0x11725, 0), // AHOM VOWEL SIGN I..AHOM VOWEL SIGN UU
        CellWidthTableEntry(0x11727, 0x1172b, 0), // AHOM VOWEL SIGN AW..AHOM SIGN KILLER
        CellWidthTableEntry(0x1182f, 0x11837, 0), // DOGRA VOWEL SIGN U..DOGRA SIGN ANUSVARA
        CellWidthTableEntry(0x11839, 0x1183a, 0), // DOGRA SIGN VIRAMA..DOGRA SIGN NUKTA
        CellWidthTableEntry(0x1193b, 0x1193c, 0), // DIVES AKURU SIGN ANUSVARA..DIVES AKURU SIGN CANDRABINDU
        CellWidthTableEntry(0x1193e, 0x1193e, 0), // DIVES AKURU VIRAMA
        CellWidthTableEntry(0x11943, 0x11943, 0), // DIVES AKURU SIGN NUKTA
        CellWidthTableEntry(0x119d4, 0x119d7, 0), // NANDINAGARI VOWEL SIGN U..NANDINAGARI VOWEL SIGN VOCALIC RR
        CellWidthTableEntry(0x119da, 0x119db, 0), // NANDINAGARI VOWEL SIGN E..NANDINAGARI VOWEL SIGN AI
        CellWidthTableEntry(0x119e0, 0x119e0, 0), // NANDINAGARI SIGN VIRAMA
        CellWidthTableEntry(0x11a01, 0x11a0a, 0), // ZANABAZAR SQUARE VOWEL SIGN I..ZANABAZAR SQUARE VOWEL LENGTH MARK
        CellWidthTableEntry(0x11a33, 0x11a38, 0), // ZANABAZAR SQUARE FINAL CONSONANT MARK..ZANABAZAR SQUARE SIGN ANUSVARA
        CellWidthTableEntry(0x11a3b, 0x11a3e, 0), // ZANABAZAR SQUARE CLUSTER-FINAL LETTER YA..ZANABAZAR SQUARE CLUSTER-FINAL LETTER VA
        CellWidthTableEntry(0x11a47, 0x11a47, 0), // ZANABAZAR SQUARE SUBJOINER
        CellWidthTableEntry(0x11a51, 0x11a56, 0), // SOYOMBO VOWEL SIGN I..SOYOMBO VOWEL SIGN OE
        CellWidthTableEntry(0x11a59, 0x11a5b, 0), // SOYOMBO VOWEL SIGN VOCALIC R..SOYOMBO VOWEL LENGTH MARK
        CellWidthTableEntry(0x11a8a, 0x11a96, 0), // SOYOMBO FINAL CONSONANT SIGN G..SOYOMBO SIGN ANUSVARA
        CellWidthTableEntry(0x11a98, 0x11a99, 0), // SOYOMBO GEMINATION MARK..SOYOMBO SUBJOINER
        CellWidthTableEntry(0x11c30, 0x11c36, 0), // BHAIKSUKI VOWEL SIGN I..BHAIKSUKI VOWEL SIGN VOCALIC L
        CellWidthTableEntry(0x11c38, 0x11c3d, 0), // BHAIKSUKI VOWEL SIGN E..BHAIKSUKI SIGN ANUSVARA
        CellWidthTableEntry(0x11c3f, 0x11c3f, 0), // BHAIKSUKI SIGN VIRAMA
        CellWidthTableEntry(0x11c92, 0x11ca7, 0), // MARCHEN SUBJOINED LETTER KA..MARCHEN SUBJOINED LETTER ZA
        CellWidthTableEntry(0x11caa, 0x11cb0, 0), // MARCHEN SUBJOINED LETTER RA..MARCHEN VOWEL SIGN AA
        CellWidthTableEntry(0x11cb2, 0x11cb3, 0), // MARCHEN VOWEL SIGN U..MARCHEN VOWEL SIGN E
        CellWidthTableEntry(0x11cb5, 0x11cb6, 0), // MARCHEN SIGN ANUSVARA..MARCHEN SIGN CANDRABINDU
        CellWidthTableEntry(0x11d31, 0x11d36, 0), // MASARAM GONDI VOWEL SIGN AA..MASARAM GONDI VOWEL SIGN VOCALIC R
        CellWidthTableEntry(0x11d3a, 0x11d3a, 0), // MASARAM GONDI VOWEL SIGN E
        CellWidthTableEntry(0x11d3c, 0x11d3d, 0), // MASARAM GONDI VOWEL SIGN AI..MASARAM GONDI VOWEL SIGN O
        CellWidthTableEntry(0x11d3f, 0x11d45, 0), // MASARAM GONDI VOWEL SIGN AU..MASARAM GONDI VIRAMA
        CellWidthTableEntry(0x11d47, 0x11d47, 0), // MASARAM GONDI RA-KARA
        CellWidthTableEntry(0x11d90, 0x11d91, 0), // GUNJALA GONDI VOWEL SIGN EE..GUNJALA GONDI VOWEL SIGN AI
        CellWidthTableEntry(0x11d95, 0x11d95, 0), // GUNJALA GONDI SIGN ANUSVARA
        CellWidthTableEntry(0x11d97, 0x11d97, 0), // GUNJALA GONDI VIRAMA
        CellWidthTableEntry(0x11ef3, 0x11ef4, 0), // MAKASAR VOWEL SIGN I..MAKASAR VOWEL SIGN U
        CellWidthTableEntry(0x16af0, 0x16af4, 0), // BASSA VAH COMBINING HIGH TONE..BASSA VAH COMBINING HIGH-LOW TONE
        CellWidthTableEntry(0x16b30, 0x16b36, 0), // PAHAWH HMONG MARK CIM TUB..PAHAWH HMONG MARK CIM TAUM
        CellWidthTableEntry(0x16f4f, 0x16f4f, 0), // MIAO SIGN CONSONANT MODIFIER BAR
        CellWidthTableEntry(0x16f8f, 0x16f92, 0), // MIAO TONE RIGHT..MIAO TONE BELOW
        CellWidthTableEntry(0x16fe0, 0x16fe3, 2), // TANGUT ITERATION MARK..OLD CHINESE ITERATION MARK
        CellWidthTableEntry(0x16fe4, 0x16fe4, 0), // KHITAN SMALL SCRIPT FILLER
        CellWidthTableEntry(0x16fe4, 0x16fe4, 2), // KHITAN SMALL SCRIPT FILLER
        CellWidthTableEntry(0x16ff0, 0x16ff1, 2), // VIETNAMESE ALTERNATE READING MARK CA..VIETNAMESE ALTERNATE READING MARK NHAY
        CellWidthTableEntry(0x17000, 0x187f7, 2), // TANGUT IDEOGRAPH-17000..TANGUT IDEOGRAPH-187F7
        CellWidthTableEntry(0x18800, 0x18cd5, 2), // TANGUT COMPONENT-001..KHITAN SMALL SCRIPT CHARACTER-18CD5
        CellWidthTableEntry(0x18d00, 0x18d08, 2), // TANGUT IDEOGRAPH-18D00..TANGUT IDEOGRAPH-18D08
        CellWidthTableEntry(0x1b000, 0x1b11e, 2), // KATAKANA LETTER ARCHAIC E..HENTAIGANA LETTER N-MU-MO-2
        CellWidthTableEntry(0x1b150, 0x1b152, 2), // HIRAGANA LETTER SMALL WI..HIRAGANA LETTER SMALL WO
        CellWidthTableEntry(0x1b164, 0x1b167, 2), // KATAKANA LETTER SMALL WI..KATAKANA LETTER SMALL N
        CellWidthTableEntry(0x1b170, 0x1b2fb, 2), // NUSHU CHARACTER-1B170..NUSHU CHARACTER-1B2FB
        CellWidthTableEntry(0x1bc9d, 0x1bc9e, 0), // DUPLOYAN THICK LETTER SELECTOR..DUPLOYAN DOUBLE MARK
        CellWidthTableEntry(0x1d167, 0x1d169, 0), // MUSICAL SYMBOL COMBINING TREMOLO-1..MUSICAL SYMBOL COMBINING TREMOLO-3
        CellWidthTableEntry(0x1d17b, 0x1d182, 0), // MUSICAL SYMBOL COMBINING ACCENT..MUSICAL SYMBOL COMBINING LOURE
        CellWidthTableEntry(0x1d185, 0x1d18b, 0), // MUSICAL SYMBOL COMBINING DOIT..MUSICAL SYMBOL COMBINING TRIPLE TONGUE
        CellWidthTableEntry(0x1d1aa, 0x1d1ad, 0), // MUSICAL SYMBOL COMBINING DOWN BOW..MUSICAL SYMBOL COMBINING SNAP PIZZICATO
        CellWidthTableEntry(0x1d242, 0x1d244, 0), // COMBINING GREEK MUSICAL TRISEME..COMBINING GREEK MUSICAL PENTASEME
        CellWidthTableEntry(0x1da00, 0x1da36, 0), // SIGNWRITING HEAD RIM..SIGNWRITING AIR SUCKING IN
        CellWidthTableEntry(0x1da3b, 0x1da6c, 0), // SIGNWRITING MOUTH CLOSED NEUTRAL..SIGNWRITING EXCITEMENT
        CellWidthTableEntry(0x1da75, 0x1da75, 0), // SIGNWRITING UPPER BODY TILTING FROM HIP JOINTS
        CellWidthTableEntry(0x1da84, 0x1da84, 0), // SIGNWRITING LOCATION HEAD NECK
        CellWidthTableEntry(0x1da9b, 0x1da9f, 0), // SIGNWRITING FILL MODIFIER-2..SIGNWRITING FILL MODIFIER-6
        CellWidthTableEntry(0x1daa1, 0x1daaf, 0), // SIGNWRITING ROTATION MODIFIER-2..SIGNWRITING ROTATION MODIFIER-16
        CellWidthTableEntry(0x1e000, 0x1e006, 0), // COMBINING GLAGOLITIC LETTER AZU..COMBINING GLAGOLITIC LETTER ZHIVETE
        CellWidthTableEntry(0x1e008, 0x1e018, 0), // COMBINING GLAGOLITIC LETTER ZEMLJA..COMBINING GLAGOLITIC LETTER HERU
        CellWidthTableEntry(0x1e01b, 0x1e021, 0), // COMBINING GLAGOLITIC LETTER SHTA..COMBINING GLAGOLITIC LETTER YATI
        CellWidthTableEntry(0x1e023, 0x1e024, 0), // COMBINING GLAGOLITIC LETTER YU..COMBINING GLAGOLITIC LETTER SMALL YUS
        CellWidthTableEntry(0x1e026, 0x1e02a, 0), // COMBINING GLAGOLITIC LETTER YO..COMBINING GLAGOLITIC LETTER FITA
        CellWidthTableEntry(0x1e130, 0x1e136, 0), // NYIAKENG PUACHUE HMONG TONE-B..NYIAKENG PUACHUE HMONG TONE-D
        CellWidthTableEntry(0x1e2ec, 0x1e2ef, 0), // WANCHO TONE TUP..WANCHO TONE KOINI
        CellWidthTableEntry(0x1e8d0, 0x1e8d6, 0), // MENDE KIKAKUI COMBINING NUMBER TEENS..MENDE KIKAKUI COMBINING NUMBER MILLIONS
        CellWidthTableEntry(0x1e944, 0x1e94a, 0), // ADLAM ALIF LENGTHENER..ADLAM NUKTA
        CellWidthTableEntry(0x1f000, 0x1f02f, 2), // Mahjong Tiles
        CellWidthTableEntry(0x1f0a0, 0x1f0ff, 2), // Playing Cards
        CellWidthTableEntry(0x1f18e, 0x1f18e, 2), // NEGATIVE SQUARED AB
        CellWidthTableEntry(0x1f191, 0x1f19a, 2), // SQUARED CL..SQUARED VS
        CellWidthTableEntry(0x1f200, 0x1f202, 2), // SQUARE HIRAGANA HOKA..SQUARED KATAKANA SA
        CellWidthTableEntry(0x1f210, 0x1f23b, 2), // SQUARED CJK UNIFIED IDEOGRAPH-624B..SQUARED CJK UNIFIED IDEOGRAPH-914D
        CellWidthTableEntry(0x1f240, 0x1f248, 2), // TORTOISE SHELL BRACKETED CJK UNIFIED IDEOGRAPH-672C..TORTOISE SHELL BRACKETED CJK UNIFIED IDEOGRAPH-6557
        CellWidthTableEntry(0x1f250, 0x1f251, 2), // CIRCLED IDEOGRAPH ADVANTAGE..CIRCLED IDEOGRAPH ACCEPT
        CellWidthTableEntry(0x1f260, 0x1f265, 2), // ROUNDED SYMBOL FOR FU..ROUNDED SYMBOL FOR CAI
        CellWidthTableEntry(0x1f300, 0x1f64f, 2), // Miscellaneous Symbols and Pictographs..Emoticons
        CellWidthTableEntry(0x1f680, 0x1f6ff, 2), // Transport and Map Symbols
        CellWidthTableEntry(0x1f7e0, 0x1f7eb, 2), // LARGE ORANGE CIRCLE..LARGE BROWN SQUARE
        CellWidthTableEntry(0x1f900, 0x1f9ff, 2), // Supplemental Symbols and Pictographs
        CellWidthTableEntry(0x1fa70, 0x1faff, 2), // Symbols and Pictographs Extended-A
        CellWidthTableEntry(0x20000, 0x2fffd, 2), // CJK UNIFIED IDEOGRAPH-20000..<reserved-2FFFD>
        CellWidthTableEntry(0x30000, 0x3fffd, 2), // CJK UNIFIED IDEOGRAPH-30000..<reserved-3FFFD>
        CellWidthTableEntry(0xe0100, 0xe01ef, 0), // VARIATION SELECTOR-17..VARIATION SELECTOR-256
)
