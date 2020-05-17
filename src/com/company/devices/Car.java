package com.company.devices;

public abstract class Car extends Device {

    public Double engineVolume;

    public String plates;

    public boolean whichEngine = false;


    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    void turnOn() {
        System.out.println("yeah now you can drive around");
    }

    public String toString() {
        return super.toString() + " " + this.plates;
    }

    public abstract void reFuel();
}