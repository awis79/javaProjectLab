package com.company;

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
    }
}