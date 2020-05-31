package com.company.devices;

public class ElectricCar extends Car {
    public ElectricCar(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
    }

    @Override
    public void refuel() {

    }

    @Override
    public void reFuel() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
