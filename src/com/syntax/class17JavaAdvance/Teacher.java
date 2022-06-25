package com.syntax.class17JavaAdvance;

public class Teacher {
    String name;
    private int salary=125555;
    public String schoolName;


    //Everything can be access here because everything below belong to the same class
    public void printInfo(){
        System.out.println(name+ " "+salary+" "+schoolName);

    }
}

