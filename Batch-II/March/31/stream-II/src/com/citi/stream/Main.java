package com.citi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("David");
        names.add("Jenny");
        names.add("Milo");
        names.add("John");

//        Stream<String> stream = names.stream();
//        Stream<String> filteredStream = stream.filter(s -> s.substring(0,1).indexOf("J") == -1);
//        filteredStream.forEach(x-> System.out.println(x));

        names.stream()
                .filter(s-> s.substring(0,1).indexOf("J") == 0)
                .map(s-> s.toUpperCase())
                .forEach(x-> System.out.println(x));
    }
}
