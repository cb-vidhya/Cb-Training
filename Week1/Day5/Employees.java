/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day5;

/**
 *
 * @author cb-vidhya
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee
{
    String name;
    double salary;
    int age;
    Employee(){}
    Employee(String name,double salary,int age)
    {
        this.name=name;
        this.salary=salary;
        this.age=age;
    }
    //anonymous implementation for sorting by name
    Comparator<Employee> sortByName=new Comparator<Employee>()
    {
        @Override
       public int compare(Employee e1,Employee e2)
       {
           return e1.name.compareTo(e2.name);
       }
    };
    public void sortByName(ArrayList<Employee> list)
    {
        Collections.sort(list,sortByName);
        for(Employee e:list)
        {
            System.out.println(e.name+" "+e.salary+" "+e.age);
        }
    }
    // anonymous implementation  for sorting by age
    Comparator<Employee> sortByAge=new Comparator<Employee>()
    {
        @Override
       public int compare(Employee e1,Employee e2)
       {
           return e1.age-e2.age;
       }
    };
    public void sortByAge(ArrayList<Employee> list)
    {
        Collections.sort(list,sortByAge);
        for(Employee e:list)
        {
            System.out.println(e.name+" "+e.salary+" "+e.age);
        }
    }
    // anonymous implementation  for sorting by salary
    Comparator<Employee> sortBySalary=new Comparator<Employee>()
    {
        @Override
       public int compare(Employee e1,Employee e2)
       {
           return e1.age-e2.age;
       }
    };
    public void sortBySalary(ArrayList<Employee> list)
    {
        Collections.sort(list,sortByAge);
        for(Employee e:list)
        {
            System.out.println(e.name+" "+e.salary+" "+e.age);
        }
    }
}
public class Employees {
   public static void main(String[] arg)
   {
       String name;
       int age;
       double salary;
       char choice;
       ArrayList<Employee> list=new ArrayList<Employee>();
       Scanner scan=new Scanner(System.in);
       do
       {
            System.out.println("Enter the name of the employee");
            name=scan.nextLine();
            System.out.println("Enter the salary");
            salary=scan.nextDouble();
            System.out.println("Enter the age");
            age=scan.nextInt();
            list.add(new Employee(name,salary,age));
            System.out.println("Do you want to create more employees? (Y/N)");
            choice=scan.next().charAt(0);
            scan.nextLine();
       }while(choice=='Y');
       Employee obj=new Employee();
       System.out.println("Do you want to sort by Name-0 Age-1 or Salary-2?\nEnter your choice");
       int sortChoice=scan.nextInt();
       switch(sortChoice)
       {
           case 0:
               obj.sortByName(list);
               break;
           case 1:
               obj.sortByAge(list);
               break;
           case 2:
               obj.sortBySalary(list);
       }
       
    }
}
