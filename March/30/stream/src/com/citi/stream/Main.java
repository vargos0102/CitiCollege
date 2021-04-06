package com.citi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        String name = "Lima";
//        System.out.println(name.substring(1,3));

        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Adam");
        names.add("Jack");

       Stream<String> stream = names.stream();
       //Stream<String> mappedStream = stream.map(amr -> amr.toUpperCase());
        Stream<String> mappedStream = stream.map(s -> s.substring(0,1).toLowerCase() + s.substring(1,4).toUpperCase());
//        Stream<String> mappedStream = stream.map(str -> "Mr. "+str  );
        mappedStream.forEach(value-> System.out.println(value));

    }
}
