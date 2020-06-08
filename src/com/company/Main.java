package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Application;
import com.company.devices.DieselCar;
import com.company.devices.Transaction;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Homo sapiens", 3);


        Phone phone = new Phone("iPhone", "12", 6.0, false, 2020);

        me.phone = phone;
        me.cash = 10000.0;

        Application firstapp = new Application("Facebook", 0.0);
        Application secondapp = new Application("Whatsapp", 75.8);
        Application thirdapp = new Application("Messenger", 16.9);
        Application fourthapp = new Application("Instagram", 15.2);
        Application fifthapp = new Application("Chrome", 32.0);

        try {
            phone.installApp(me, fifthapp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            phone.installApp(me, firstapp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            phone.installApp(me, secondapp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        phone.isAppInstalled(firstapp);
        phone.isAppInstalled(secondapp);
        phone.isAppInstalled(thirdapp);
        phone.isAppInstalledv2(fourthapp);
        phone.isAppInstalledv2(fifthapp);

        System.out.println(phone.appsValue());
        phone.appsForFree();
        phone.sortAppsAlphabetic();
        phone.sortAppsPrice();
    }
}