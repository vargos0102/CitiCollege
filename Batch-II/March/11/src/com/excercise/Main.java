package com.excercise;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // create a function which reverses the string
        //example: reverseString("paris") -> sirap
        //reverseString("tokyo") -> oykot
        //reverseString("Amr") -> rmA

        reverseString("paris");
        System.out.println();
        reverseString("tokyo");
        System.out.println();
        reverseString("Amr");
    }

    public static void reverseString(String inputStr)
    {
        for (int i = inputStr.length()-1; i >=0 ; i--) {
            System.out.print(inputStr.charAt(i));
        }
    }
}
