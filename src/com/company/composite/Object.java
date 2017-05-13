package com.company.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kajornsak on 3/26/2017 AD.
 */
public class Object extends Object_Component {
    ArrayList<Object_Component> components;

    public Object() {
        this.components = new ArrayList<>();
    }


    @Override
    public void render() {

    }

    @Override
    public float volume() {
        return 0.0f;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(components.iterator());
    }

    public void add(Object_Component object_component) {
        components.add(object_component);
    }
}
