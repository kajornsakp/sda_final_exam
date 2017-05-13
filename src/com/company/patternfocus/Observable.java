package com.company.patternfocus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kajornsak on 4/10/2017 AD.
 */
public class Observable implements QuackObservable{
    List<Observer> observerList = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update(duck);
        }
    }
}
