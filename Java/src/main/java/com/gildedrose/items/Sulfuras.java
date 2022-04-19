package com.gildedrose.items;

import com.gildedrose.Item;

public class Sulfuras extends ShopItem {

    final int LEGENDARY_QUALITY = 80;

    public Sulfuras(Item item) {
        super(item);
    }


    public void updateQuality() {
        if (this.item.sellIn < 0) {
            this.item.sellIn = 0;
        }

        this.item.quality = LEGENDARY_QUALITY;
    }
}
