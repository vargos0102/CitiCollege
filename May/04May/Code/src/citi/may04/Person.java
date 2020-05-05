package citi.may04;

public class Person {
    public String FirstName;
    public String LastName;
    public int Age;
    public String Address;
    public String Country;

    public Person()
    {
        LastName = "Cena";
        Age = 50;
        Address = "";
        Country = "Canada";
    }

    public String DisplayName()
    {
        if(Age > 0)
        {
            return FirstName + " " + LastName + ", "+ Age;
        }
        else
        {
            return FirstName + " "+ LastName;
        }
    }

    public String DisplayAddress()
    {
        if(Address != null && !Address.isEmpty())
        {
            return Address + ", "+ Country;
        }
        else
        {
            return  Country;
        }
    }
}
