package citi.apr23;

public class Main {

    public static void main(String[] args) {
	// write your code here

       int x = StupidMath(4, 6);
       System.out.println(x);

       x = StupidMath(40,4);
       System.out.println(x);

       x = StupidMath(50,4444);
       System.out.println(x);
    }

    public static int StupidMath(int number1, int number2)
    {
        int x = number1 + number2;
        x = x * 10;
        x = x + 100;
        return x;
    }

}
