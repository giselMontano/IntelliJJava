package com.syntax.class18JavaAdvance;

public class LaptopThisAnotherKind {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;

    public LaptopThisAnotherKind() {
        System.out.println("Basic construction is happening...");
    }
    //one parameter
    public LaptopThisAnotherKind(String make) {
        this.make = make;
    }
    //two parameters
    public LaptopThisAnotherKind(String make, String model) {
        // this.make = make;

        this(make);
        this.model = model;
    }
    //three parameters
    public LaptopThisAnotherKind(String make, String model, String storage) {
        /*
        this.make = make;
         this.model = model;*/

        this(make, model);
        this.storage = storage;
    }
    //four parameters
    public LaptopThisAnotherKind(String make, String model, String storage, String memory) {
        /*
        this.make = make;
        this.model = model;
        this.storage = storage;*/

        this(make, model, storage);
        this.memory = memory;
    }
    //five parameters
    public LaptopThisAnotherKind(String make, String model, String storage, String memory, double screenSize) {
       /*
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;*/

        this(make, model, storage, memory);//calling constructors so we don't repeat lines of codes
        // this+(instance names separate by commas);

        this.screenSize = screenSize;
    }

    public static void main(String[] args) {


        LaptopThisAnotherKind apple = new LaptopThisAnotherKind("Apple", "M1Pro 14", "512", "16", 14.2);

    }
}



