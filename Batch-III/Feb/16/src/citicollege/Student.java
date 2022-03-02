package citicollege;

public class Student {
    String Name;
    String CourseName;
    String Address;
    int Id;
    boolean InClassTraining;

    public Student(){

    }

    public Student(String name, String courseName, String address, int id, boolean inClassTraining) {
        Name = name;
        CourseName = courseName;
        Address = address;
        Id = id;
        InClassTraining = inClassTraining;
    }

    void PrintDetails(){
        System.out.println(Name + " " + CourseName +" "+ Address+ " "+ Id + " " + InClassTraining);
    }

    public void PrintHobby(String hobbyName) {
        System.out.println(hobbyName);
    }

    public void PrintAge(int age) {
        System.out.println(age);
    }

    public void Greetings(String initial, String course) {
        System.out.println("Hello "+initial+"! Welcome to "+ course);
    }
}
