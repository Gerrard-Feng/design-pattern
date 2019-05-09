package com.gerrard.design_pattern.u16_iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class MeatShopIterator implements Iterator<String> {

    private List<String> products = new LinkedList<>();
    private int iteratorIndex = 0;

    public void addProduct(String product) {
        products.add(product);
    }

    @Override
    public boolean hasNext() {
        return iteratorIndex < products.size();
    }

    @Override
    public String next() {
        return products.get(iteratorIndex++);
    }
}
