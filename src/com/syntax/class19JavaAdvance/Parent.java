package com.syntax.class19JavaAdvance;


///SINGLE INHERITANCE
public class Parent {
    String name="Misha";
    double money=1000000;

}
class Child extends Parent {

    void printInfo(){
        System.out.println("My full name is Khrystyna "+name);
    }
    void buyCar(){
        System.out.println("Hehehhe buing car from Papas money "+money);
    }
}

class Tester{
    //MAIN METHOD
    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
        child.buyCar();
    }
}

