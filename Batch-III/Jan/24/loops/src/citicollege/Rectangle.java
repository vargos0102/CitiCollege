package citicollege;

abstract class Rectangle {

    protected int x;
    protected int y;

    protected void calculateArea(int length, int breath) {
        System.out.println("The area of reactangle is: " + (length * breath));
    }

    abstract void calculate()


}
