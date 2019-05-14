package com.gerrard.design_pattern.u08_composite;

import java.util.Iterator;

public final class LeafIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
