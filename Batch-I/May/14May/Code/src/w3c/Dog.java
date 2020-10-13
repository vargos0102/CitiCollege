package w3c;

public class Dog implements Animal, Sleep {
    public void AnimalSound(){
        System.out.println("Bow!");
    }

    public void SleepSound() {
        System.out.println("Dog Sleeps");
    }
}
