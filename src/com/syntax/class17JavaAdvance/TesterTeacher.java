package com.syntax.class17JavaAdvance;

public class TesterTeacher {
    public static void main(String[] args) {

        //THESE ARE FIELDS FROM CLASS TEACHER SAME PACKAGE DIFFERENT CLASS
        Teacher CoolTeacher=new Teacher();
        CoolTeacher.name="Zombie";
        CoolTeacher.schoolName="Marvard";

        //CoolTeacher.salary=1234;-->CAN NOT BE ACCESS ALONE BUT IT CAN BE ACCESS THROUGH A METHOD

        //Salary is inside this method, and it is private in class teacher
        //however can be access indirectly in another class because the method is public.
        CoolTeacher.printInfo();
        //printInfo is public we can call it in other classes

        //METHODS ARE HELPERS THAT ALLOW A PRIVATE FIELD TO BE ACCESSIBLE IN OTHER CLASSES, THEY CAN NOT BE CALLED ON THEIR OWN.
    }
}
