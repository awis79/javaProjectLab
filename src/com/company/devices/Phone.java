package com.company.devices;

public class Phone extends Device {
    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, Double screenSize, boolean isAndroid, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    @Override
    void turnOn() {
        System.out.println("hello world");
    }
}