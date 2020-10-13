package citi.may08;
import java.time.LocalDate;

public class Employee {
    private int EmployeeId;
    private String Name;
    private LocalDate DateOfBirth;

    public Employee(){
        DateOfBirth = LocalDate.of(1900,01,01);
    }

    //Setter
    public void setDoB(LocalDate doB){
        DateOfBirth = doB;
    }

    //Getter
    public LocalDate getDoB(){
        return DateOfBirth;
    }

    public void setEmployeeName(String nam){
        Name = nam;
    }

    public String getEmployeeName(){
        return Name;
    }

    //Getter
    public int getEmployeeId(){
        return EmployeeId;
    }

    //Setter
    public void setEmployeeId(int empId){
        EmployeeId = empId;
    }
}
