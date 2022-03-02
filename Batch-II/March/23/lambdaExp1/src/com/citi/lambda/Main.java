package com.citi.lambda;

public class Main {

    interface MathOperation {
        int operation(int a , int b);
    }

    public static void main(String[] args) {
    MathOperation addition = (a, b) -> a+b;
    PerformOperation(10,20, addition);

    MathOperation substraction = (a, b) -> a-b;
    PerformOperation(20,5,substraction);

    MathOperation multiply = (a, b) -> a*b;
    PerformOperation(10,10, multiply);

    MathOperation divide = (a, b) -> a/b;
    PerformOperation(20,5, divide);
    }
    public static void PerformOperation(int a, int b, MathOperation perform)
    {
       System.out.println(perform.operation(a, b));
    }
}
