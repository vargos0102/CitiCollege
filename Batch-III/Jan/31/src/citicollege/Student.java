package citicollege;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    String StudentId;
    String StudentName;
    String StudentCourse;
    LocalDate StartDate;




    public Student() {
        StudentId = "1";
        StudentName = "John Doe";
        StudentCourse = "EBDE";
        long millis = System.currentTimeMillis();
        StartDate = LocalDate.now();
    }
    public Student(String Id, String Name, String course, String beginDate) {
        StudentId = Id;
        StudentName = Name;
        StudentCourse = course;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        StartDate = LocalDate.parse(beginDate, formatter);;
    }
    public void PrintStudentDetails() {
    System.out.println("Id: " +StudentId+ ", Name: "+StudentName+", Course:"+
            StudentCourse+", StartDate:"+ StartDate);
    }
}
