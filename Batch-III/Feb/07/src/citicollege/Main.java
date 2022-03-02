package citicollege;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setDepartment("IT");
        e1.setLastName("Doe");
        e1.setSalary(2000);
        System.out.println(e1.getFirstName() + e1.getLastName() + e1.getDepartment() +e1.getSalary());

        Manager m1 = new Manager();
        m1.setFirstName("Jane");
        m1.setDepartment("IT Boss");
        m1.setLastName("Doe");
        m1.setSalary(3000);
        m1.setReportingEmployees(5);
        System.out.println(m1.getFirstName() + m1.getLastName() + m1.getDepartment() +m1.getSalary() + m1.getReportingEmployees());
    }
}
