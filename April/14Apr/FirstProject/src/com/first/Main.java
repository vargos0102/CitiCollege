package com.first;

public class Main {

    public static void main(String[] args) {

        float deciNumber1 = 122.22f;
        float deciNumber2 = 133.33f;

        float deciNumber3 = deciNumber1 * deciNumber2;
        System.out.println(deciNumber3);

        int Number4 = 10;
        float Number5 = deciNumber3 + Number4;

        System.out.println(Number5);

//
        String s1 = "John", s2 ="Doe";
        String s3 = s1 + s2;

        System.out.println(s3);

        // Arthimetic operators like +, -, *, / are possible on int and float.
        // + is possible on String

        int num1 = 20;
        num1 = ++num1; //++ means incrementing value by 1
        num1 = ++num1;

        System.out.println(num1);
    }
}
