package com.syntax.class19JavaAdvance;

public class Task3 {
     /*
    Create a method that will accept a String as a parameter
    and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and
    executed by calling it is name.
     */

    //static method is created because main method is static as well
    //return type has to be the same as data type  inside the ()-->private static STRING getVowels(STRING hola){
    private static String getVowels(String hola) {

        return hola.replaceAll("[^aeiouAEIOU]", "");
    }

    //main method
    public static void main(String[] args) {
        System.out.println(getVowels("Alejandra"));//Aaaa-->only vowels will be executed
    }
}
