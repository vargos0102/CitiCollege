package com.inheritance;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person p = new Person();
        p.firstName = "Jack";
        p.lastName = "S";
        p.age = 42;
        System.out.println(p.fullName());

        Teacher t = new Teacher();
        t.subjectName = "Maths";
        t.firstName = "Milo";
        t.lastName = "G";
        t.age = 45;
        System.out.println(t.fullName());

    }
}
