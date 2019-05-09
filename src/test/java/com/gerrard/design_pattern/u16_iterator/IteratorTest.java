package com.gerrard.design_pattern.u16_iterator;

import org.junit.jupiter.api.Test;

import java.util.List;

public final class IteratorTest {

    @Test
    void testFruitShop() {
        FruitShop fruitShop = new FruitShop();
        fruitShop.addProduct("Apple");
        fruitShop.addProduct("Orange");
        String[] products = fruitShop.getProducts();
        for (String product : products) {
            System.out.println(product);
        }
    }

    @Test
    void testMeatShop() {
        MeatShop meatShop = new MeatShop();
        meatShop.addProduct("Beef");
        meatShop.addProduct("Pork");
        List<String> products = meatShop.getProducts();
        for (String product : products) {
            System.out.println(product);
        }
    }

    @Test
    void testFruitShopIterator() {
        FruitShopIterator fruitShop = new FruitShopIterator();
        fruitShop.addProduct("Apple");
        fruitShop.addProduct("Orange");
        while (fruitShop.hasNext()) {
            System.out.println(fruitShop.next());
        }
    }

    @Test
    void testMeatShopIterator() {
        MeatShopIterator meatShop = new MeatShopIterator();
        meatShop.addProduct("Beef");
        meatShop.addProduct("Pork");
        while (meatShop.hasNext()) {
            System.out.println(meatShop.next());
        }
    }
}
