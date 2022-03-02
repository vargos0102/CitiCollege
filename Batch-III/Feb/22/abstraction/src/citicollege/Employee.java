package citicollege;

public class Employee implements IPerson {
    private String name;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void printName(){
        System.out.println(getName());
    }
}
