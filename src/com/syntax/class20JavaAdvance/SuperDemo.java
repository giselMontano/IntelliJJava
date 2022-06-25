package com.syntax.class20JavaAdvance;

public class SuperDemo {
}
//INHERITANCE MULTILEVEL
class Wood{
    String color="Blue";//THIS COLOR CAN NOT BE ACCESS
}
class Furniture extends Wood{

    String color="Black";
}
class Chair extends Furniture{
    String color="grey";//LOCAL VARIABLE
    void printColor(){
        String color="White";
        System.out.println(color);//WHITE->always local variables are preferred
        System.out.println(this.color);//GRAY->SAME NAMES OF VARIABLE LOCAL AND INSTANCE (THIS.) HELPS TO TAKE THE INSTANCE
        System.out.println(super.color);//BLACK->THIS REFEREES TO IMMEDIATE PARENT CLASS/SUPER CLASS (FURNITURE)
                                        // NOT THE ONE ALL THE WAY AT THE TOP
       //WOOD COLOR-->WILL NOT BE ABLE TO BE ACCESSES BECAUSE SUPER KEYWORD ONLY HELP TO GET THE VALUE FROM THE IMMEDIATE PARENT
    }

    public static void main(String[] args) {
        Chair silla=new Chair();
        silla.printColor();
    }
}
