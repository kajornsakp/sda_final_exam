package com.company.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by kajornsak on 3/26/2017 AD.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int current = 0;
    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return current < menuItems.size();
    }

    @Override
    public Object next() {
        return menuItems.get(current++);
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {
        // java 8 only
    }
}
