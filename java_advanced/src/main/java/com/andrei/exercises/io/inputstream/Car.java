package com.andrei.exercises.io.inputstream;

import java.io.Serializable;

public class Car implements Serializable {
        private String name;
        private int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString(){
        return "Car{" +
                "name='" + name + '\'' +
                ", maximum speed (km/h)='" + maxSpeed + '\'' +
                '}';
    }
}
