package com.syntax.class17JavaAdvance;

public class DogConstructor {
    String name;//INSTANCE VARIABLE
    String breed;//INSTANCE VARIABLE
    String color;//INSTANCE VARIABLE
    int age;//INSTANCE VARIABLE
    double weight;//INSTANCE VARIABLE

    //THIS IS HOW YOU CREATE A CONSTRUCTOR; CONSTRUCTOR IS A BLOCK OF CODE
    //>>CAN NOT HAVE RETURN TYPE
    //>>CAN NOT HAVE ANY NAMES LIKE METHODS
    //>>MUST HAVE THE SAME NAME AS YOUR CLASS
    DogConstructor(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        //ONCE YOU HAVE CREATED YOUR CONSTRUCTOR WITH VARIABLES INSIDE
        //ASSIGN THE VALUES OF CONSTRUCTOR TO THE INSTANCE VARIABLE
        name = dogName;
        breed = dogBreed;
        color = dogColor;

        //WHEN WE BUILD A CONSTRUCTOR WE CAN ALSO APPLY RULES
        // THEREFORE WHEN SOMEONE IS CREATING AND OBJECT WITH MY CONSTRUCTOR WILL HAVE TO PASS THESE RULES.
        //EXAMPLE DOG AGE CAN NOT BE GRATER THAN 25.
        if (dogAge > 0 && dogAge < 25) {
            age = dogAge;
        } else {
            System.out.println("Dog age can' be greater than 30");
        }

        weight = dogWeight;
    }

    //HERE YOU HAVE THE INSTANCE VARIABLES
    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " color " + color + " Weight " + weight);
    }

}
