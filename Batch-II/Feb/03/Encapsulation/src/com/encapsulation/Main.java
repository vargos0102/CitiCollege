package com.encapsulation;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person p = new Person();
        //p.name = "Milo";
        //p.age = 42;
        p.setName("Milo");
        p.setAge(42);

        //System.out.println(p.name);
        //System.out.println(p.age);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
