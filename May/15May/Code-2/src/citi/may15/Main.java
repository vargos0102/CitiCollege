package citi.may15;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Arrays
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        System.out.println(cars[2]);
        cars[3] = "Honda";
        System.out.println(cars[3]);

        //ArrayList
        ArrayList<String> sampleCars = new ArrayList<String>();
        sampleCars.add("Volvo");
        sampleCars.add("BMW");
        sampleCars.add("Ford");
        sampleCars.add("Mazda");
        System.out.println(sampleCars);

        sampleCars.remove(0);
        System.out.println(sampleCars);

        sampleCars.remove(0);
        System.out.println(sampleCars);

        sampleCars.remove(0);
        System.out.println(sampleCars);



        //The arraylist is resizable.

        //Array int
//        int[] employeeIds = {1001,1002,1003,1004};
//        System.out.println(employeeIds[0]);
//
//        ArrayList<Integer> empIds = new ArrayList<Integer>();
//        empIds.add(2001);
//        empIds.add(2002);
//        empIds.add(2003);
//        empIds.add(2004);
//        System.out.println(empIds);
//
//        empIds.remove(2);
//        System.out.println(empIds);
//
//        empIds.remove(2);
//        System.out.println(empIds);

          ArrayList<String> cartoonNames = new ArrayList<String>();
          cartoonNames.add("Donald");
          cartoonNames.add("Daffy");
          cartoonNames.add("Mickey");
          cartoonNames.add("Garfield");
          cartoonNames.add("Bugs Bunny");

          cartoonNames.set(4,"Scooby-Doo");// update

        Collections.sort(cartoonNames);//sort
        //for each loop
        for (String name: cartoonNames) {
            System.out.println(name);
        }
        //size or count
        System.out.println(cartoonNames.size());

        //reverse sort example
        Collections.reverse(cartoonNames);
        System.out.println(cartoonNames);

        ArrayList<Car> customCars = new ArrayList<>();

        customCars.add(new Car("Mercedes","S-Class","Sport",2020,240));
        customCars.add(new Car("Toyota","RAV4","SUV",2018,220));

        Car c1 = new Car();
        c1.BrandName = "Honda";
        c1.ModelName = "Civic";
        c1.Type = "Sedan";
        c1.YearModel = 2016;
        c1.TopSpeed = 180;
        customCars.add(c1);

        Collections.sort(customCars);
        for (Car c: customCars) {
            System.out.println(c.ModelName);
        }
    }
}
