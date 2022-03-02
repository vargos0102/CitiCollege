package citicollege;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            int a = 10;
            int b = 0;

            System.out.println(a/b);
            System.out.println("Code line after exception");
            System.out.println("Code line after exception 1");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception has occurred "+e);
        }
        catch(Exception e) {
            System.out.println("Exception has occurred "+e);
        }

        finally {
            System.out.println("Finally getting executed");
        }
    }
}
