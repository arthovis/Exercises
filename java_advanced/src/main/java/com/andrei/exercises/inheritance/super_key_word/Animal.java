package com.andrei.exercises.inheritance.super_key_word;

public class Animal {
    private String colour;
    private int nrLegs;

    public Animal(String colour, int nrLegs) {
        this.colour = colour;
        this.nrLegs = nrLegs;
    }

    public String getColour() {
        return colour;
    }

    public int getNrLegs() {
        return nrLegs;
    }

    @Override
    public String toString(){
        return "Your pet has the colour: "+colour+" and has "+nrLegs+" legs.";
    }
}
