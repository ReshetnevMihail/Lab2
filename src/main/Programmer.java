package main;

public class Programmer extends Employee
{
    Programmer(String Name, double Money)
    {
        name = Name;
        money = Money;
    }

    void Work()
    {
        System.out.println("writing code...");
    }


}
