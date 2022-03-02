package com.forloop;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String names = "John, Max, Neo, Jack";
        System.out.println(names);
        String[] individualNames = names.split(",");
        for (int i = 0; i< individualNames.length; i++)
        {
            System.out.println("Individual Names: "+individualNames[i]);
        }

//        int x = 5;
//
//        for(int i = 0; i < x; i++)
//        {
//            System.out.println("The value of i is: "+ i);
//        }
    }
}
