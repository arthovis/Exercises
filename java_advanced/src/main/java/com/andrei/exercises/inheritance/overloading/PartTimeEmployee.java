package com.andrei.exercises.inheritance.overloading;

public class PartTimeEmployee extends Employee {
    private double hrsWorked;
    private double hourlyRate;

    public double getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(double hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void display(String message){
        System.out.println(message);
        System.out.println("Hours worked: "+getHrsWorked()+". Hourly rate: "+getHourlyRate()+" lei.");
    }
}
