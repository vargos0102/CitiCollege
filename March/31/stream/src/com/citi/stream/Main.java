package com.citi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("John");
        names.add("Adam");
        names.add("Banner");
        names.add("Jenny");

        names.stream().sorted().map(s->s.toUpperCase()).forEach( x-> System.out.println(x));

//        List<String> alteredNames = new ArrayList<>();
//        for (int i = 0; i < names.size(); i++) {
//
//            if(names.get(i).substring(0,2).contains("J"))
//            {
//                alteredNames.add("Ms. "+names.get(i));
//            }
//            else
//            {
//                alteredNames.add("Mr. "+names.get(i));
//            }
//        }
//        for (int i = 0; i < alteredNames.size(); i++) {
//            System.out.println(alteredNames.get(i));
//        }



//        Stream<String> stream = names.stream();
//        stream.map( s-> s.substring(0,2).contains("J") ? "Ms. "+ s:"Mr. "+s ).forEach(x-> System.out.println(x));



        //mappedStream.forEach(x-> System.out.println(x));


    }
}
