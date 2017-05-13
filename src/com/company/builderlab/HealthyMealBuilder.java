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
public class HealthyMealBuilder extends MealBuilder {

    @Override
    public void buildEntree() {
        this.theMeal.setEntree("Chicken sandwich");
    }

    @Override
    public void buildSide() {
        this.theMeal.setSide("Carrot stick");
    }

    @Override
    public void buildDrink() {
        this.theMeal.setDrink("Diet Cola");
    }
    
}
