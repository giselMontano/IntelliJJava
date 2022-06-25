package com.syntax.class20JavaAdvance;

public class BirdTester {
    public static void main(String[] args) {
        Parrot parrot1 = new Parrot("Filomeno", "Green", 10, .5);
        parrot1.printInfo();

        Sparrow sparrow1 = new Sparrow("jack Sparrow", "White", 10, .5);
        sparrow1.printInfo();
    }
}
