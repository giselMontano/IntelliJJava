package com.syntax.class16JavaAdvance;

public class InstanceDemo {
    String str = "instance";

    void changeInstanceValue() {
        str = "Captain Marvel";
        System.out.println(str);
    }

    void printIstanceValue() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        //THE ORDER MATTERS
        InstanceDemo id = new InstanceDemo();
        System.out.println(id.str); // prints the value of str which is= instance
        id.printIstanceValue(); // simple prints the value of str which is still= instance
        id.changeInstanceValue(); // this changes the instance variable value with Captain Marvel
        id.printIstanceValue(); // simple prints the value of str which is now Captain Marvel
    }
}
