
package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species) {
        super(species);
    }

    @Override
    public void beEaten() throws Exception {
        throw new Exception("You can not eat these animals in EU!");
    }
}