package com.excercise;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Question: write a function that will return true if there are 1 to 3 'e' chars
        //example: checkE("Hello") -> true
        //checkE("Heelle") -> true
        //checkE("Heelele") -> false

        System.out.println(checkE("Hello"));
        System.out.println(checkE("Heelle"));
        System.out.println(checkE("Heelele"));
    }

    public static boolean checkE(String strValue) {
        int count = 0;
        for (int i = 0; i < strValue.length() ; i++) {
            if(strValue.charAt(i) == 'e')
            {
                count = count +1;
            }
        }
        if(count >= 1 && count <= 3)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
