package com.syntax.class17JavaAdvance;

public class IntellijFeatures {

        public static void main(String[] args) {
  //INTELLIJ ALLOW TO CHANGE A IF CONDITION INTO A SWITCH
            // -->PRES THE COURSER IN THE FIRST IF PART
            // THEN GO TO THE YELLOW BULB THAT WILL APPEAR AND SELECT HOW DO YOU WANT TO REPLACE YOUR IF STATEMENT
            int number=10;

            if (number == 10) {
                if (number == 20) {
                    System.out.println("Number is 20");
                } else if (number == 30) {
                    System.out.println("Number is 30");
                } else {
                    System.out.println("Number is 40");
                }
            } else {
                System.out.println("Number is 10");
            }
        }
}
