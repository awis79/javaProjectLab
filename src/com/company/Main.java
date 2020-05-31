package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.DieselCar;
import com.company.devices.Transaction;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Homo sapiens", 3);
        DieselCar firstCar = new DieselCar("Focus", "Ford", 2006, 5000.0);
        DieselCar secondCar = new DieselCar("A5", "Audi", 2020, 100000.0);
        DieselCar thirdCar = new DieselCar("Toledo", "Seat", 2002, 7000.0);
        DieselCar fourthCar = new DieselCar("Golf", "VW", 2008, 20000.0);
        DieselCar fifthCar = new DieselCar("126p", "Fiat", 1098, 10000.0);
        DieselCar sixthCar = new DieselCar("Mondeo", "Ford", 2010, 30000.0);
        DieselCar seventhCar = new DieselCar("Polo", "VW", 2008, 12000.0);
        DieselCar eighthCar = new DieselCar("Leon", "Seat", 2006, 9000.0);
        DieselCar ninthCar = new DieselCar("Fabia", "Skoda", 2004, 3000.0);
        DieselCar tenthCar = new DieselCar("A4", "Audi", 2005, 15000.0);

        Human firstOwner = new Human("homo sapiens sapiens", 3);
        firstOwner.firstName = "Maniek";
        Human secondOwner = new Human("homo sapiens sapiens", 3);
        secondOwner.firstName = "Franek";
        Human thirdOwner = new Human("homo sapiens sapiens", 3);
        thirdOwner.firstName = "Gerald";

        Transaction firstTransaction = new Transaction(firstOwner, secondOwner, 6000.0, "10.11.2019");
        Transaction secondTransaction = new Transaction(secondOwner, thirdOwner, 100000.0, "25.01.2010");
        Transaction thirdTransaction = new Transaction(thirdOwner, me, 50000.0, "22.01.2020");

        firstCar.listOfTransactions.add(firstTransaction);
        fifthCar.listOfTransactions.add(secondTransaction);
        firstCar.listOfTransactions.add(thirdTransaction);

        me.setSalary(1000000.0);
        me.setCar(fifthCar, 0);
        me.setCar(secondCar, 2);
        me.setCar(thirdCar, 1);
        me.sortGarage();
        me.firstName = "Rafał";
        me.cash = 50000.0;

        Human buyer = new Human("homo sapiens sapiens", 0);
        buyer.setSalary(100000.0);
        buyer.firstName = "Karol";
        buyer.cash = 1000000.0;
        buyer.setCar(seventhCar, 0);
        buyer.setCar(tenthCar, 2);

        System.out.println(me.getCar(0));
        System.out.println(me.getCar(1));
        System.out.println(me.getCar(2));
        System.out.println(buyer.getCar(0));
        System.out.println(buyer.getCar(1));
        System.out.println(buyer.getCar(2));
        try {
            firstCar.sell(me, buyer, 20000.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(buyer.cash);
        System.out.println(me.cash);
        System.out.println(buyer.getCar(0));
        System.out.println(buyer.getCar(1));
        System.out.println(buyer.getCar(2));

        for (int i = 0; i < firstCar.listOfTransactions.size(); i++) {
            System.out.println(firstCar.listOfTransactions.get(i));
        }

        System.out.println(firstCar.wasOwner(me));
        System.out.println(firstCar.wasSold(buyer, me));
        System.out.println(firstCar.numberOfTransactions());

        Animal dog = new Pet("dog");
        dog.name = "Akita";

        dog.feed();

        Animal lion = new Pet("lion");
        lion.name = "leo";

        lion.feed();
    }
}