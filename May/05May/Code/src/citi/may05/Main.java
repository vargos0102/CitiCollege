package citi.may05;
import Excercise.Student;
import citi.may06.Employee;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.println("Enter a name..");
        e1.Name = scanner.nextLine();

        System.out.println("Enter a designation..");
        e1.Designation = scanner.nextLine();

        System.out.println("Enter an Email Address..");
        e1.EmailAddress = scanner.nextLine();

        int year;
        do {
            System.out.println("Enter Year of Birth");
            year = scanner.nextInt();
        } while (year < 1900 || year > LocalDate.now().getYear());

        int month;
        do {
            System.out.println("Enter Month of Birth");
            month = scanner.nextInt();
        } while (month < 1 || month > 12 );

        int day;
        do {
            System.out.println("Enter Day of Birth");
            day = scanner.nextInt();
        } while (day<1 || day> 31);

        e1.DateOfBirth = LocalDate.of(year,month,day);

        System.out.println(e1.DisplayEmployeeInfo());
        System.out.println(e1.DisplayAge());

//        Student s1 = new Student();
//        s1.RollNumber = 501;
//        s1.Name = "Kane";
//        System.out.println(s1.DisplayInfo());

    }
}
