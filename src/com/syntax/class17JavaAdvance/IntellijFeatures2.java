package com.syntax.class17JavaAdvance;

public class IntellijFeatures2 {
    public static void main(String[] args) {

        boolean flag=true;
//INTELLIJ CAN HELP YOU  WRITE SOMETHING IN A SIMPLER WAY EVERYTIME SHOWS A YELLOW PART ON THE CODE MEANS THAT THE CODE CAN BE SIMPLIFIED
        //HOVER OVER THE YELLOW PART AND SELECT SIMPLIFY
        if(!flag==true){
            System.out.println("This can be simplified i ma writing complex code");
        }else{
            System.out.println("Intellij Will help");

        }

        System.out.println("-------------------------------------------");
        //in this case you can also press the for condition and change it to-->while or do while loop
        int[] arr= {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

    }
}
