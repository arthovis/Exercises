package com.andrei.exercises.polymorphism.static_polymorphism;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(25,30));
        System.out.println(calculator.add(25,30, 450));
    }
}