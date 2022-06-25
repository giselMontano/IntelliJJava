package com.syntax.Review;

public class Demo1 {
    public static void main(String[] args) {

//CONVERT AN ARRAY INTO STRING
        char[] arr = {'a', 'b', 'c'};
        String str = new String(arr);
        System.out.println(str);

        System.out.println("-----------------------------------");

        int [] arr2={65,66,67,68,69};//numbers behaind the letters
        String str2=new String(arr2,0,3);
        System.out.println(str2);

        System.out.println("-----------------------------------");

        String name="Muhammad AbdulSamad Bond";
        if(name.length()>10){
            System.out.println("Please use Shorter name");
        } else {
            System.out.println("Your name has been accepted");
        }

    }
}
