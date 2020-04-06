package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";

        dog.feed();

        Animal lion = new Animal("lion");
        lion.name = "leo";

        lion.feed();

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        Car dirtyOne = new Car("Fiat", "Bravo", 2014, 1.8);
        dirtyOne.plates = "GDA1234";
        me.setCar(dirtyOne);

        System.out.println(me.getCar().plates);

        System.out.println("I earn " + me.getSalary() + "UZB");

        Human czlek = new Human();
        czlek.firstName = "Maniek";
        czlek.lastName = "Mamut";
        czlek.setSalary(5000.0);

        Car clenaOne = new Car("Fiat", "Bravo", 2014, 1.8);
        czlek.setCar(clenaOne);

        System.out.println(me.getCar());
        System.out.println(czlek.getCar());
        System.out.println(me);
        System.out.println(me.pet);

        System.out.println(czlek.getCar());
        System.out.println(czlek.pet);
        System.out.println(czlek.phone);

        System.out.println(me.species);
        me.feed();

        System.out.println(me instanceof  Human);
        System.out.println(me instanceof  Animal);
        System.out.println(dirtyOne instanceof Object);

        System.out.println(new Phone("Nokia", "3310", 1.0, false, 2000) instanceof Object);


        try {
            me.pet.beEaten();
            me.beEaten();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            me.pet.sell();
        } catch (Exception e) {
            e.printStackTrace();
        }
        me.getCar().sell();
        me.sell();

    }
}