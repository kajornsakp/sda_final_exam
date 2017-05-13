package com.company.patternfocus;

/**
 * Created by kajornsak on 4/10/2017 AD.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}

