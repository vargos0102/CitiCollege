package citi.may08;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1 = new Employee();

        e1.setEmployeeId(2001);
        System.out.println(e1.getEmployeeId());

        e1.setEmployeeName("John");
        System.out.println(e1.getEmployeeName());

        e1.setDoB(LocalDate.of(1990,06,01));
        System.out.println(e1.getDoB());
    }
}
