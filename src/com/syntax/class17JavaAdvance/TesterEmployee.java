package com.syntax.class17JavaAdvance;

import com.syntax.class16JavaAdvance.Dog;

public class TesterEmployee {

    public static void main(String[] args) {

        /*
        If classes exist inside the same package
        they are imported automatically
         */
        //ACCESSING FIELDS FROM EMPLOYEE CLASS; CLASS 17
        Employee employee = new Employee();//Thi exist inside the same package different class, it is imported automatically

        employee.name = "Mike";

        //employee.salary=125000;ERROR because its private in (Employee class; class17)

        employee.department = "IT Saver";//THIS IS DEFAULT AND CAN BE ACCESS

        // employee.printSalary();ERROR private method inside (Employee class; class17) //we can't access it

        employee.printDepartment();//CAN BE ACCESSIBLE  IT IS A DEFAULT METHOD

        Dog dog = new Dog();//This is imported from (Dog class;class16)

    }
}
