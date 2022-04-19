package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends ShopItem {

    public AgedBrie(Item item) {
        super(item);
    }

    public void updateQuality() {
        this.item.quality = this.item.quality + 1;

        if (this.item.quality > 50) {
            this.item.quality = 50;
        }
    }
}
