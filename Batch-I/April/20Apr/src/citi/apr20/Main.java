package citi.apr20;

public class Main {

    public static void main(String[] args) {
	// write your code here

       int day = 5;
       switch (day)
       {
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           default:
               System.out.println("No day exists");
               break;
       }
    // Second language
       String language = "";
       switch (language)
       {
           case "English":
               System.out.println("Hello!");
               break;
           case "French":
               System.out.println("Bonjour");
               break;
           case "Spanish":
               System.out.println("Amigos");
               break;
           /*default:
               System.out.println("Language doesn't exist");
               break;*/
       }

       //For Loop
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Executing statement:"+ i);
        }
        //Another example
        for (int i = 1; i <= 5 ; i++) {
            String name = "John";
            System.out.println(name+i);
        }

        //For Each loop: can only be applied to collection(ex: Arrays)
        String[] cars = {"Volvo", "BMW", "Ford", "Nissan"};

        for (String i: cars ) {
            System.out.println(i);
        }

        int[] employeeIds = {1001, 1002, 1003, 1004};

        for (int i: employeeIds) {
            System.out.println(i);
        }

    }
}
