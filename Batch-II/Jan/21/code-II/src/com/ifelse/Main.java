package com.ifelse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean agree = false; //default value is false.
         agree = true;
        System.out.println(agree);

        int x = 99;
        int y = 100;
        x =101;
        System.out.println(x > y);

        if(x>y)
        {
            System.out.println("The value of x is greater than y");
        }
        else
        {
            System.out.println("The value of y is greater than x");
        }

        int time = 22;
        if(time<10)
        {
           System.out.println("Good Morning");
        }
        else if(time < 20)
        {
            System.out.println("Good day!");
        }
        else
        {
            System.out.println("Good Evening");
        }
    }
}
