package com.gerrard.design_pattern.u08_composite;

import java.util.Iterator;
import java.util.Stack;

public final class CompositeIterator<T> implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator iterator = (Iterator) stack.peek();
        if (iterator.hasNext()) {
            return true;
        }
        stack.pop();
        return hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        Iterator<T> iterator = (Iterator) stack.peek();
        T composite = iterator.next();
        if (composite instanceof Company) {
            stack.push(((Company) composite).createIterator());
        }
        return composite;
    }
}
