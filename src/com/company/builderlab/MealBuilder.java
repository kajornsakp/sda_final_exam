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
/** Abstract builder for the Meal objects, supporting all the
 *  operations for building a meal.
 *
 * @author SHUBU
 */
public abstract class MealBuilder {

  protected Meal theMeal;

  // Additional methods here
  public MealBuilder(){
      theMeal = new Meal();
  }
  public Meal getMeal(){
      return theMeal;
  }
  
  public abstract void buildEntree();
  public abstract void buildSide();
  public abstract void buildDrink();
  
  

}