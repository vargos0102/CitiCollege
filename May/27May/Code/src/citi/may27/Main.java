package citi.may27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //How to find a prime number or not
        //PrimeNumbers: 1,2,3,5,7,11

        int temp;
        boolean isPrime = true;
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter any number");

        int num = scanObj.nextInt();
        scanObj.close();
        for (int i = 2; i <=num/2 ; i++) {
            temp = num%i;
            if(temp==0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num+" is a Prime number");
        else
            System.out.println(num+" is NOT a Prime number");
    }
}
