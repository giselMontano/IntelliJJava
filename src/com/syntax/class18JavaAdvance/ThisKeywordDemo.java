package com.syntax.class18JavaAdvance;

public class ThisKeywordDemo {

    String name = "instance";

    void printName() {
        String name = "local";//LOCAL VARIABLE IS ALWAYS PREFERRED
        System.out.println(name);//local
        System.out.println(this.name);// instance-->THIS IS FIX AND MEANS INSTANCE VARIABLE
    }

    public static void main(String[] args) {
        ThisKeywordDemo hola = new ThisKeywordDemo();
        hola.printName();
    }
}

