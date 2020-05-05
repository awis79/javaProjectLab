package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    public String producer;
    public String model;
    public String color;
    public Integer yearOfProduction;
    protected Double value = 3200.0;

    public Device(String producer, String model, String color, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public Device(String producer, String model, Integer yearOfProduction) {
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