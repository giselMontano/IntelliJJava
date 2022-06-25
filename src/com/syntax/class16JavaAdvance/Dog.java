package com.syntax.class16JavaAdvance;

public class Dog {
    String name;
    String color;

    static int numOfLegs = 4;//<--static variable

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Tommy";
        dog1.color = "Pink";


        Dog dog2 = new Dog();
        dog2.name = "Kiki";
        dog2.color = "Black";


        Dog dog3 = new Dog();
        dog3.name = "Lolo";
        dog3.color = "White";

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
    }
}
