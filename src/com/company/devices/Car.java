package com.company.devices;

public class Car extends Device {

    public final Double engineVolume;

    public String plates;


    public Car(String producer, String model, String color, Integer yearOfProduction, Double engineVolumne) {
        super(producer, model, color, yearOfProduction);
        this.engineVolume = engineVolumne;
    }

    @Override
    void turnOn() {
        System.out.println("yeah now you can drive around");
    }

    public String toString() {
        return super.toString() + " " + this.plates;
    }
}