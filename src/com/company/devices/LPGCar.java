package com.company.devices;

public abstract class LPGCar extends Car {
    public LPGCar(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
    }

    @Override
    public void reFuel() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}