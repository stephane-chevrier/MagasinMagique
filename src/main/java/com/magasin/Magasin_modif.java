package com.magasin;

class Magasin_modif {
    public Item[] items;
    private static final String COMTE = "Comté";
    private static final String PASS_VIP_CONCERT = "Pass VIP Concert";
    private static final String KRYPTONITE = "Kryptonite";

    public Magasin_modif(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item i : items) {

            // Valeur de decrementation standard
            int qualityDec = 1;
            int sellInDec = 1;

            // Regle date de péremption est passée, la qualité se dégrade deux fois plus rapidement.
            if (i.sellIn < 0) {
                qualityDec *= 2;
            }

            // Regle La qualité (`quality`) d'un produit ne peut jamais être négative.
            if (i.quality == 0) {
                qualityDec = 0;
            }

            // Regle Le produit "Comté" augmente sa qualité (`quality`) plus le temps passe.
            if (i.name.equals(COMTE)) {
                qualityDec = - qualityDec;
            }

            // Regle La qualité (`quality`) d'un produit n'est jamais plus grande que 50.
            if ((i.quality == 50) && (qualityDec > 0)) {
                qualityDec = 0;
            }

            // Regle "Kryptonite", étant un objet légendaire, n'a pas de date de péremption
            // et ne perd jamais en qualité (`quality`)
            if (i.name.equals(KRYPTONITE)) {
                qualityDec = 0;
                sellInDec = 0;
            }

            // Regle Le "Pass VIP Concert" augmente sa qualité (`quality`) plus le temps passe (`sellIn`)
            if (i.name.equals(PASS_VIP_CONCERT)) {
                qualityDec = -qualityDec;

                // Regle La qualité augmente de 2 quand il reste 10 jours ou moins
                if (i.sellIn <= 10) {
                    qualityDec = 2;
                }

                // Regle La qualité augmente de 3 quand il reste 5 jours ou moins
                if (i.sellIn <= 5) {
                    qualityDec = 3;
                }

                // Regle mais la qualité tombe à 0 une fois le concert passé.
                if (i.sellIn < 0) {
                    qualityDec = i.quality;
                }
            }
//            if (!i.name.equals(COMTE)
//                    && !i.name.equals(PASS_VIP_CONCERT)) {
//                if (i.quality > 0) {
//                    if (!i.name.equals(KRYPTONITE)) {
//                        i.quality = i.quality - 1;
//                    }
//                }
//            } else {
//                if (i.quality < 50) {
//                    i.quality = i.quality + 1;
//
//                    if (i.name.equals(PASS_VIP_CONCERT)) {
//                        if (i.sellIn < 11) {
//                            if (i.quality < 50) {
//                                i.quality = i.quality + 1;
//                            }
//                        }
//
//                        if (i.sellIn < 6) {
//                            if (i.quality < 50) {
//                                i.quality = i.quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!i.name.equals(KRYPTONITE)) {
//                i.sellIn = i.sellIn - 1;
//            }
//
//            if (i.sellIn < 0) {
//                if (!i.name.equals(COMTE)) {
//                    if (!i.name.equals(PASS_VIP_CONCERT)) {
//                        if (i.quality > 0) {
//                            if (!i.name.equals(KRYPTONITE)) {
//                                i.quality = i.quality - 1;
//                            }
//                        }
//                    } else {
//                        i.quality = 0;
//                    }
//                } else {
//                    if (i.quality < 50) {
//                        i.quality = i.quality + 1;
//                    }
//                }
//            }
        }
    }
}
