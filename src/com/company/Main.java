package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        Animal dog = new Pet("dog");
        dog.name = "Akita";

        dog.feed();

        Animal lion = new Pet("lion");
        lion.name = "leo";

        lion.feed();

        Human me = new Human();
        me.firstName = "Alan";
        me.lastName = "Wiśniewski";
        me.pet = dog;

        Car firstCar = new Car("Ford", "Focus", "red",2006, 1.6);
        firstCar.plates = "GKW123";
        me.setCar(firstCar);
        me.phone = new Phone("Samsung", "Galaxy S20", 6.1, true, 2020);


        System.out.println(me.getCar().plates);

        System.out.println("I earn " + me.getSalary() + "UZB");

        Human woman = new Human();
        woman.firstName = "Ola";
        woman.lastName = "Nowak";
        woman.setSalary(5500.0);

        Car secondCar = new Car("Fiat", "Bravo", "black",2014, 1.8);
        woman.setCar(secondCar);

        System.out.println(me.getCar());
        System.out.println(woman.getCar());
        System.out.println(me);

        System.out.println(me.pet);

        System.out.println(me.species);

        System.out.println(new Phone("Nokia", "3310", 1.0, false, 2000) instanceof Object);

        me.setSalary(null);
        System.out.println(me.getSalary());

        FarmAnimal cow = new FarmAnimal("cow");

        String[] apps = {"chrome", "messenger"};

        me.phone.installAnApp("chrome");
        me.phone.installAnApp("chrome","38.0");
        me.phone.installAnApp(apps);
        me.phone.installAnApp(new URL("https", "https://googleserver/chrome/38.0", 465, "chrome"));

        Animal parrot = new Pet("parrot");
        Animal pig = new FarmAnimal("pig");
        Animal myBrother = new Human();

        System.out.println(parrot.toString());
        System.out.println(cow.toString());
        System.out.println(myBrother.toString());

        me.feed();

        me.pet.feed();
        me.pet.feed(0.2);
    }
}