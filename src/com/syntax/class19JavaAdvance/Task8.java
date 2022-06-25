package com.syntax.class19JavaAdvance;

public class Task8 {
     /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables. Print name &
     address of given  student using displayInfo method.
     */

    String name;
    String address;
    Task8(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+ "  "+address);
    }

    public static void main(String[] args) {
        Task8 holis=new Task8("Jose","street 123");
        holis.displayInfo();
    }

}
