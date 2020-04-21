package citi.apr16;

public class Main {

    public static void main(String[] args) {


        //booleans: It is a data type which holds 2 values (true or false)
        boolean flag = true;
        boolean isExample = false;

        System.out.println(flag);
        System.out.println(isExample);

        boolean checkGreaterThan;
        checkGreaterThan = 100 > 99;
        System.out.println(checkGreaterThan);

        //Conditional Statements: If..Else is the most widely used conditional statement across languages
        // any condition which gives you either true or false
        int x = 30, y = 20;

        if(y > x)
        {
            //code written here will be executed/ run
            System.out.println("In if code block");
        }
        else {
            //anything that fails the condition
            System.out.println("In else code block");
        }

        //nested if..else staement
        int a = 22, b = 22;

        if(a > b)
        {
            System.out.println("a is greater than b");
        }
        else if (b > a)
        {
            System.out.println("b is greater than a");
        }
        else
        {
            System.out.println("a is equal to b");
        }
    }
}
