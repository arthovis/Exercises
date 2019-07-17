package com.andrei.exercises.inheritance.overloading;

public class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("Employee name: "+getName()+". Employee ID: "+getId()+".");
    }
}
