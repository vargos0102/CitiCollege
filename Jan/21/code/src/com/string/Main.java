package com.string;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String fullName = "John Doe";
        String welcome ="Hello! and Welcome";
        System.out.println("Length of the string is:"+ fullName.length() );
        //fullName + " " + welcome
        System.out.println(fullName.concat(" ").concat(welcome));
        System.out.println("Upper Case: "+fullName.toUpperCase());
        System.out.println("Lower Case: "+fullName.toLowerCase());
        System.out.println("Index of:"+fullName.indexOf("Doe"));

        //Hello's welcome to the "City"\"Country"
        String str = "Hello's welcome to the \"City\" \\ \"Country\"";
        String email = "asim123@gmail.com$";
        System.out.println(email.substring(0,email.indexOf('@')));
        System.out.println(str);
        System.out.println(email);
    }
}
