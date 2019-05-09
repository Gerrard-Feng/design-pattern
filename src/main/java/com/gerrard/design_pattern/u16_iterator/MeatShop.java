package com.gerrard.design_pattern.u16_iterator;

import java.util.LinkedList;
import java.util.List;

public final class MeatShop {

    private List<String> products = new LinkedList<>();

    public void addProduct(String product) {
        products.add(product);
    }

    public List<String> getProducts() {
        return products;
    }
}
