package com.company;

public class Car {
    public final String producer;
    public final String model;
    public final Integer rej;
    public final Double engineVolume;

    public String plates;

    public Car(String producer, String model, Integer rej, Double engineVolume) {
        this.producer = producer;
        this.model = model;
        this.rej = rej;
        this.engineVolume = engineVolume;
    }
}
