package com.syntax.class21JavaAdvance;

public class Task2 {
    /*Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */
}

class Shape {
    double radius;//INSTANCE VARIABLE

    Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {

    Circle(double radius) {//matching constructor
        super(radius);
    }

    void calculateAndPrintArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area= "+area);
    }
}

class Tester {
    public static void main(String[] args) {
        Circle circulo = new Circle(2);
        circulo.calculateAndPrintArea();
    }
}
