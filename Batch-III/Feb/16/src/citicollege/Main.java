package citicollege;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student s1 = new Student();
        s1.Name = "John";
        s1.CourseName ="EBDE";
        s1.Address = "Toronto";
        s1.PrintDetails();
        s1.PrintHobby("Playing instrument");
        s1.Greetings("Sir", "EBDE");

        Student s2 = new Student();
        s2.Name = "Kelly";
        s2.CourseName = "Marketing";
        s2.Address = "Mississauga";
        s2.PrintDetails();
        s2.PrintHobby("Dancing");
        s2.PrintAge(22);
        s2.Greetings("Mam", "Marketing");

        Student s3 = new Student("Jane","EBDE","Toronto",201,true);
        s3.PrintDetails();
    }
}
