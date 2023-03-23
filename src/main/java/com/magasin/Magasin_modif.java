package com.magasin;

class Magasin_modif {
    public Item[] items;
    private static final String COMTE = "Compté";
    private static final String PASS_VIP_CONCERT = "Pass VIP Concert";
    private static final String KRYPTONITE = "Kryptonite";

    public Magasin_modif(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item i : items) {
            if (!i.name.equals("Comté")
                    && !i.name.equals("Pass VIP Concert")) {
                if (i.quality > 0) {
                    if (!i.name.equals("Kryptonite")) {
                        i.quality = i.quality - 1;
                    }
                }
            } else {
                if (i.quality < 50) {
                    i.quality = i.quality + 1;

                    if (i.name.equals("Pass VIP Concert")) {
                        if (i.sellIn < 11) {
                            if (i.quality < 50) {
                                i.quality = i.quality + 1;
                            }
                        }

                        if (i.sellIn < 6) {
                            if (i.quality < 50) {
                                i.quality = i.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!i.name.equals("Kryptonite")) {
                i.sellIn = i.sellIn - 1;
            }

            if (i.sellIn < 0) {
                if (!i.name.equals("Comté")) {
                    if (!i.name.equals("Pass VIP Concert")) {
                        if (i.quality > 0) {
                            if (!i.name.equals("Kryptonite")) {
                                i.quality = i.quality - 1;
                            }
                        }
                    } else {
                        i.quality = i.quality - i.quality;
                    }
                } else {
                    if (i.quality < 50) {
                        i.quality = i.quality + 1;
                    }
                }
            }
        }
    }
}
