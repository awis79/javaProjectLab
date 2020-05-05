package com.company.devices;

import java.net.MalformedURLException;
import java.net.URL;

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

    public void installAnApp(String appName) throws MalformedURLException {
        this.installAnApp(appName, "latest");
    }

    public void installAnApp(String appName, String version) throws MalformedURLException {
        URL url = new URL("https", "https://ourAppStore/" + appName + "/" + version, 546, appName);
        this.installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("App installed " + url.getFile());
    }

    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    public String toString() {
        return "Phone: " + this.producer + " " + this.model + " " + this.screenSize;
    }
}