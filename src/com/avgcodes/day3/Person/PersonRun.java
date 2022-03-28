/*
A basic exercise for creating a class for person details
and create objects with instance variable that are related to
a person

 */

package com.avgcodes.day3.Person;

public class PersonRun {
    public static void main(String[] args) {

        PersonDetails avgcodes = new PersonDetails("avgcodes", "Panvel - East");

        avgcodes.setHobby("Listening to music");
        avgcodes.setWork("Idigicloud tech");

        System.out.println(avgcodes);
        System.out.println("");
        avgcodes.eat();
        avgcodes.sleep();

    }
}
