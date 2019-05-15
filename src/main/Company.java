package main;

import java.util.Scanner;

public class Company
{
    public Employee[] obj ;
    String NameOfCompany;
    String Tasks;


    public Company()
    {
        obj = new Employee[100];
    }

    Company(String nameOfcompany, String task)
    {
        NameOfCompany = nameOfcompany;
        Tasks = task;
    }

    void inpCompany()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название компании: ");
        NameOfCompany = in.nextLine();
        System.out.print("Введите задачу компании: ");
        Tasks = in.nextLine();
    }

    public void addEmploee(int i)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя сотрудника: ");
        obj[i].SetEmpName(in.nextLine());
        System.out.print("Введите зарплату сотрудника: ");
        obj[i].SetEmpMoney(in.nextDouble());
    }


    public String GetNameOfCompany()
    {
        return NameOfCompany;
    }

    public String GetTasks()
    {
        return Tasks;
    }


}
