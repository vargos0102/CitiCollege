package citi.may22;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            // write your code here
            ArrayList<String> names = new ArrayList<>();
            names.add("John");
            names.add("Ben");
            names.add("Bill");
            names.add("Jack");

            if(names.size()>0) {
                throw new ArithmeticException("This is an arithmetic exception");
            }

            names.clear();
            System.out.println(names.get(0));
            names = null;
            System.out.println(names.get(0));
            System.out.println("Exiting code");
        }
        catch (NullPointerException np)
        {
            System.out.println("Null pointer exception occurred. Details:");
            np.printStackTrace();
        }
        catch (IndexOutOfBoundsException ie)
        {
            System.out.println("Index out of Bounds exception occurred. Details:");
            ie.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("Hey your code threw an exception. Details:");
            e.printStackTrace();
        }
        finally{
            System.out.println("This will always get executed");
        }

    }
}
