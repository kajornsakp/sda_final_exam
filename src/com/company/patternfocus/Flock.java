package com.company.patternfocus;

import java.util.ArrayList;

/**
 * Created by kajornsak on 4/10/2017 AD.
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackables = new ArrayList<>();

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        for(Quackable quackable: quackables){
            quackable.quack();
            if(!(quackable instanceof Flock)){
                notifyObservers();
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quackable : quackables){
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
