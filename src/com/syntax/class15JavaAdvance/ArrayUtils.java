package com.syntax.class15JavaAdvance;

public class ArrayUtils {
    void printArray(int [] arr){
        for(int num: arr){
            System.out.println(num);
        }
    }
    int sumArray(int [] arr) {
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
    return sum;
    }
}
