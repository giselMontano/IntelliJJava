package com.syntax.class18JavaAdvance;

public class CarTester {
    public static void main(String[] args) {
//IN ORDE TO CREATE AN OBJECT WITH CONSTRUCTOR WE MUST PUT THE PARAMETERS INSIDE THE ()


        //carMake: carModel: carColor: -->comes automatically DO NOT write it.
        Car yaTuSave = new Car("Bugatti", "Ferrari", "Lamborghini");

        //THI IS A DEFAULT ACCESS MODIFY; IT CAN ONLY BE ACCESS INSIDE THE SAME PACKAGE ANY CLASSES, WHERE THE METHOD IS PRESENT
        yaTuSave.printInfo();

//CALLING THREE VALUES INSIDE THE PARAMETER
        Car yoNoSe = new Car("Toyota", "Kia", "Subaru");
        yoNoSe.printInfo();

//CALLING ONLY ONE VALUE INSIDE THE PARAMETER
        Car car = new Car("Tesla");
        car.printCarModel();

    }
}