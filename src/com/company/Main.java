package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.DieselCar;
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

        DieselCar firstCar = new DieselCar("Ford", "Focus", 2006);
        me.phone = new Phone("Samsung", "Galaxy S20", 6.1, true, 2020);

        System.out.println("I earn " + me.getSalary() + "UZB");

        Human woman = new Human();
        woman.firstName = "Ola";
        woman.lastName = "Nowak";
        woman.setSalary(5500.0);

        DieselCar secondCar = new DieselCar("Fiat", "Bravo", 2014);

        System.out.println(me);

        System.out.println(me.pet);

        System.out.println(me.species);

        new Phone("Nokia", "3310", 1.0, false, 2000);
        System.out.println(true);

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