package com.syntax.class23JavaAdvance;
//If you have (public  final Animal) no other class can inherit from Animal class
// FINAL NO ONE CAN ACCESS THIS,
// PRIVATE CAN BE ACCESSED IN THE SAME PACKAGE, OR BY METHODS AND CONSTRUCTOR.
public class Animal {
    Animal() {
        System.out.println("Parent");
    }
    //if a method have final keyword (final.void eat(){})this will not be able to override in child class

    void eat() {
        System.out.println("All the animal eat");
    }
}

class Panda extends Animal {

    final double G = 9.8;


    void eat() {
        // G=10;<---CLEAR EXAMPLE FROM MATH CLASS THE VALUE OG GRAVITY CAN NEVER BE DIFFERENT OR OVERRIDE
        System.out.println("All the animal eat");
    }

    Panda() {
        System.out.println("Child");
    }
}

class Tester {
    public static void main(String[] args) {
        new Panda();

    }
}


