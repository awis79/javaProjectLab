package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

import java.util.Arrays;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public Double cash;
    private Car[] garage;

    private Double salary = 500.0;
    private Date checkDate = new Date();
    private Double checkSalary = 500.0;

    public Human(String species, Integer garageQuantity) {
        super(species);
        this.garage = new Car[garageQuantity];
    }

    public Double getSalary() {
        System.out.println("Your salary was " + checkSalary + " on date: " + checkDate);
        checkDate = new Date();
        checkSalary = salary;
        return salary;
    }

    public void setSalary(Double sal) {
        if (sal < 0 )
            System.out.println("You can not pay for that!");
        else
        {
            System.out.println("New date was sand. Please get a contract.");
            this.salary = sal;
        }
    }

    public Car getCar(Integer garageLocation) {
        return garage[garageLocation];
    }

    public void setCar(Car newcar, Integer garageLocation) {
        if (salary > newcar.value) {
            this.garage[garageLocation] = newcar;
            System.out.println("You got a car");
        } else if (salary > newcar.value / 12) {
            this.garage[garageLocation] = newcar;
            System.out.println("You need a credit to get it");
        } else System.out.println("Get a raise or change job you cannot do this");
    }

    public Double garageValue() {
        Double totalValue = 0.0;
        for (Car car : this.garage) {
            totalValue += car.value;
        }
        return totalValue;
    }

    public void sortGarage() {
        Arrays.sort(this.garage, Car::compareTo);
    }

    public boolean hasCar(Car auto) {
        for (Car car : this.garage) {
            if (car == auto) return false;
        }
        return true;
    }

    public boolean isFreeSpot() {
        for (Car car : this.garage) {
            if (car == null) return false;
        }
        return true;
    }

    public void buyCar(Car auto) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = auto;
                break;
            }
        }
    }

    public void sellCar(Car auto) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == auto) this.garage[i] = null;
        }
    }
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}