package com.company;

import devices.Car;
import devices.Phone;

public class Human extends Animal {
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    private Car car;

    //v 1
    private Double salary = 200.0;

    public Human(String species) {
        super("homo sapiens");
        this.weight = 90.0;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCar(Car car) {
        if (car.getValue() <= this.salary) {
            System.out.println("Great you can buy it by cash");
            this.car = car;
        } else if (car.getValue() <= this.salary * 12) {
            System.out.println("Not so great, but you can buy it on credit");
            this.car = car;
        } else {
            System.out.println("Sorry, get a rise or find another car");
        }
    }

    public Car getCar() {
        return this.car;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.salary;
    }
}