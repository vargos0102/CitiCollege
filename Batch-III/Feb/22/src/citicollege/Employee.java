package citicollege;

public class Employee extends Person {

    private int salary;
    public int getSalary(){
        return salary;
    }

    public void setSalary(int newSalary){
        salary = newSalary;
    }

    public void printDetails() {
        System.out.println("Employee:" +salary);
    }
}
