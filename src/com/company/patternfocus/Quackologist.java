package com.company.patternfocus;

/**
 * Created by kajornsak on 4/10/2017 AD.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("I saw " + quackObservable + " quacked");
    }
}
