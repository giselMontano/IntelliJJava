package com.syntax.class18JavaAdvance;

public class CowTester {
    public static void main(String[] args) {

        CowThisKeyword cow = new CowThisKeyword("Australian ", "Black " , 20 , 200 );
        System.out.println(cow.getCowInfo());//Breed= Australian Color= null Age= 0 Weight= 0.0
                                             // THE RESULTS OF Color= null Age=0 and Weight=0.0
                                             // is because instance variable of these fields have not been assigned
                                             // and only breed was fixed by the keyword this.

    }
}

