package com.andrei.exercises.abstract_classes.shape;

import static java.lang.Math.*;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 2*(pow(radius, 2) * PI);
    }

    @Override
    public double getPerimeter(){
        return 2*(Math.PI*radius);
    }

}
