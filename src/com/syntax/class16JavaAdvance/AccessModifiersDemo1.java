package com.syntax.class16JavaAdvance;

public class AccessModifiersDemo1 {//Here is public and (int ssn) is accessible in other packages
                                   //if you delete public and keep just class nothing below will be accessible in others packages

    private  String password="pass123"; //PRIVATE METHODS CAN ONLY BE ACCESS IN THE SAME CLASS
    int ssn=123546;//IF I DO NOT HAVE ANY  SPECIFY (PRIVATE OR PUBLIC  IT BECOMES DEFAULT)
    public String name="Bilal";


    public static void main(String[] args) {
        AccessModifiersDemo1 ac = new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);

    }
}
