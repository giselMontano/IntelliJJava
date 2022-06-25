package com.syntax.class21JavaAdvance;

public class Animal {
    String name;
    String color;
    String breed;
    int age;

    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println("Name "+name+" Color"+color+" Breed "+breed+" Age"+age);

    }
}
class Dog extends Animal{


    public Dog(String name, String color, String breed, int age) {
        super(name, color, breed, age);//SUPER KEYWORD TO CALL CONSTRUCTOR FROM PARENT CLASS
    }
}
class Cat extends Animal{
    public Cat(String name, String color, String breed, int age) {
        super(name, color, breed, age);//First constructor then super--> must be the first line after creating a child class
        System.out.println("Any line can be applied after you have created the constructor");
    }
}