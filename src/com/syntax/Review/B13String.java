package com.syntax.Review;

public class B13String {
    //BEST PRACTICE IS TO ALWAYS TRY TO MAKE ALL THE INSTANCE VARIABLES  PRIVATE
    private String str;

    public B13String(String str) {
        int number;
        //this.number;//ERROR-->this.CAN NOT BE USE IN LOCAL VARIABLE
        this.str = str;
        //THIS CAN NOT BE USE IN LOCAL VARIABLE
    }

    //Write a method that can tell me how many times a character is being repeated in a string
    public  int countChars(char c){
        int counter=0;
        char[] arr=str.toCharArray();//{'a','b','c','s','s','s','e','s','d'};
        for(char cha:arr){
            if(cha==c){
                counter++;
            }
        }
        return counter;
    }
    public void printChars(char c){
        int counter=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==c){
                counter++;
            }
        }
        System.out.println(c+" has appeared "+counter+" times inside this string "+str);

    }

}