package com.syntax.class17JavaAdvance;

public class Employee {

    public String name;//PUBLIC
    public static String manager="Cindy";
    private int salary;//PRIVATE
    String department;//DEFAULT

    private void printSalary() {
        System.out.println("Salary " + salary);
    }

    public static void printManager() {
        System.out.println(manager);}//THIS IS AN EXAMPLE FOR CLASS 16 (EmployeeTesterWithClass17)

    void printDepartment() {
        System.out.println("Department " + department);
    }

    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        //EVERYTHING WAS ACCESSIBLE EASILY BECAUSE EVERYTHING BELONGS TO THE SAME CLASS
        Employee emp = new Employee();
        emp.name = "Jason";
        emp.department = "IT Destroyer";
        emp.salary = 150000;
        emp.printName();
        emp.printDepartment();
        emp.printSalary();
    }
}
