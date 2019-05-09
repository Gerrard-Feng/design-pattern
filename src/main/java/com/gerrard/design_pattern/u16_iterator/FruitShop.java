package com.gerrard.design_pattern.u16_iterator;

import java.util.Arrays;

public final class FruitShop {

    private String[] products = new String[MAX_PRODUCT];
    private int index = 0;

    private static final int MAX_PRODUCT = 10;

    public void addProduct(String product) {
        if (index < MAX_PRODUCT) {
            products[index++] = product;
        } else {
            throw new RuntimeException("FruitShop is full");
        }
    }

    public String[] getProducts() {
        return Arrays.copyOf(products, index);
    }
}
