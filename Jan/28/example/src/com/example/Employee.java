package com.example;

public class Employee {
    //attributes
    String fName;
    String lName;
    int id;
    double salary;
    String address;

    public void printDetails()
    {
        System.out.println("Employee Details:"+fName + " "+ lName+", id: "+id+", address: "+ address+", " +
                "salary:"+salary);
    }

    public double giveRaise()
    {
        return salary/100 + salary;
    }
}
