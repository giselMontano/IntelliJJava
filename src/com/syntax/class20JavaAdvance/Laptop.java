package com.syntax.class20JavaAdvance;

public class Laptop {
    int storage=512;
    public int RAM=32;
    protected String make;//<---when you have protected modify you can access this field in another package
    String model;
    void printModel(){
        System.out.println(model);

    }
}
