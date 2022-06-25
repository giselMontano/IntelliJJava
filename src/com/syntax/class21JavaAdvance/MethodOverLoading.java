package com.syntax.class21JavaAdvance;

public class MethodOverLoading {
    void method(){//DOES NOT MATCH
        System.out.println("1");
    }
    void method(String name){//DOES NOT MATCH
        System.out.println("2");
    }
    void method(String name,int num){//MATCH!! SAME NAME OF METHOD, SAME AMOUNT OF PARAMETERS, SAME DATA TYPE AND SAME SEQUENCE
        System.out.println("3");
    }

    void method(int num2,int num){//Match BUT-> Same name of method, same amount of parameters, same data type BUT NOt THE SAME SEQUENCE
        System.out.println("4");
    }

    void method(int num,String name){
        System.out.println("5");
    }

    public static void main(String[] args) {
        MethodOverLoading m=new MethodOverLoading();
        m.method("Hamid",50);//CHECKS THIS PARAMETERS IT MUST MATCH WITH ONE OF THE METHODS ABOVE
    }
}