package com.citi.lambda;

public class Main {

    interface StringFunction {
        String run(String str);
    }

    public static void main(String[] args) {
	// write your code here
        StringFunction exclaim = (s)-> s+"!";
        StringFunction ask = (s) -> s+"?";
        //exclaim.run("Hello");
        //ask.run("Where");

        printFormatted("Hello", exclaim);
        printFormatted("Where", ask);
    }

    public static void printFormatted(String str, StringFunction format ){
       String result = format.run(str);
       System.out.println(result);
    }
}
