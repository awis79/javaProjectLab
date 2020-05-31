package com.company.devices;

import com.company.creatures.Human;
import java.net.URL;

public class Phone extends Device {
    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, Double screenSize, boolean isAndroid, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public String toString() {
        return super.toString() + " " + screenSize + " " + isAndroid;
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    @Override
    void turnOn() {
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.phone == null) System.out.println("I have not got any phone");
        else {
            if (buyer.cash < price) System.out.println("sorry you have not got enough money");
            else {
                buyer.cash = -price;
                seller.cash = +price;
                buyer.phone = this;
                seller.phone = null;
                System.out.println("Ms/Mr " + buyer.firstName + " bought from Ms/Mr " + seller.firstName + " " + buyer.pet.name + " for price:  " + price);
            }
        }
    }

    static final String DEFAULT_SERVER_ADDRESS = "play.google.com";
    static final String DEFAULT_VERSION = "1.11.02";
    static final String DEFAULT_PROTOCOL = "https";


    public void installApp(String appName) {
        System.out.println("You installed " + appName);
    }

    public void installApp(String appName, String version) {
        System.out.println("You installed " + appName + " version: " + version);
    }

    public void installApp(String appName, String version, String serverAdress) {
        System.out.println("You installed " + appName + " version: " + version + " " + " from server: " + serverAdress);
    }

    public void installApp(String[] appNames) {
        for (String appName : appNames) {
            installApp(appName);
        }
    }

    public void installApp(URL appURL) {
        System.out.println("You installed " + appURL);
    }
}