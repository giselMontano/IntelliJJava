package com.syntax.class19JavaAdvance;

public class DogTester {

    public static void main(String[] args) {

        Cat cat = new Cat("kitty", "green");
        cat.printInfo(); //Cat class does not hav this method, however  we are using inheritance
        // which means we can use the methods from the parent class.

        Dog dog = new Dog("Max", "Blue");
        dog.printInfo();
    }
}
