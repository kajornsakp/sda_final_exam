package com.company.patternfocus;

/**
 * Created by kajornsak on 4/10/2017 AD.
 */
public class DuckFactory extends AbstractDuckFactory {

    public Quackable createMallardDuck(){
        return new MallardDuck();
    }
    public Quackable createRedheadDuck(){
        return new RedheadDuck();
    }
    public Quackable createDuckCall(){
        return new DuckCall();
    }
    public Quackable createRubberDuck(){
        return new RubberDuck();
    }
    public Quackable createGooseDuck(){
        return new GooseAdapter(new Goose());
    }
}
