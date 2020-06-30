package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(8);
        Square square = new Square(15);
        Rectangle rectangle = new Rectangle(15,10);
        System.out.println("circle area = " + circle.area());
        System.out.println("circle perimeter = " + circle.perimeter());
        System.out.println("square perimeter = " + square.perimeter());
        System.out.println("square area = " + square.area());
        System.out.println("rectangle perimeter = " + rectangle.perimeter());
        System.out.println("rectangle area = " + rectangle.area());
    }
}
