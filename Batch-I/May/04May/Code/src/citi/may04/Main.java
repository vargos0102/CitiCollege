package citi.may04;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person();
        p1.FirstName = "John";
        p1.Address = "Square One";
        p1.Country = "Canada";
        System.out.println(p1.DisplayName());
        System.out.println(p1.DisplayAddress());

        Person p2 = new Person();
        p2.FirstName = "Alex";
        p2.LastName = "Vargos";
        p2.Age = 45;
        p2.Country = "USA";
        System.out.println(p2.DisplayName());
        System.out.println(p2.DisplayAddress());

        Person p3 = new Person();
        p3.Age = 21;
        p3.LastName = "Husky";
        //System.out.println(p3.Age);
        //System.out.println(p3.LastName);
        //System.out.println(p3.Address);
        System.out.println(p3.DisplayName());
        System.out.println(p3.DisplayAddress());
    }
}
