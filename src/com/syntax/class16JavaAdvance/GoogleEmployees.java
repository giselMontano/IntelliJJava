package com.syntax.class16JavaAdvance;

public class GoogleEmployees {
    //INSTANCE= ALL THE VARIABLES ARE DIFFERENT
    String name;//<---instance variable
    double salary;//<---instance variable

    //STATIC= DOES NOT CHANGE BUT UPDATE TO THE LAST VARIABLE YOU ADD, AND IT IS SHARE ACROSS ALL THE OBJECTS
    static int noOfEmployees;//<--static variable it keeps changing values, but it only keeps the last one
    static String companyName = "Google";//<---static variable

    void displayEmployeeInfo() {
        System.out.println("Name= " + name + "Salary= " + salary + "Company name= " + companyName + "Total employees= " + noOfEmployees);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1 = new GoogleEmployees();
        emp1.name = "Oleg";
        emp1.salary = 250000;
        emp1.noOfEmployees = 1;

        GoogleEmployees emp2 = new GoogleEmployees();
        emp2.name = "Sameer";
        emp2.salary = 250001;
        emp2.noOfEmployees = 2;//KEEPS UPDATING AND KEEP THE LAST VALUE

        emp1.displayEmployeeInfo();//we can not put void inside System.out
        emp2.displayEmployeeInfo();


    }
}
