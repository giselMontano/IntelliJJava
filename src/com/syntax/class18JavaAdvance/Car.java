package com.syntax.class18JavaAdvance;

import jdk.swing.interop.SwingInterOpUtils;

public class Car {
    //BEST PRACTICE FOR FIELDS IS TO MAKE THEM PRIVATE, for sensitivity information so nobody can assign any values to our fields.
    private String make;
    private String model;
    private String color;

    //ZERO PARAMETERS
    //BY CREATING THIS CONSTRUCTOR WITH ZERO PARAMETERS WE ALLOW THE END USER
    // WHO IS TRYING TO USE YOUR CONSTRUCTOR TO BE ABLE TO CRATE THE OBJECTS OF YOUR CLASS
    // WITHOUT PASSING ANY VALUES INSIDE THE ()
    public Car(){

    }
    //THREE PARAMETERS
    //ANY TIME THIS ACCESS MODIFY CHANGES FROM (PUBLIC TO PRIVATE) IT WILL NO LONGER BE ACCESSIBLE IN OTHER CLASSES ONLY IN THE SAME ONE.
    //IN THE CASE IT HAS NO (PUBLIC NEITHER PRIVATE) IT WILL BECOME
    //(DEFAULT ACCESS MODIFY) AND WILL BE AVAILABLE FOR ALL THE CLASSES INSIDE THE SAME PACKAGE WHERE IS THE CONSTRUCTOR IS CREATED.
    public Car (String carMake, String carModel, String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }
    //ONE PARAMETER
    //THIS IS CREATED TO GIVE THE END USER THE FLEXIBILITY THEY NEED TO CREATE OBJECTS, SO THEY DON'T HAVE TO WRITE ALL THE PARAMETERS
    // IN ORDER TO CREATE A OBJECT THAT ONLY NEED ONE PARAMETER.
    public Car(String carModel){

        model=carModel;
    }

    /*public Car(String carColor) {
        color = carColor;
    }*///IT IS NOT ALLOW TO HAVE TWO CONSTRUCTORS WITH SAME AMOUNT OF PARAMETERS

    void printCarModel(){
        System.out.println("Model "+model);

    }
    void printInfo(){
        System.out.println("carMake= "+make+" Model= "+model+" Color= "+color);
    }
}
