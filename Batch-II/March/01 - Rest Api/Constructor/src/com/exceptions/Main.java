package com.exceptions;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Blog b1 = new Blog();
        Blog b2 = new Blog(1,"type your title","sample content");

        System.out.println(b1.id);
        System.out.println(b1.title);
        System.out.println(b1.content);
        System.out.println(b1.toString());

        System.out.println(b2.id);
        System.out.println(b2.title);
        System.out.println(b2.content);
        System.out.println(b2.toString());
    }
}
