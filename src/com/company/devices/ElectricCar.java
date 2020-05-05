package com.company.devices;

public class ElectricCar extends Car{
    public ElectricCar(String producer, String model, String color, Integer yearOfProduction, Double engineVolumne) {
        super(producer, model, color, yearOfProduction, engineVolumne);
        this.producer = "Tesla";
        this.model = "SUPER";
        this.color = "black";
        this.yearOfProduction = 2018;
        this.engineVolume = 150.0;
    }
}
