package com.citi.stream;

public class Main {
    int x = 5;
    int y = 10;
    String name = "John Doe";

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        printName(obj.name);
    }

    public static void printName(String firstName) {
        System.out.println("Hello!! "+firstName);
    }
}
