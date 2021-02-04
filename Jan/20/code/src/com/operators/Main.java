package com.operators;

public class Main {

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Travolta";

        int x = 10;
        int y = 9;
        double x1 = 10;
        double y1 = 9;
        float z = 1.99f;
        System.out.println(x+y);
        System.out.println(x+y+z);
        int r = y-x;
        System.out.println("Subtract: "+ r);
        System.out.println("Multiply: "+x*y);
        System.out.println("Divide int data type: "+x/y);
        System.out.println("Divide double data type: "+x1/y1);
        System.out.println("Modulus: "+x%y);
        ++x;
        System.out.println("Increment: "+x);
        --y;
        System.out.println("Decrement: "+y);
        System.out.println(firstName + " " +lastName);
    }
}
