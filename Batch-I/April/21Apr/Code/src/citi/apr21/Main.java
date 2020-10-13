package citi.apr21;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;

        while(count<5)
        {
            System.out.println( "Value of Count "+count);
            count++;
        }

        //Another example

        String[] cars = {"Volvo","BMW","Nissan","Toyota"};
        int i = 0;
        while (i < cars.length)
        {
            System.out.println(cars[i]);
            i++;
        }

        //Do while loop
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        }
        while (counter<5);

        //Another example
        int counting = 5;
        do {
            System.out.println("Counting value: "+counting);
            counting++;
        }
        while (counting<5);

        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        do {
            System.out.println("Enter Positive Number");
            userNumber = scanner.nextInt();
        }
        while(userNumber<0);
        //


    }

}
