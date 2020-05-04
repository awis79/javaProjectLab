package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    private Car car;

    //v 1
    private Double salary = 500.0;

    public Human() {
        super("Human");
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
            System.out.println("Not so good, but you can buy it on credit");
            this.car = car;
        } else {
            System.out.println("Sorry, you can not buy this car");
        }
    }

    public Car getCar() {
        return this.car;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}