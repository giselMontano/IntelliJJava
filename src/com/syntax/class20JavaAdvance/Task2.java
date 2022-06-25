package com.syntax.class20JavaAdvance;

public class Task2 {
    /* Write program to inherit class G that has method printF
which is static and call or reuse that method into class E
    */


    //INHERITANCE SIMPLE
class G {
    public static void printF() {
        System.out.println("Method printF in class G");
    }
}

class E extends G{//IN ORDER TO REUSE A METHOD  THAT IS ALREADY IN PARENT CLASS WE JUST NEED THE EXTENDS KEYWORD

}
//MAIN METHOD
    public static void main(String[] args) {
        E.printF();//<--THIS IS PRINTING CLASS E WITH METHOD CLASS G
    }

}
