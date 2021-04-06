package com.citi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //IntStream.range(90,101).forEach(x-> System.out.println(x));

        IntStream intStream = Arrays.stream(new int[] {1,2,3,5,8,13});
        intStream.map(x-> x * 2).max().ifPresent(System.out::println);

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(5);
//        arrayList.add(8);
//        arrayList.add(13);
//        Integer sum = 0;
//        for (int i = 0; i < arrayList.size() ; i++) {
//            sum = sum + arrayList.get(i);
//        }
//        Integer average = sum / arrayList.size();
//        System.out.println(average);

    }
}
