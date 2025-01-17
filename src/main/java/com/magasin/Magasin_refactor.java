package com.magasin;

class Magasin_refactor {
    public Item[] items;
    private static final String COMTE = "Comté";
    private static final String PASS_VIP_CONCERT = "Pass VIP Concert";
    private static final String KRYPTONITE = "Kryptonite";

    private static final String POUVOIRS_MAGIQUES = "Pouvoirs magiques";

    public Magasin_refactor(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item i : items) {

            // Valeur de decrementation standard
            int qualityDec = 1;
            int sellInDec = 1;

            // Regle Les éléments "Pouvoirs magiques" voient leur qualité se dégrader de deux fois plus vite
            // que les objets normaux.
            if(i.name.equals(POUVOIRS_MAGIQUES)) {
                qualityDec *= 2;
            }

            // Regle date de péremption est passée, la qualité se dégrade deux fois plus rapidement.
            if (i.sellIn <= 0) {
                qualityDec *= 2;
            }

            // Regle Le produit "Comté" augmente sa qualité (`quality`) plus le temps passe.
            if (i.name.equals(COMTE)) {
                qualityDec = -qualityDec;
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
                    qualityDec = -2;
                }

                // Regle La qualité augmente de 3 quand il reste 5 jours ou moins
                if (i.sellIn <= 5) {
                    qualityDec = -3;
                }
            }

            // implementation des premiers regles
            i.sellIn -= sellInDec;
            i.quality -= qualityDec;


            // Regle mais la qualité tombe à 0 une fois le concert passé.
            if ((i.sellIn < 0) && (i.name.equals(PASS_VIP_CONCERT))) {
                i.quality = 0;
            }

            // Regle La qualité (`quality`) d'un produit n'est jamais plus grande que 50.
            if (i.quality > 50) {
                i.quality = 50;
            }

            // Regle La qualité (`quality`) d'un produit ne peut jamais être négative.
            if (i.quality < 0) {
                i.quality = 0;
            }
        }
    }
}
