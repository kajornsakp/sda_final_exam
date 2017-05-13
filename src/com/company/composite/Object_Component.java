package com.company.composite;

import java.util.Iterator;

/**
 * Created by kajornsak on 3/26/2017 AD.
 */
public abstract class Object_Component{
    public abstract void render();

    public abstract float volume();

    public abstract Iterator createIterator();
}
