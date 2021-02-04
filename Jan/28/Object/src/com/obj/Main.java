package com.obj;

public class Main {

    int x ;

    public static void main(String[] args) {
	// write your code here
        Car ford = new Car();
        Car toyota = new Car();
        System.out.println(ford.name);
        System.out.println(toyota.name);

        Main obj1 = new Main();
        Main obj2 = new Main();
        System.out.println(obj1.x);
        System.out.println(obj2.x);

    }
}
