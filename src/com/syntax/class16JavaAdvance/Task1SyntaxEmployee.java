package com.syntax.class16JavaAdvance;

public class Task1SyntaxEmployee {
     /*
        Create a Class called SyntaxEmployee:
    1.-Create three  variables  empID , salary and set the CEO to "Sumair"
    2.-Create two objects of the class SyntaxEmployee
    3.-Set the value of eID, salary for each of the objects
    4.-Print out the eID , salary and  CEO for each of the objects
     */
    //WHEN YOU NEED TO SHARE INFORMATION ACROSS THE METHODS USE INSTANCE VARIABLE
    //WHEN OBJECTS CAN HAVE DIFFERENT VALUES WE SHOULD CREATE A INSTANCE VALUE

    String empId;//<--IT WILL HAVE DIFFERENT VALUES (INSTANCE VARIABLE)

    int salary;//<--IT WILL HAVE DIFFERENT AMOUNTS (INSTANCE VARIABLE)
    //whenever we are sure that two objects of a class can have different values for
    // a variable or if we have to share that variable between two or more methods of that
    //class we should always go with instance variables

    static String CEO = "Sumair";//<--THIS CEO WILL BE THE SAME FOR EVERYONE (STATIC VARIABLE)


    public static void main(String[] args) {
        Task1SyntaxEmployee emp = new Task1SyntaxEmployee();
        emp.empId = "123";
        emp.salary = 200000;

        Task1SyntaxEmployee emp2 = new Task1SyntaxEmployee();
        emp2.empId = "1234";
        emp2.salary = 250000;

        Task1SyntaxEmployee emp3 = new Task1SyntaxEmployee();
        emp3.empId = "1234";
        emp2.salary = 250078;


        //INTELLIJ ALLOW TO RENAME A WHOLE LINE OF CHARACTERS-->PRESSING OPTION AND SELECT THE PART
        System.out.println(emp.empId);
        System.out.println(emp.salary);
        System.out.println(emp2.empId);
        System.out.println(emp2.salary);
        System.out.println(emp3.empId);
        System.out.println(emp3.salary);



    }
}
