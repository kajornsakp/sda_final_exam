package com.company.patternfocus;

public class Main {

    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flocks = new Flock();
        flocks.add(mallardDuck);
        flocks.add(redheadDuck);
        flocks.add(duckCall);
        flocks.add(rubberDuck);
        flocks.add(gooseDuck);

        Quackable rubberDuck1 = duckFactory.createRubberDuck();
        Quackable rubberDuck2 = duckFactory.createRubberDuck();
        Quackable rubberDuck3 = duckFactory.createRubberDuck();
        Quackable rubberDuck4 = duckFactory.createRubberDuck();

        Flock subFlocks = new Flock();
        subFlocks.add(rubberDuck1);
        subFlocks.add(rubberDuck2);
        subFlocks.add(rubberDuck3);
        subFlocks.add(rubberDuck4);
        flocks.add(subFlocks);
        flocks.quack();
        System.out.println();
        Observer quackologist = new Quackologist();
        flocks.registerObserver(quackologist);
        flocks.quack();
        System.out.println(QuackCounter.getQuacks()+" counted");
    }
}


