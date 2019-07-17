package com.andrei.exercises.abstract_classes.shape;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului: ");
        int length = input.nextInt();
        System.out.println("Introduceti latimea dreptunghiului: ");
        int width = input.nextInt();
        Rectangle dreptunghi = new Rectangle(length,width);
        System.out.println("Perimetrul dreptunghiului este: "+dreptunghi.getPerimeter());
        System.out.println("Aria dreptunghiului este: "+dreptunghi.getArea());
        System.out.println();
        System.out.println("Introduceti raza cercului: ");
        int raza = input.nextInt();
        Circle cerc = new Circle(raza);
        System.out.printf("Perimetrul cercului este: %.2f",cerc.getPerimeter());
        System.out.println();
        System.out.printf("Aria cercului este: %.2f ",cerc.getArea());
    }
}
