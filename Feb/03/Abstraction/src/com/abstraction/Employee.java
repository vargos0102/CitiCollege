package com.abstraction;

abstract class Employee {

    String fname;
    String lname;
    int age;
    public String getFullName()
    {
        return  fname + " "+lname;
    }

    public void printDetails()
    {
        System.out.println(fname+","+lname+","+age);
    }

    abstract void Salary();

}
