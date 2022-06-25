package com.syntax.class18JavaAdvance;

public class CatThisAndRecoverDeleted {
    //EXAMPLE FIXING DOUBLE NAMES
    String name;
    String breed;
    String color;
    int age;
    double weight;

 //HOW TO CREATE A CONSTRUCTOR WITH INTELLIJ= RIGHT CLICK->GENERATE->CONSTRUCTOR
 // ->SELECT ALL THE FIELDS YOU NEED INSIDE THE CONSTRUCTOR BY PRESSING COMMAND OR SHIFT AND SELECTING THE FIELDS.

    public CatThisAndRecoverDeleted(String name, String breed, String color, int age, double weight) {
        this.name = name;//-->With this keyword we tell java that we are assigning the value to instance variable.
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
//how to retrieve stuff that was deleted-->go to files-->local history-->show history
// and by pressing the >> from step one to step two will be recovered anything that you deleted
//class18 video 1.50 min
    void print(){
        System.out.println(name);
    }
}

