package com.company.devices;

public class DieselCar extends Car{
    public DieselCar(String producer, String model, String color, Integer yearOfProduction, Double engineVolumne) {
        super(producer, model, color, yearOfProduction, engineVolumne);
        this.producer = "VW";
        this.model = "Golf4";
        this.color = "white";
        this.yearOfProduction = 2008;
        this.engineVolume = 170.0;
    }
}
