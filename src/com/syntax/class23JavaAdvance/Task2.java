package com.syntax.class23JavaAdvance;

public class Task2 {
    /*
   Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest
based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
    */

}
//We can not use static in a method if is it ask to create a instance method
//When we have instance variables we should initialize a constructor in order to initialize those variables
class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;

    }


    public void calculateInterest() {
        System.out.println("Interest" + (balance * interest / 100));

    }

}

//Matching  constructor must be initialized in child class and call super() to initialize variables from parent calls
class Visa extends CreditCard {
    Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class AX extends CreditCard {

    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest" + (balance * interest / 100 + 5));
    }


//MAIN METHOD
    public static void main(String[] args) {
        CreditCard card = new CreditCard(100, 15);
        card.calculateInterest();
        Visa card2 = new Visa(100, 20);
        card2.calculateInterest();
        AX card3=new AX(100,15);
        card3.calculateInterest();

    }
}

