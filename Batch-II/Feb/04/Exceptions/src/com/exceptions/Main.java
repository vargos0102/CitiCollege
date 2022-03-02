package com.exceptions;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try
        {
            int i = 10;
            int[] numbers = {1,2,3};
            System.out.println(numbers[3]);

            System.out.println("Program Ends..");
        }
        catch (Exception e)
        {
            System.out.println("An error has occurred. Please try again later..");
        }
        finally {
            System.out.println("Program ends finally!!");
        }

    }
}
