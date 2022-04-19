package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured extends ShopItem {


    public Conjured(Item item) {
        super(item);
    }

    public void updateQuality() {
        if (this.item.quality > 0) {
            this.item.quality = this.item.quality - 2;
        }
    }
}
