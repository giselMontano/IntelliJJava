package com.syntax.class18JavaAdvance;

public class CowThisKeyword {
    String breed;//Instance variable
    String color;
    int age;
    double weight;


    CowThisKeyword(String breed, String color, int age, double weight) {
        //When we have variables local and instance named the same inside a class
        //always local variables are preferred over instance variables by java in a block of code

        //when this same name local and instance variable exist it will create a conflict
        // java will execute local variable over instance
        // therefore instance variable will never be executed and keep a value null when trying to execute getCowiNFO()

        this.breed = breed;//this.<--- this is use to fix the problem of same name (local variable and instance variable)
                                     //when you put (this.) in front of instance variable
                                     // java understand that the value must be assigned to the instance variable.

        color = color;
        age = age;//local variable
        weight = weight;

        int x=15;
        x=x;//this is a clear example assigning value x to a variable x does not make sense it will not change anything.
    }

    //breed,color,age,weight colored pink are instance variables.
    String getCowInfo() {
        return "Breed= " + breed + "Color= " + color + "Age= " + age + " Weight= " + weight;

    }
}