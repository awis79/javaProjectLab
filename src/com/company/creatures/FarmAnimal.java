package com.company.creatures;

public class FarmAnimal extends Animal {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("WOW it bit me");
    }

    public String toString() {
        return "FarmAnimal " + super.toString();
    }
}