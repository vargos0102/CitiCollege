package citicollege;

import citicollegeEmployees.Staff;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Staff s1 = new Staff();
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("kelly");
        names.add("marshal");
        names.add("Tom");

        for (int i = 0; i <= 3; i++) {
         System.out.println(names.get(i));
        }

    }
}
