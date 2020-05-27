package citi.may21;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<Integer,People> peopleDetails = new HashMap<Integer, People>();
        peopleDetails.put(1001,new People("Alice",21,"Toronto"));
        peopleDetails.put(1002,new People("Tom",31,"Ottawa"));
        peopleDetails.put(1003,new People("Ben",41,"Vancouver"));


        for (Integer i: peopleDetails.keySet()) {
            People p = peopleDetails.get(i);
            System.out.println("key: "+i+", value: "+p.City+" "+ p.Name+" "+p.Age);
        }

        int i = 10;
        Integer i1 = 21;

        boolean b = false;
        Boolean b1 = false;

        String name = "Name:Alice, Age:";
        System.out.println(i);
        System.out.println(name.concat(i1.toString()));
        System.out.println(name.concat(b1.toString()));


    }
}
