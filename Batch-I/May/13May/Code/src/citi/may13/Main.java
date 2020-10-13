package citi.may13;

import w3c.Cat;
import w3c.Dog;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //instantiate the Vehicle class

        Car c1 = new Car();
        c1.Honk();
        c1.Model();

        Bike b1 = new Bike();
        b1.Honk();
        b1.Model();

        Dog d1 = new Dog();
        d1.animalSound();
        d1.Sleep();

        Cat ca1 = new Cat();
        ca1.animalSound();
        ca1.Sleep();
    }
}
