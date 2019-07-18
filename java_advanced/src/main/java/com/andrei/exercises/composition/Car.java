package com.andrei.exercises.composition;

public class Car {
    private CarSpecs carSpecs;

    public Car(){
        carSpecs = new CarSpecs(2, 700, 450, "black", true);
    }

    public void ShowSpecs(){
        System.out.println("The new limited edition model of Dacia has the following specs:");
        System.out.println("Number of doors: "+carSpecs.getDoorsNumber());
        System.out.println("Horse Power: "+carSpecs.getHorsePower());
        System.out.println("Maximum speed: "+carSpecs.getMaxSpeed()+" km/h");
        System.out.println("Colour: "+carSpecs.getColour());
        System.out.println("Convertible: "+carSpecs.isConvertible());
    }
}
