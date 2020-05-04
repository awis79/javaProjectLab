package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    private Double value = 3200.0;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void turnOn();

    public Double getValue() {
        return this.value;
    }

    public String toString() {
        return this.producer + " " + this.model;
    }

    public void sell() {
        System.out.println("Now you sold " + this);
    }
}