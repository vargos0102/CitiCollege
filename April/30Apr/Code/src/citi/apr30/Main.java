package citi.apr30;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Method overloading: With method overloading, multiple methods can have the same name with different parameters,
        // including number of parameters.

        //System.out.println(Add(10.01,13.02));
        System.out.println(Add(10,13,1));
        System.out.println(Add(10,13));
    }

    public static int Add(int number1, int number2)
    {
        return number1 + number2;
    }

    /*public static double Add(double number1, double number2)

    {
        return number1 + number2;
    }*/

    public static int Add(int number1, int number2, int number3)
    {
        return number1 + number2 + number3;
    }
}
