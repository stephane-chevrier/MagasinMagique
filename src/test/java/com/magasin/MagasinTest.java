package com.magasin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

//    @Test
//    void foo() {
//        Item[] items = new Item[] { new Item("foo", 0, 0) };
//        Magasin app = new Magasin(items);
//        app.updateQuality();
////        assertEquals("fixme", app.items[0].name);
//    }


    @Test
    void test() {
        Item[] items = new Item[] {
                new Item("Comté", 100, 50),
                new Item("Kryptonite", 100, 50),
                new Item("Pass VIP Concert", 100, 50),
                new Item("Jambon", 100, 50),
                new Item("Comté", 50, 50),
                new Item("Kryptonite", 50, 50),
                new Item("Pass VIP Concert", 50, 50),
                new Item("Jambon", 50, 50),
                new Item("Comté", 100, 25),
                new Item("Kryptonite", 100, 25),
                new Item("Pass VIP Concert", 100, 25),
                new Item("Jambon", 100, 25)         };
        Item[] items2 = new Item[] {
                new Item("Comté", 100, 50),
                new Item("Kryptonite", 100, 50),
                new Item("Pass VIP Concert", 100, 50),
                new Item("Jambon", 100, 50),
                new Item("Comté", 50, 50),
                new Item("Kryptonite", 50, 50),
                new Item("Pass VIP Concert", 50, 50),
                new Item("Jambon", 50, 50),
                new Item("Comté", 100, 25),
                new Item("Kryptonite", 100, 25),
                new Item("Pass VIP Concert", 100, 25),
                new Item("Jambon", 100, 25)        };

        Magasin app = new Magasin(items);
        Magasin_modif app_modif = new Magasin_modif(items2);

        for (int j=0; j<200; j++) {
            app.updateQuality();
            app_modif.updateQuality();
            System.out.print("");
            for (int i=0; i< app.items.length; i++) {
                assertEquals(items[i].quality, items2[i].quality);
            }
        }
        System.out.println("terminé");
    }
}
