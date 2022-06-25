package com.syntax.class19JavaAdvance;

public class Task2 {

       /*
       -Create a method that will take a String
        as a parameter and returns reversed String.
       -Method should be available to all classes within
        your project and accessible by class name.
        */

//method is returning a string builder
    public static String Hola(String esto){
        return new StringBuilder(esto).reverse().toString();
        //WHEN YOU ARE DEBUGGING A CODE YOU CAN ALSO SELECT A PART, RIGHT CLICK, EVALUATE EXPRESSION
    }

    public static void main(String[] args) {

        System.out.println(Task2.Hola("Monday"));
    }
}

