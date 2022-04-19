package com.gildedrose.items;

import com.gildedrose.Item;

public class ShopItem {

    public Item item;

    final int DEFAULT_QUALITY_DECREASE = 1;

    public ShopItem(Item item) {
        this.item = item;
    }

    public void updateSellIn() {
        this.item.sellIn = this.item.sellIn - 1;
        if (this.item.sellIn <= 0) {
            this.item.sellIn = 0;
        }
    }

    public void updateQuality() {
        if (this.item.sellIn == 0) {
            this.item.quality = this.item.quality - 2;
        } else {
            this.item.quality = this.item.quality - DEFAULT_QUALITY_DECREASE;
        }

        if (this.item.quality < 0) {
            this.item.quality = 0;
        }
    }
}
