package com.andrei.exercises.abstract_classes.shape;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * (length + width);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area;
        area = width * length;
        return area;
    }
}