package citi.apr15;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Java variables: int speed = 100; speed(variable); String name = "Alex", (name is the variable)
        // Java Data types: int, String, char, boolean, float
        // Java Operators: +, -, *, /, ++

        //Strings:
        String txt = "Myname is John &", name = "John..", place="& I live in Toronto";

        System.out.println(txt.length());

        System.out.println(txt.toUpperCase());

        //Concatenating: joining two strings or words
        System.out.println(txt + name);

        System.out.println(txt.concat(name));
        System.out.println(name.concat(txt));

        System.out.println(txt + name + place);
        System.out.println(txt.concat(name).concat(place));

//      System.out.println(txt.indexOf(" "));
//      System.out.println(place.indexOf("o"));
//      System.out.println(place.indexOf("y"));

        System.out.println(txt.indexOf("n"));
        System.out.println(txt.indexOf("n", txt.indexOf("n")+1));

        //Math: common mathematics functions
        int x = 90, y = 99, a = 9, b = 0;

        System.out.println( "Math.abs example: " + Math.abs ((b-1) * a));

        System.out.println("Maximum Value is :" + Math.max(x,y));

        System.out.println("Minimum value is:" +  Math.min(x, y));

        System.out.println("Square root is: " + Math.sqrt(49));

        System.out.println("Absolute value is: " + Math.abs(-99));

        // returns any value between 0 and 1.
        System.out.println("Math.random example: " + Math.random());
    }
}
