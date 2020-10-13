package citi.apr27;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*int t = Add(10, 3);
        System.out.println(t);

        int t1 = Add(40,5);
        System.out.println(t1);

        int t2 = Add(2323, 121);
        System.out.println(t2);

        int t3 = Sub(10,3);
        System.out.println(t3);

        int t9 = Sub(9,19);
        System.out.println(t9);

        int t4 = Sub(121,2323);
        System.out.println(t4);

        int t5 = Multiply(10,3);
        System.out.println(t5);

        int t6 = Multiply(2323,121);
        System.out.println(t6);

        int t7 = Divide(10,100);
        System.out.println(t7);

        int t8 = Divide(9,81);
        System.out.println(t8);*/

        double t9 = Divide(40,3);
        System.out.println(t9);

        float t10 = Multiply(10.01f,5.55f);
        System.out.println(t10);

        double t11 = Add(10.01,5.55);
        System.out.println(t10);
        double t12 = Sub(10.01,5.55);
        System.out.println(t10);

    }

    // public : it can be called or accessed by anyone(any other method)
    // void : it returns nothing
    // () : input parameters, separated by comma (,,,)
    public static double Add(double number1, double number2)
    {
        double  total = 0;
        total = number1+number2;
        return total;
    }

    public static double Sub(double number1, double number2)
    {
        double diff = 0;
        if(number1 > number2)
        {
            diff = number1 - number2;
        }
        else
        {
            diff = number2 - number1;
        }
        return diff;
    }

    public static float Multiply(float number1, float number2)
    {
        return number1 * number2;
    }

    public static double Divide(double number1, double number2)
    {
        double result;
        if(number1>number2)
        {
            result = number1/number2;
        }
        else
        {
            result = number2/number1;
        }
        return result;
    }
}
