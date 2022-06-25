package com.syntax.class15JavaAdvance;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Task4 {
    //create a method that will say Hello in different
    //languages based on the country that will passed when method is
    //WITH VOID METHOD WE USE BREAK; WITH RETURN WE DO NOT
    void sayHello(String country) {

        String hello;
        //country=country.toLowerCase();
        switch (country) {
            case "USA":
                hello = "Hola";
                break;
            case "Russia":
                hello = "Privet";
                break;
            case "France":
                hello="bonjour";
                break;
            case "Pakistan":
                hello="Assalam o Alykum";
                break;
            case "India":
                hello="Namastay";
                break;
            case "Turkiye":
                hello="Merhaba";
                break;
            default:
                hello="Country not found";
        }
        System.out.println(hello);
    }

    public static void main(String[] args) {
        Task4 hola=new Task4();
       hola.sayHello ("France");




    }
}
