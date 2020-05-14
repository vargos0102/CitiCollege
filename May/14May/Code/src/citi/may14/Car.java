package citi.may14;

public class Car implements Vehicle, VehicleType {
    public void Honk(){
        System.out.println("Car Honk!");
    }

    public void PassengerCapacity(){
        System.out.println("SUV");
    }
}
