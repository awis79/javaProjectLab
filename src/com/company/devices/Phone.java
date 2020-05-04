package com.company.devices;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {
    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, String color, Double screenSize, boolean isAndroid, Integer yearOfProduction) {
        super(producer, model, color, yearOfProduction);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public Phone(String producer, String model, String color, int year, Double screenSize, boolean isAndroid) {
        super(producer, model, color, year);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public void installAnApp(URL url) {
        System.out.println("New app has been installed: " + url.getFile());
    }

    public void installAnApp(String appName, String version) throws MalformedURLException {
        URL url = new URL("https", "ourAppStore.com", 443, appName + "/" + version);
        this.installAnApp(url);
    }

    public void installAnApp(String appName) throws MalformedURLException {
        this.installAnApp(appName, "latest");
    }

    public void installAnApp(String[] appNames) throws MalformedURLException {
        for(String appName : appNames) {
            installAnApp(appName);
        }
    }

    @Override
    void turnOn() {
        System.out.println("hello world");
    }
}