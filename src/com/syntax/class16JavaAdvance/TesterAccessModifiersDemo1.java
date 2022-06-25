package com.syntax.class16JavaAdvance;

import com.syntax.class16JavaAdvance.AccessModifiersDemo1;

public class TesterAccessModifiersDemo1 {

        public static void main(String[] args) {
            //THIS IS ACCESSING FROM AccessModifiersDemo1
            AccessModifiersDemo1 ac = new AccessModifiersDemo1();
            // System.out.println(ac.password); error because its private


            System.out.println(ac.ssn);
            System.out.println(ac.name);

        }
}

