package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.net.MalformedURLException;

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

        me.setSalary(null);
        System.out.println(me.getSalary());

        FarmAnimal cow = new FarmAnimal("cow");

        try {
            cow.beEaten();
            me.pet.beEaten();
        } catch (Exception e) {
            e.printStackTrace();
        }

        me.phone = new Phone("Apple","Iphone SE","white",2020,6.1,false);

        me.phone.installAnApp("facebook");
        me.phone.installAnApp("safari","2.0");
        me.phone.installAnApp(new String[] {"messenger", "youtube"});

    }
}