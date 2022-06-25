package com.syntax.class22JavaAdvance;

import jdk.swing.interop.SwingInterOpUtils;

public class AdvantaceCalc {

   // When we don't know how many parameters the end user needs.

     /* void sum(int num1,int num2){
        System.out.println(num1+num2);
    }
    void sum(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    void sum(int num1,int num2,int num3,int num4){
        System.out.println(num1+num2+num3+num4);
    }*/
     //INSTATED OF WRITING TOO MUCH CODES WE CAN DO
    static void sum(int ... arr){
        // System.out.println(arr[3]);-->TO FIND A LETTER IN THE INDEX3
        int sum=0;
        //agregar el for loop
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum of all the parameter values is "+sum);
        printNames("Aladin","Aladin","Aladin");
    }


    //variable arguments
    static void printNames(String ... names){
        for (String name:names){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        sum(2,2,3,4,10);
        //printNames("Aladin","Aladin","Aladin");
        int age=5;
        String name;
        if(age>18){
            name=("Time to go work1");

        }else{
            name=("Enjoy no work1");
        }
        System.out.println(name);

        //ANOTHER WAY best and faster
        String name2=age>18?"Time to go work":"Enjoy no work";
        System.out.println(name2);

//CHECK THIS OUT IN INTERNET==>TERNARY OPERATORS

        //ELSE IF CONDITION age>10 is the nested
        String name3=age>18? age<10?"Time to go work":"chill out":"NOT EMPLOYED";
        System.out.println(name2);
    }
}
