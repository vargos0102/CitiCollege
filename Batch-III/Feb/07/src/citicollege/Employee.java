package citicollege;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private Integer salary;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String newName) {
        firstName = newName;
    }

}
