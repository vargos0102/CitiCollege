package com.method;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        System.out.println(x);
        printMessage("Hello There!!");
        printMessage("Please have a seat..");
        int y = 20;
        System.out.println(y);
        printMessage("Bye!!");

        printSentence("Jack",16);
        printSentence("Jill", 17);
        int result = add(90,80);
        result = result/100;
        System.out.println("Percentage: "+ result);

        int output=sub(90,80);
        System.out.println(output);
        //printMessage("Jack");
//        String str = printMessage1("Jack");
//        System.out.println(str);
    }


    static void printMessage(String msg)
    {
        System.out.println(msg);
    }

//    static String printMessage1(String msg)
//    {
//        return "Hello!! "+msg;
//    }


    static void printSentence(String fname, int age)
    {
        System.out.println("My name is "+fname+" and I'm "+ age+" years old." );
    }

    static int add(int num1, int num2)
    {
        int sum = num1+num2;
        return sum;
    }
    static int sub(int num1, int num2)
    {
        int result = num1-num2;
        return result;
    }
}
