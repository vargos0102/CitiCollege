package citi.may11;

// Modifiers
// private: It can only be accessed only in the same class.
// public: It can be accessed inside or outside class.
// protected: It can be accessed within same package and subclasses.

final class Person {
    protected String Name = "John Doe";
    protected String Address="Mississagua, Canada";

    public void DisplayNameAddress()
    {
        System.out.println(Name +", "+Address);
    }
}
