package com.methodoverloading;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Add(8,7);
        Add(8.5,7.5);
        Add(8,7,6);
    }
    static void Add(int x, int y)
    {
        System.out.println(x+y);
    }
    static void Add(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }
    static void Add(double x, double y)
    {
        System.out.println(x+y);
    }
//    static void Add(int y, int x)
//    {
//        System.out.println(y+x);
//    }
}
