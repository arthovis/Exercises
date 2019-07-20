package com.andrei.exercises.generictypes.genericclass;

public class DemoGeneric {
    public static void main(String[] args) {
        GenericBox<String> stringGenericBox = new GenericBox<>(2);
        String s1 = "abc";
        String s2 = "def";
        stringGenericBox.add(s1);
        stringGenericBox.add(s2);
        stringGenericBox.print();

        GenericBox<Integer> integerGenericBox = new GenericBox<>(3);
        int i1 = 250;
        int i2 = 350;
        int i3 = 450;
        integerGenericBox.add(i1);
        integerGenericBox.add(i2);
        integerGenericBox.add(i3);
        System.out.println();
        integerGenericBox.print();

        GenericBox<Double> doubleGenericBox = new GenericBox<>(4);
        double d1 = 3.5;
        double d2 = 4.5;
        double d3= 5.5;
        double d4 = 6.5;
        doubleGenericBox.add(d1);
        doubleGenericBox.add(d2);
        doubleGenericBox.add(d3);
        doubleGenericBox.add(d4);
        System.out.println();
        doubleGenericBox.print();
    }
}
