package citi.may20;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England","London");//key/value pair
        capitalCities.put("Canada","Ottawa");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Argentina","Aires");

        System.out.println(capitalCities);

        for (String k: capitalCities.keySet()) {
            System.out.println(k);
        }
        for (String v: capitalCities.values()) {
            System.out.println(v);
        }
        for (String k: capitalCities.keySet()) {
            System.out.println("key: "+k+", value:"+capitalCities.get(k));
        }

        //curiosity
        ArrayList<String> t = new ArrayList<>(capitalCities.keySet());
        Collections.sort(t);
        System.out.println(t);
        for (String k: t) {
            System.out.println("key: "+k+", value:"+capitalCities.get(k));
        }
        //end


        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("Germany"));
        capitalCities.remove("England");
        System.out.println(capitalCities);

        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
