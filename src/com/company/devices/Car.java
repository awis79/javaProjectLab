package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;

public abstract class Car extends Device implements Comparable{

    public ArrayList<Transaction> listOfTransactions = new ArrayList<Transaction>();

    public Car (String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction);
    }

    public String toString(){
        return super.toString() + " " + this.value;
    }

    @Override
    public void turnOn() {
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.hasCar(this)) throw new Exception("sorry I have not got a car");
        if (buyer.isFreeSpot()) throw new Exception("sorry you have not got enough space in garage");
        if (buyer.cash < price) throw new Exception("sorry but you have not got enough money");
        if (this.listOfTransactions.get(this.listOfTransactions.size() - 1).buyer != seller)
            throw new Exception("sorry but you are not an owner of the car");
        buyer.cash -= price;
        seller.cash += price;
        buyer.buyCar(this);
        seller.sellCar(this);
        this.listOfTransactions.add(new Transaction(seller, buyer, price, "26.05.2020"));
        System.out.println("Ms/Mr " + buyer.firstName + " bought from Ms/Mr " + seller.firstName + " " + buyer.pet.name + " for price:  " + price);
    }

    @Override
    public int compareTo(Car o) {
        int result = this.yearOfProduction.compareTo(o.yearOfProduction);
        return -result;
    }

    public boolean wasOwner(Human owner) {
        if (owner == this.listOfTransactions.get(0).buyer) return true;
        for (Transaction listOfTransaction : this.listOfTransactions) {
            if (owner == listOfTransaction.seller) return true;
        }
        return false;
    }

    public boolean wasSold(Human seller, Human buyer) {
        for (Transaction listOfTransaction : this.listOfTransactions) {
            if (seller == listOfTransaction.seller && buyer == listOfTransaction.buyer)
                return true;
        }
        return false;
    }

    public int numberOfTransactions() {
        return this.listOfTransactions.size();
    }

    public abstract void refuel();

    public abstract void reFuel();
}