package com.syntax.class17JavaAdvance;

public class DogConstructorTester {
    public static void main(String[] args) {
         /*
         >>>WE CAN NOT CALL OBJECTS THIS WAY ANYMORE, WHEN WE HAVE CREATED A CONSTRUCTOR WITH PARAMETERS;
            PARAMETERS MUST BE PASSED INSIDE THE PARENTHESIS ()

        Dog dog1=new Dog();//ERROR--> BECAUSE THE () IS EMPTY AND WE CREATED THE CONSTRUCTOR WITH PARAMETERS
        dog1.name="Lofy";
        dog1.breed="German";
        dog1.color="Black";
        dog1.age=15;
        dog1.weight=20;
        dog1.printInfo();


        Dog dog2=new Dog();//ERROR--> BECAUSE THE () IS EMPTY AND WE CREATED THE CONSTRUCTOR WITH PARAMETERS
        dog2.name="Gofu";
        dog2.breed="American";
        dog2.color="White";
        dog2.age=15;
        dog2.weight=20;
        dog2.printInfo();*/

        //PARAMETERS ARE PASSED INSIDE THE PARENTHESIS

        //DO NOT WRITE dogName: dogBreed: etc. JUST ASSIGN THE VALUES YOU NEED INSIDE
        DogConstructor dog=new DogConstructor("Jofy","Russian", "Grey",15, 20);

        dog.printInfo();

        DogConstructor dog2=new DogConstructor("Foofy","UK", "Grey",18, 20);

        dog2.printInfo();

    }
}

