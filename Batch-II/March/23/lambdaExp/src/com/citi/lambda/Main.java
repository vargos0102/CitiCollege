package com.citi.lambda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer item: numbers) {
            System.out.println(item);
        }

        numbers.forEach( (n) -> {System.out.println(n);} );

        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Marry");
        names.add("Wick");
        names.add("Greg");

//        System.out.println("Output from for loop");
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//
//        System.out.println("Output from forEach loop");
//        for (String item: names) {
//            System.out.println(item);
//        }

        System.out.println("Output from for lambda Expression");
        names.forEach( (n) -> { System.out.println(n);} );

    }
}
