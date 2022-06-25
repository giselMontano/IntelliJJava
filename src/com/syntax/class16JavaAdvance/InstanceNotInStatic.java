package com.syntax.class16JavaAdvance;

public class InstanceNotInStatic {
    static int noOfEmployees=10;
    String name;//Karla, Kenny

    static void method1() {
        System.out.println(noOfEmployees);
        //System.out.println(name);//ERROR<--THIS IS NOT POSSIBLE BECAUSE INSTANCE VALUE HAS STORE MORE THAN ONE VALUE
                                    // AND STATIC CAN ONLY STORE ONE VALUE AT TIME.
                                    //java gets confuse which value print
    }

    void method2() {
        System.out.println(noOfEmployees);
        System.out.println(name);//HERE IS POSSIBLE BECAUSE IS NOT A STATIC METHOD
    }

    public static void main(String[] args) {
        InstanceNotInStatic hola = new InstanceNotInStatic();
        hola.name = "Karla";

        InstanceNotInStatic hi = new InstanceNotInStatic();
        hi.name = "Kenny";

    }
}
