package com.syntax.class20JavaAdvance;

public class Bird {

    String name;
    String color;
    int age;
    double weight;
    void printInfo(){
        System.out.println("Name "+name+" Color "+color+" age "+age+" weight "+weight);
    }

    Bird(String name, String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }

    Bird(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

}

class Parrot extends Bird
{
    Parrot(String name, String color, int age, double weight){
        super(name, color, age, weight); //this super helps us to call a constructor with same parameters
                                   // and same datatype and sequence
                                 // from the parent class by writing the super();
    }

}

class Sparrow extends Bird{
    Sparrow(String name, String color, int age, double weight){
        super(name, color, age, weight);
    }
}
