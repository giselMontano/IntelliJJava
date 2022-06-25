package com.syntax.class16JavaAdvance;

public class Task2Students {
    /*
   Create a Class called Students
   1.-Create three  variables  Name , ID  and  numberOfStudents
   2.-Create two objects of the Students Class
   3.-Set the values for  name , ID and increment  the numberOfStudents for each object
   4.-Print out names, id's, and  total number of students
    */
    String name;//INSTANCE VARIABLE
    String id;//INSTANCE VARIABLE
    static int numberOfStudents;//STATIC VARIABLE

    public static void main(String[] args) {
        Task2Students task2Students = new Task2Students();
        task2Students.name = "Arif007";
        task2Students.id = "JB123";
        numberOfStudents = 1;// if we are inside the same class we can access static variables inside static
        //methods by just writing the name of that variable we don't need to create an object

        System.out.println(task2Students.name);
        System.out.println(task2Students.id);
        System.out.println(numberOfStudents);

        Task2Students task2Students2 = new Task2Students();
        task2Students2.name = "Arif008";
        task2Students2.id = "JB1234";
        numberOfStudents = 2;//<---INCREMENT NUMBER OF numberOfStudents FOR EACH OBJECT

        System.out.println(task2Students2.name);
        System.out.println(task2Students2.id);
        System.out.println(numberOfStudents);


    }

}

