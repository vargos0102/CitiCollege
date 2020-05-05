package citi.may05;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee e1 = new Employee();
        e1.Name = "Bob";
        e1.Designation = "Builder";
        //e1.Salary = 1000;
        e1.EmailAddress = "test@gmail.com";

        System.out.println(e1.EmployeeId);
        System.out.println(e1.Name);
        System.out.println(e1.Designation);
        System.out.println(e1.DisplayEmployeeInfo());
    }
}
