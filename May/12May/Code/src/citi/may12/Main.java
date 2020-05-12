package citi.may12;

import citi.w3c.Animal;
import citi.w3c.Cat;
import citi.w3c.Dog;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle v1 = new Vehicle();
        v1.Honk();

        Vehicle v2 = new Car();
        v2.Honk();

        Vehicle v3 = new Bike();
        v3.Honk();

        Vehicle v4 = new Bus();
        v4.Honk();

        Animal a1 = new Animal();
        a1.animalSound();

        Animal a2 = new Dog();
        a2.animalSound();

        Animal a3 = new Cat();
        a3.animalSound();
    }
}
