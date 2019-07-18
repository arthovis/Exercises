package com.andrei.exercises.composition;

public class CarSpecs {
    int doorsNumber;
    int horsePower;
    int maxSpeed;
    String colour;
    boolean isConvertible;

    public CarSpecs(int doorsNumber, int horsePower, int maxSpeed, String colour, boolean isConvertible) {
        this.doorsNumber = doorsNumber;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.isConvertible = isConvertible;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColour() {
        return colour;
    }

    public boolean isConvertible() {
        return isConvertible;
    }
}
