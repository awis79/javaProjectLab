package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Edible, Saleable {
    final public String species;
    public String name;
    protected Double weight;
    File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;
    private final static Double DEFAULT_FOOD_WEIGHT = 1.0;


    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
        }
    }

    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double feedWeight){
        if (weight <= 0){
            System.out.println("too late sorry you can not feed it");
        } else {
            weight += feedWeight;
            System.out.println("you fed me thx my weight is " + this.weight + " now");
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("That a dead animal");
        } else if (weight <= 3) {
            System.out.println("I'm hungry");
        } else {
            System.out.println("I am tired! Thank u for a walk");
        }
    }

    public String toString() {
        return this.species + " " + this.name + " " + weight;
    }

    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human) {
            throw new Exception("No way! Are you cannibal!?");
        }
        System.out.println(this.toString() + "Bonjiorno!");
        weight = 0.0;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) throw new Exception("you can not do it");

        if (seller.pet == null) System.out.println("I have not any pet");
        else {
            if (buyer.cash < price) System.out.println("sorry you have not got enough money");
            else {
                buyer.cash = -price;
                seller.cash = +price;
                buyer.pet = this;
                seller.pet = null;
                System.out.println("Ms/Mr " + buyer.firstName + " bought from Ms/Mr " + seller.firstName + " " + buyer.pet.name + " for price:  " + price);
            }
        }
    }
}