package main;

import java.util.Scanner;

public class Director extends Employee
{
    Director(String Name, double Money)
    {
        name = Name;
        money = Money;
    }

    void CompanyManagement(int i)
    {
        Company objofcompany = new Company();

            int j;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер сотрудника: ");
            j = in.nextInt();
            objofcompany.addEmploee(j);


    }


}
