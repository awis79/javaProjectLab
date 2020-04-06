package com.company;

import javax.swing.plaf.metal.MetalDesktopIconUI;
import java.io.File;

public abstract class Animal implements Edible, Saleable{
    final String species;
    String name;
    protected Double weight;
    File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;


    public Animal(String species) {
        this.species = species;
        if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        } else if (species == "mouse") {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
    }

    void feed() {
        if (weight <= 0) {
            System.out.println("too late, sorry");
        } else {
            weight ++;
            System.out.println("thx for food my weight is now " + this.weight);
        }
    }

    void takeForAWalk(){
        weight--;
        if(weight <= 0){
            System.out.println("that a dead animal you freak");
        } else if(weight <= 3){
            System.out.println("thx I'm hungry");
        }else{
            System.out.println("thx for a walk");
        }
    }
    public String toString(){
        return this.species + "" + this.name;
    }

    @Override
    public void beEaten() throws Exception {
        if(this instanceof Human){
            throw new Exception("no way bustard are you cannibal od something!");
        }
        System.out.printf(this.toString() + "adioooooos");
        weight = 0.0;
    }
    @Override
    public void sell() throws Exception {
        if(this instanceof Human){
            throw new Exception("NO you cant do this!");
        }
        System.out.printf(this.toString() + "bonjiorno!");
    }
}