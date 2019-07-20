package com.andrei.exercises.generictypes.vehicle;

public class Bike extends Vehicle {
    public Bike() {
        System.out.println("The bike has a broken chain and front wheel. It needs repairs.");
    }

    @Override
    public void repair() {
        System.out.println("Your car is now repaired. It will cost you 500 euros.");
    }
}
