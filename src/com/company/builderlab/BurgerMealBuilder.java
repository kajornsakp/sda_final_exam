/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.builderlab;

/**
 *
 * @author boonjv
 */
/** Concrete builder for a meal with a burger, fries, and a cola. */
public class BurgerMealBuilder extends MealBuilder {

    @Override
    public void buildEntree() {
        this.theMeal.setEntree("A burger");
    }

    @Override
    public void buildSide() {
        this.theMeal.setSide("fries");
    }

    @Override
    public void buildDrink() {
        this.theMeal.setDrink("Cola");
    }

}