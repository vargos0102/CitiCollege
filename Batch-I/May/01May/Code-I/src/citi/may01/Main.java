package citi.may01;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car obj1 = new Car();
        obj1.ModelName = "Toyota";
        obj1.CarType = "SUV";

        Car obj2 = new Car();
        obj2.ModelName = "Honda";
        obj2.CarType = "Sedan";

        System.out.println(obj2.ModelName);
        System.out.println(obj1.ModelName);
    }

}


