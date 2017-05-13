package com.company.patternfocus;

/**
 * Created by kajornsak on 4/10/2017 AD.
 */
public class GooseAdapter implements Quackable {
    Observable observable = new Observable(this);
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Goose";
    }
}
