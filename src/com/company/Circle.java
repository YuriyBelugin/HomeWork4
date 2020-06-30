package com.company;

public class Circle {
    double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double area(){
        double S=Math.PI*(radius*radius);
        return S;
    }

    public double perimeter(){
        double P=Math.PI*Math.PI*radius;
        return P;
    }
}
