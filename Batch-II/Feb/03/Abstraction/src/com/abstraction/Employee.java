package com.abstraction;

abstract class Employee {

    private String fname;
    String lname;
    int age;

    public String getFName()
    {
      return fname;
    }
    public void setFName(String value)
    {
        fname = value;
    }
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
