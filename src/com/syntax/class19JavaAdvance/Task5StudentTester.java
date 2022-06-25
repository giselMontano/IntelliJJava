package com.syntax.class19JavaAdvance;

public class Task5StudentTester {
     /* Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 2 different students with different marks.
Your program should print an average mark of each students name.
 */


    public static void main(String[] args) {
        Task5Student estudiante=new Task5Student("Best Student Ozkhan ",99.9,98.8,99.5);
        estudiante.calculateAvgGrade();

        Task5Student estudiante2=new Task5Student("Bad sameer ",60.5,52.2,99.5);
        estudiante2.calculateAvgGrade();
    }
}
