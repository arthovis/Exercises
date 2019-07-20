package com.andrei.exercises.generictypes.vehicle;

public class DemoVehicle {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Garage<Vehicle> garage = new Garage<>(bike);
        bike.repair();
    }
}
