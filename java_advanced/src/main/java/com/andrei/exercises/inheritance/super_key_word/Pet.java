package com.andrei.exercises.inheritance.super_key_word;

public class Pet extends Animal{
    private boolean flying;

    public Pet(String colour, int nrLegs,boolean flying) {
        super(colour, nrLegs);
        this.flying = flying;
    }

    public boolean isFlying(){
        return flying;
    }

    @Override
    public String toString(){
        return super.toString()+" Is your pet flying? "+flying;
    }


}
