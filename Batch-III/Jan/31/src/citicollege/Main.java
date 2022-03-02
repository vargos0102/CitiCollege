package citicollege;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student s = new Student();
        s.PrintStudentDetails();

        Student s1 = new Student("2","Jane","EBDE", "12/12/2021");
        s1.PrintStudentDetails();
    }
}
