package com.magasin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    /**
     * Methode d'affichage : iteration + initial/refactor + magasin
     * @param iteration
     * @param entete
     * @param items
     */
    void afficherConsole(int iteration, String entete, Item[] items) {
        System.out.print("iteration " + iteration + ", " + entete + " : ");
        for (int i=0; i< items.length; i++) {
            System.out.print(items[i].toString() + " - ");
        }
        System.out.println();
    }

    /**
     * Methode de traitement : affichage magasin initial et refactor avant et apres updateQuality
     * @param app
     * @param app_modif
     * @param j
     */
    private void traitment(Magasin app, Magasin_refactor app_modif, int j) {
        afficherConsole(j,"initial ", app.items);
        afficherConsole(j,"refactor", app_modif.items);
        app.updateQuality();
        app_modif.updateQuality();
        afficherConsole(j,"initial ", app.items);
        afficherConsole(j,"refactor", app_modif.items);
    }

    /**
     * Methode de test d'un magasin de comte
     */
    @Test
    void testComte() {

        // initialisation variables locales
        String product = "Comté";
        int nombreIteration = 200;

        // initialisation du magasin avec tous les cas
        Item[] items = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };
        Item[] items2 = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };

        // initialisation des magasins initial / refactor
        Magasin app = new Magasin(items);
        Magasin_refactor app_modif = new Magasin_refactor(items2);

        // boucle du nombre de traitement
        for (int j=0; j<nombreIteration; j++) {
            traitment(app, app_modif, j);

            // boucle de test sur tous les articles du magasin
            for (int i=0; i< app.items.length; i++) {
                assertEquals(items[i].quality, items2[i].quality);
            }
        }
    }

    /**
     * Methode de test d'un magasin de Kryptonique
     */
    @Test
    void testKryptonique() {

        // initialisation variables locales
        String product = "Kryptonique";
        int nombreIteration = 200;

        // initialisation du magasin avec tous les cas
        Item[] items = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };
        Item[] items2 = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };

        // initialisation des magasins initial / refactor
        Magasin app = new Magasin(items);
        Magasin_refactor app_modif = new Magasin_refactor(items2);

        // boucle du nombre de traitement
        for (int j=0; j<nombreIteration; j++) {
            traitment(app, app_modif, j);

            // boucle de test sur tous les articles du magasin
            for (int i=0; i< app.items.length; i++) {
                assertEquals(items[i].quality, items2[i].quality);
            }
        }
    }

    /**
     * Methode de test d'un magasin de PassVipConcert
     */
    @Test
    void testPassVipConcert() {

        // initialisation variables locales
        String product = "Pass VIP Concert";
        int nombreIteration = 200;

        // initialisation du magasin de comte avec tous les cas
        Item[] items = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };
        Item[] items2 = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };

        // initialisation des magasins initial / refactor
        Magasin app = new Magasin(items);
        Magasin_refactor app_modif = new Magasin_refactor(items2);

        // boucle du nombre de traitement
        for (int j=0; j<nombreIteration; j++) {
            traitment(app, app_modif, j);

            // boucle de test sur tous les articles du magasin
            for (int i=0; i< app.items.length; i++) {
                assertEquals(items[i].quality, items2[i].quality);
            }
        }
    }


    /**
     * Methode de test d'un magasin de produits normaux
     */
    @Test
    void testPassNormaux() {

        // initialisation variables locales
        String product = "Jambon";
        int nombreIteration = 200;

        // initialisation du magasin de comte avec tous les cas
        Item[] items = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };

        // initialisation des magasins initial / refactor
        Item[] items2 = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };

        Magasin app = new Magasin(items);
        Magasin_refactor app_modif = new Magasin_refactor(items2);

        // boucle du nombre de traitement
        for (int j=0; j<nombreIteration; j++) {
            traitment(app, app_modif, j);

            // boucle de test sur tous les articles du magasin
            for (int i=0; i< app.items.length; i++) {
                assertEquals(items[i].quality, items2[i].quality);
            }
        }
    }


    /**
     * Methode de test d'un magasin de produits pouvoirs magiques
     */
    @Test
    void testPassPouvoirsMagiques() {

        // initialisation du magasin de produits normaux avec tous les cas
        String product = "Produits Normaux ";
        Item[] items = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };

        // initialisation des magasins initial / refactor
        product = "Pouvoirs magiques";
        Item[] items2 = new Item[] {
                new Item(product, 100, 50),
                new Item(product, 100, 25),
                new Item(product, 100, 5),
                new Item(product, 50, 50),
                new Item(product, 50, 25),
                new Item(product, 50, 5),
                new Item(product, 5, 50),
                new Item(product, 5, 25),
                new Item(product, 5, 5)      };

        // initialisation variables locales
        int nombreIteration = 200;
        int[] qualityNormauxInitial = new int[items.length];
        int[] qualityNormauxModif = new int[items.length];
        int[] qualityMagiquesInitial = new int[items.length];
        int[] qualityMagiquesModif = new int[items.length];
        Magasin_refactor app_normaux = new Magasin_refactor(items);
        Magasin_refactor app_magiques = new Magasin_refactor(items2);

        // boucle du nombre de traitement
        for (int j=0; j<nombreIteration; j++) {

            // quality des items du magasin avant traitement
            for (int i=0; i<items.length; i++) {
                qualityNormauxInitial[i] = items[i].quality;
                qualityMagiquesInitial[i] = items2[i].quality;
            }

            // affichage des magasins avant traitement
            afficherConsole(j,"normaux  : ", app_normaux.items);
            afficherConsole(j,"magiques : ", app_magiques.items);

            // traitement
            app_normaux.updateQuality();
            app_magiques.updateQuality();

            // affichage des magasins apres traitement
            afficherConsole(j,"normaux  : ", app_normaux.items);
            afficherConsole(j,"magiques : ", app_magiques.items);

            // quality des items du magasin avant traitement
            for (int i=0; i<items.length; i++) {
                qualityNormauxModif[i] = items[i].quality;
                qualityMagiquesModif[i] = items2[i].quality;
            }

            // boucle de test sur tous les articles du magasin
            // la difference de quality est 2x plus importantes sur les produits magiques
            for (int i=0; i< app_normaux.items.length; i++) {
                if (items2[i].quality != 0) {
                    assertEquals((qualityNormauxModif[i] - qualityNormauxInitial[i]) * 2,
                            (qualityMagiquesModif[i] - qualityMagiquesInitial[i]));
                }
            }
        }
    }

}
