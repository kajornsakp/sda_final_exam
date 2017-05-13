package com.company.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by kajornsak on 3/26/2017 AD.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int current = 0;
    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return current < menuItems.length;
    }

    @Override
    public Object next() {
        return menuItems[current++];
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {
        //for java 8 only
    }
}

