package com.andrei.exercises.polymorphism.dynamic_polymorphism;

public class DemoClass {
    public static void main(String[] args) {
        //original description() method:
        Vehicle vehicle = new Vehicle();
        vehicle.description();

        //description() method is overridden by the child class:
        Vehicle car = new Car();
        car.description();
    }
}
