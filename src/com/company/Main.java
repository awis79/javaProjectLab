package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal dog = new Animal("dog");
        dog.name = "Akita";

        dog.feed();

        Animal lion = new Animal("dog");
        lion.name = "leo";

        lion.feed();

        Human me = new Human();
        me.fisrtName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        me.pet.feed();
    }


}