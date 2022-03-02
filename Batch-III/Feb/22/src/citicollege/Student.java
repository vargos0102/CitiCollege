package citicollege;

public class Student extends Person {
    private int marks;

    public void setMarks(Integer newMarks){
        marks = newMarks;
    }

    public int getMarks(){
        return marks;
    }

    public void printDetails() {
        System.out.println("Student:" +marks);
    }
}
