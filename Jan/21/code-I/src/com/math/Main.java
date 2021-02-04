package com.math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        int y = 9;
        int z = -99;
        double x1 = 1.9998;
        double y1 = 1.9996;
        System.out.println("Math Min: "+Math.min(x,y));
        System.out.println("Math Max: "+Math.max(x,y));

        System.out.println("Math Min: "+Math.min(x1,y1));
        System.out.println("Math Max: "+Math.max(x1,y1));

        System.out.println("Math Sqrt: " +Math.sqrt(x));
        System.out.println("Math Abs: " +Math.abs(9-10));
        System.out.println("Math Random: " +Math.random());
    }
}
