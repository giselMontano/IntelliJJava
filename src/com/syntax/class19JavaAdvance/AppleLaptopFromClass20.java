package com.syntax.class19JavaAdvance;

import com.syntax.class20JavaAdvance.Laptop;

public class AppleLaptopFromClass20 extends Laptop {
    void printMake() {
        // can't access because we are in a different package if its default access modify
        // but can access if its protected
        System.out.println(make);//<---its in protected modify now
    }
}
