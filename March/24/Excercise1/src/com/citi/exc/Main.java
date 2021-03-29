package com.citi.exc;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    A) int cardVal = 6;
//    B) int cardVal = 10;
//    C) int cardVal = 14;
//    D) int cardVal = 18;
    public static void main(String[] args) {
        int cardVal  = 18;
	// write your code here
        switch (cardVal) {
            case 4: case 5: case 6:
            case 7: case 8:
                System.out.println("Hit");
                break;
            case 9: case 10: case 11:
                System.out.println("Double");
                break;
            case 15: case 16:
                System.out.println("Surrender");
                break;
            default:
                System.out.println("Stand");
        }

    }
}
