package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int id = 0;
        Scanner s = new Scanner(System.in);
        //String[] cars = {"Honda","Toyota","Hyundai"};

        Employee[] employees = new Employee[10];
        String ans;
        do {
            Employee eobj = new Employee();
            System.out.println("Add First Name..");

            String fname =s.nextLine();

            System.out.println("Add Last Name..");
            String lname =s.nextLine();

            System.out.println("Add Address..");
            String address =s.nextLine();

            System.out.println("Add Salary..");
            Double sal =s.nextDouble();

            eobj.fName = fname;
            eobj.lName = lname;
            eobj.address = address;
            eobj.salary = sal;
            eobj.id = id;
            employees[id] = eobj;
            id++;
            System.out.println("Add More Employees? Y/N");
            s.nextLine();
            ans=s.nextLine();
        }while (ans.equals("Y"));



          System.out.println(employees[0].fName);
          System.out.println(employees[1].fName);
//        eobj1.fName = "Jack";
//        eobj1.lName = "W";
//        eobj1.address = "Toronto";
//        eobj1.salary = 10000;
//        eobj1.id = 1;
//        eobj1.printDetails();
//        double raiseAmount1 = eobj1.giveRaise();
//        System.out.println("Your new salary is: "+raiseAmount1);


//        Employee eobj2 = new Employee();
//        eobj2.fName = "Jill";
//        eobj2.lName = "W";
//        eobj2.address = "Mississauga";
//        eobj2.salary = 11000;
//        eobj2.id = 2;
//        eobj2.printDetails();
//        double raiseAmount2 =eobj2.giveRaise();
//        System.out.println("Your new salary is: "+raiseAmount2);

    }
}
