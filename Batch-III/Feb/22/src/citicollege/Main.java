package citicollege;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Person p1 = new Person();
      p1.setName("John Doe");

      Student s1 = new Student();
      s1.setMarks(94);

      Employee e1 = new Employee();
      e1.setSalary(2000);

      p1.printDetails();
      s1.printDetails();
      e1.printDetails();

      Person p2 = new Person();
      Person s2 = new Student();
      Person e2 = new Employee();

      p2.printDetails();
      s2.printDetails();
      e2.printDetails();

    }
}
