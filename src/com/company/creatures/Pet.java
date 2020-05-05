
package com.company.creatures;

public class Pet extends Animal {
    private static final double DEFAULT_FOOD_WEIGHT = 1.0;

    public Pet(String species) {
        super(species);
    }

    @Override
    public void beEaten() throws Exception {
        throw new Exception("You can not eat these animals in EU!");
    }

    public void feed(){
        feed(DEFAULT_FOOD_WEIGHT);
    }

    private void feed(double defaultFoodWeight) {
    }
}