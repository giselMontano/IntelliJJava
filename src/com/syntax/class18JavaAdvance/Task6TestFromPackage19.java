package com.syntax.class18JavaAdvance;

import com.syntax.class19JavaAdvance.Task6;

public class Task6TestFromPackage19 {
    public static void main(String[] args) {
        //new Task6();//PRIVATE
        //new Task6("Zombie");//DEFAULT
        //new Task6(15);//PROTECTED
        new Task6(true);//PUBLIC-->ONLY PUBLIC IS REACHABLE FROM ANOTHER PACKAGE
    }

}
