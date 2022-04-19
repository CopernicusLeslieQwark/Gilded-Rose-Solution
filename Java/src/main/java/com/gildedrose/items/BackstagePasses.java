package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses extends ShopItem {

    //there was a mistake in the first TexttestFixture
    //the quality only whent up by 1
    //requirements ask to up by 3 or 5 when sell date nears

    public BackstagePasses(Item item) {
        super(item);
    }

    public void updateQuality() {
        if (this.item.sellIn == 0) {
            this.item.quality = 0;
            return;
        }

        if (this.item.sellIn <= 5) {
            this.item.quality = this.item.quality + 3;
            return;
        }

        if (this.item.sellIn <= 10) {
            this.item.quality = this.item.quality + 2;
            return;
        }

        this.item.quality = this.item.quality + 1;
    }
}
