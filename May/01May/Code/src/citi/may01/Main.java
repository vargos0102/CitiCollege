package citi.may01;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Display("John");
        Display("John", "Doe");
        Display("John","Doe","617 456 1234");
        Display("John","Doe",123456789);
    }
// method overloading:
// 1. number of input parameters are changing
// 2. Data type is different
// 3. Return type is different
    public static void Display(String fname)
    {
        System.out.println(fname);
    }

    public static void Display(String fname, String lname)
    {
        System.out.println(fname + lname);
    }

    public static void Display(String fname, String lname, String phoneNumber)
    {
        System.out.println("Name: "+fname + lname + ", Phone Number: "+ phoneNumber);
    }

    public static void Display(String fname, String lname, int phoneNumber)
    {
        System.out.println("Name: "+fname + lname + ", Phone Number: "+ phoneNumber);
    }
}
