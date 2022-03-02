package com.citi;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Provide a number 1");
        int x = Integer.parseInt(in.nextLine());
        System.out.println("Provide a number 2");
        int y = Integer.parseInt(in.nextLine());

        System.out.println("The output is:" + (x+y));
    }
}
