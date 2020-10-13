package citi.may11;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1 = new Employee();
        e1.DisplayNameAddress();

        Car c1 = new Car();
        System.out.println(c1.Brand + ", "+ c1.ModelName);
        c1.Honk();

        Bike b1 = new Bike();
        System.out.println(b1.Brand + ", "+ b1.EngineCapacity);
        b1.Honk();
    }
}
