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
        afficherConsole(j,"refactor  ", app_modif.items);
        app.updateQuality();
        app_modif.updateQuality();
        afficherConsole(j,"initial", app.items);
        afficherConsole(j,"refactor ", app_modif.items);
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

    @Test
    void testPassJambon() {

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
}
