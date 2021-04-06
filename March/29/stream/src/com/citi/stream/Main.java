package com.citi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> items = new ArrayList<String>();
        items.add("Alpha");
        items.add("Beta");
        items.add("Charlie");
        items.add("Beta");
        items.add("Charlie");

//        for (String i: items) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < items.size() ; i++) {
//            System.out.println(items.get(i));
//        }

//        Stream<String> stream = items.stream();

        items.stream().distinct().forEach(value -> System.out.println(value));

    }
}
