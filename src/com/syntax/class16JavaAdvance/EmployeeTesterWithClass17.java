package com.syntax.class16JavaAdvance;

import com.syntax.class17JavaAdvance.Employee;

import java.util.Scanner;

public class EmployeeTesterWithClass17 {

    public static void main(String[] args) {
        Employee employee = new Employee();//It is like scanner and import my class (Employee from package 17)

        employee.name = "Merve";//THIS IS FROM CLASS 17 AND IS PUBLIC CAN BE ACCESS

        //employee.salary=125000; //ERROR we can't access it because its private

        // employee.department="IT";//ERROR Because we can't access default variables of a class inside a different package

        System.out.println(Employee.manager);

        Employee.printManager();//WHEN METHOD IS STATIC INSIDE ANOTHER PACKAGE (CLASS17 IN THIS CASE)JUST WRITE THE CLASS NAME AND CALL THE METHOD.
        // Static fields and methods can also be accessed
        //by just writing the name of the class

        String str=new String();//we do not see any import because this class is present inside the (java.lang)
                                //all the classes inside java.lang package are imported by default for you

        Scanner scan=new Scanner(System.in);//inside of java package (java.util)
    }
}

