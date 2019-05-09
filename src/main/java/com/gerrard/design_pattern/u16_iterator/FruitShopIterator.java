package com.gerrard.design_pattern.u16_iterator;

import java.util.Iterator;

public final class FruitShopIterator implements Iterator<String> {

    private String[] products = new String[MAX_PRODUCT];
    private int index = 0;

    private int iteratorIndex = 0;

    private static final int MAX_PRODUCT = 10;

    public void addProduct(String product) {
        if (index < MAX_PRODUCT) {
            products[index++] = product;
        } else {
            throw new RuntimeException("FruitShop is full");
        }
    }

    @Override
    public boolean hasNext() {
        return iteratorIndex < index;
    }

    @Override
    public String next() {
        return products[iteratorIndex++];
    }
}
