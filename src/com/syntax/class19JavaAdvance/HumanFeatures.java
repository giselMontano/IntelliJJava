package com.syntax.class19JavaAdvance;

public class HumanFeatures extends Human {
    boolean goodWithJava;//own properties of the class

    HumanFeatures(String name, String eyeColor, String job, int age, boolean goodWithJava) {
        // this.name is coming from Parent class Human
        this.name = name;
        this.eyeColor = eyeColor;
        this.job = job;
        this.age = age;
        this.goodWithJava = goodWithJava;

    }

    void printIfo() {
        System.out.println("My name is " + name + " i do " + job + " am i good with Java " + goodWithJava);
    }
//MAIN METHOD
    public static void main(String[] args) {

        HumanFeatures createHuman = new HumanFeatures("Sameer", "black", "gym", 22, true);
        createHuman.printIfo();
    }
}