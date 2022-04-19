package com.gildedrose;

import com.gildedrose.items.*;

import java.util.ArrayList;
import java.util.Arrays;

class GildedRose {

    int DECREASE_QUALITY_VALUE = 1;

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        ArrayList<ShopItem> itemList = new ArrayList<>();
        ArrayList<Item> resultList = new ArrayList<Item>();
        Arrays.stream(items).forEach(item -> {
            switch (item.name) {
                case "Aged Brie":
                    itemList.add(new AgedBrie(item));
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    itemList.add(new Sulfuras(item));
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    itemList.add(new BackstagePasses(item));
                    break;
                case "Conjured":
                    itemList.add(new Conjured(item));
                    break;
                default:
                    itemList.add(new ShopItem(item));
            }
        });

        itemList.forEach(item -> {
            item.updateSellIn();
            item.updateQuality();
        });

    }


}
