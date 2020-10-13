package citi.apr29;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // 40, Adult.
    // 12, Child.
    // 65+, Senior.
    // 13-19, Teen.
       String a1 = AgeClassification(40);
       System.out.println(a1);

       String a2 = AgeClassification(17);
       System.out.println(a2);

        String a3 = AgeClassification(65);
        System.out.println(a3);

        String a4 = AgeClassification(10);
        System.out.println(a4);

        String a5 = AgeClassification(19);
        System.out.println(a5);

        Name("John");
    }

    public static String AgeClassification(int age)
    {
        String classification = "";
        if(age <= 12)
        {
            classification = "Child";
        }
        else if(age > 12 && age<= 19) //and &&, or ||
        {
            classification ="Teen";
        }
        else if(age > 64)
        {
            classification = "Senior";
        }
        else
        {
            classification = "Adult";
        }
        return classification;
    }

    public static void Name(String fname)
    {
        System.out.println(fname + "Doe");
    }

}
