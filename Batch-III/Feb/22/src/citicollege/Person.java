package citicollege;

public class Person {
    private String name;

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void printDetails() {
        System.out.println("Person:" +name);
    }
}