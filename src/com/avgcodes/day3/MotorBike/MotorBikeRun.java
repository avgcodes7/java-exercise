package com.avgcodes.day3.MotorBike;

public class MotorBikeRun {
    public static void main(String[] args) {

        MotorBike suzuki = new MotorBike("Hayabusa", 40);
        MotorBike bajaj = new MotorBike("Pulsar", 30);

        System.out.println("Speed of " + suzuki.getBikeName() + " is " + suzuki.getSpeed());

        suzuki.setSpeed(110);
        bajaj.increaseSpeed(50);

        System.out.println(suzuki.getBikeName() + " speed is " + suzuki.getSpeed());        //Call object methods

        System.out.println(suzuki);

        System.out.println(bajaj);
    }
}
