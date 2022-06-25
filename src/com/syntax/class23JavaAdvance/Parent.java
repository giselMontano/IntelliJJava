package com.syntax.class23JavaAdvance;

public class Parent {
    public static void eat(){
        System.out.println("I like to eat seafood");
    }
    public static void sleep(){
        System.out.println("I like to sleep 8 hous");
    }
    public static void activity() {
        System.out.println("Go to the beach");
    }
}

class Child extends Parent {

    public static void activity() {
        System.out.println("I am very religious");

    }
}

class ParentTester {
    public static void main(String[] args) {
        Child Karla = new Child();
        Karla.sleep();
        Karla.activity();
    }

}