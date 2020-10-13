package citi.may06;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    public int EmployeeId;
    public String Name;
    public String Designation;
    public int Salary;
    public String EmailAddress;
    public LocalDate DateOfBirth;

    public Employee()
    {
        EmployeeId = 1001;
    }
    public String DisplayEmployeeInfo()
    {
        if(Salary == 0)
        {
            return "Designation: "+ Designation + ",Email: "+EmailAddress;
        }
        else
        {
            return "Salary: $" + Salary + ", Designation: " + Designation + ",Email: "+EmailAddress;
        }
    }
    public String DisplayAge()
    {
        Period p = Period.between(DateOfBirth, LocalDate.now());
        return "Age: "+ p.getYears();
    }
}
