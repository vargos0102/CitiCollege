package com.citi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> sizes = new ArrayList<>();
        sizes.add(32);
        sizes.add(34);
        sizes.add(36);
        sizes.add(38);

        //Excercise: Use stream to increment the number by 1 and print the output..

        Stream<Integer> stream = sizes.stream();
        //Stream<String> mappedStream = stream.map(i -> i+"C");
        Stream<Integer> mappedStream = stream.map(i -> i+1);

        mappedStream.forEach(value -> System.out.println(value));
    }
}
