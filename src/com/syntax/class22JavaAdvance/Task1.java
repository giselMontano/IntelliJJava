package com.syntax.class22JavaAdvance;

public class Task1 {
    /*
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
 */
    static void area(double length,double width){
        System.out.println("Area of rectangle"+(length*width));

    }
    static void area(double length){
        System.out.println("Area of square "+(length*length));
    }

    //we can not overload this one because is volume
    static void volume(double length,double width,double higth){
        System.out.println("Volume of box"+(length*width*higth));
    }

    public static void main(String[] args) {
        area(76);
    }

}
