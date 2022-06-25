package com.syntax.class19JavaAdvance;

public class Task6 {
    /*
   Write a java class that have 4 constructors with 4
   different access levels of constructors(private,public,default,protected)
   and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 -
   from different class inside different package  and observe result
    */

    //PRIVATE
    private Task6(){
        System.out.println("private");
    }

    //DEFAULT
    Task6(String name){
        System.out.println("default");
    }

    //PROTECTED
    protected Task6(int num){
        System.out.println("protected");
    }

    //PUBLIC
    public Task6(boolean flag){
        System.out.println("public");
    }


    //MAIN METHOD
    public static void main(String[] args) {
        new Task6();
        new Task6("Zombie");
        new Task6(5);
        new Task6(true);
    }
}
//CREATE IN PACKAGE 18 THE TEST OUT OF PACKAGE