package com.syntax.class22JavaAdvance;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("Hey Hamid we have found a girl for you get married to that girl");

    }
}

class Hamid extends Parent{

    void getMarried(){
        super.getMarried();//inherent from parent
        System.out.println("I want to try on Tara First");//writing own code

    }

    public static void main(String[] args) {
        Hamid hamid=new Hamid();
        hamid.getMarried();

    }
}

