package com.company.patternfocus;

/**
 * Created by kajornsak on 4/10/2017 AD.
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int quackCount = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }
    static int getQuacks(){
        return quackCount;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
