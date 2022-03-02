package citicollege;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "John Doe";
        String greeting = "Good Evening!";

        System.out.println(name);

        System.out.println("Length is:" + name.length());

        String txt = "There many species of tigers in forest!";
        System.out.println("Index of tigers is:" + txt.indexOf("tigers"));

        System.out.println("Uppercase:" + txt.toUpperCase());
        System.out.println("Lowercase:" + txt.toLowerCase());

        System.out.println("Concat example:" + greeting.concat(" ").concat(name));
    }
}
