package citi.may05;

public class Employee {

    public int EmployeeId;
    public String Name;
    public String Designation;
    public int Salary;
    public String EmailAddress;

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
}
