package cb.Week1.Day4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cb-vidhya
 */
import java.util.Scanner;
import java.util.ArrayList;
class Person
{
    String name,contactNo;
    int age;
}
class Employee extends Person
{
    public int empId;
    public String type;
    Employee(String name,String contactNo,int age,int  empId,String type)
    {
        this.name=name;
        this.contactNo=contactNo;
        this.age=age;
        this.empId=empId;
        this.type=type.toLowerCase();
    }
}
class Customer extends Person
{
    ArrayList<Vehicle> vehicleList=new ArrayList<Vehicle>();
    Customer(String name,String contactNo,int age,ArrayList<Vehicle> vehicleList)
    {
        this.name=name;
        this.contactNo=contactNo;
        this.age=age;
        this.vehicleList=(ArrayList<Vehicle>) vehicleList.clone();
    }
}
class Vehicle
{
    public String brand,colour,name;
    public double serviceCharge;
    int assignedEmp;
    Vehicle(String name,String brand,String colour,ArrayList<Employee> empList)
    {
        this.brand=brand;
        this.colour=colour;
        this.name=name;
        switch(name.toLowerCase())
        {
            case "car"://car
                serviceCharge=1000;
                break;
            case "bike"://bike
                serviceCharge=750;
                break;
            case "bus"://bus
                serviceCharge=1500;
        }
        this.assignedEmp=assignEmployee(empList);
    }
    int assignEmployee(ArrayList<Employee> empList)
    {
        for(Employee e:empList)
        {
            if(e.type.equals(name))
            {
               return e.empId;
            }
        }
        return 0;
    }
}

class ServiceStation
{
    String name,address,contact;
    ServiceStation(String name,String address,String contact)
    {
        this.name=name;
        this.address=address;
        this.contact=contact;
    }
    //ArrayList<Employee> empList=new ArrayList<Employee>();
    //ArrayList<Customer> custList=new ArrayList<Customer>();
    void invoice(ArrayList<Customer> custList)
    {
        double total=0.0;
        System.out.print("\nName: "+name+"\nAddress: "+address+"\nContact: "+contact);
        for(Customer c:custList)
        {
            System.out.print("\nName of the owner: "+c.name);
            for(Vehicle v:c.vehicleList)
            {
                System.out.print("\nVehicle: "+v.name);
                if(v.assignedEmp==0)
                    System.out.print("\nNo employee assigned yet");
                else
                {
                    System.out.print("\nService charge: "+v.serviceCharge+"\nEmployee assigned: "+v.assignedEmp);
                    total+=v.serviceCharge;
                }
            }
        }
        System.out.print("\nTotal amount: "+total);
        
    }
}
public class ServiceStations {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of service station");
        String name=scan.nextLine();
        System.out.println("Enter the address");
        String address=scan.nextLine();
        System.out.println("Enter the contact");
        String contact=scan.nextLine();
        System.out.println("Enter the employee details");
        ArrayList<Employee> empList=new ArrayList<>();  
        ArrayList<Customer> custList=new ArrayList<>();
        char choice;
        do//Input for employees
        {
            System.out.println("Enter the employee name");
            String eName=scan.nextLine();
            System.out.println("Enter the contact no");
            String eContactNo=scan.nextLine();
            System.out.println("Enter the age");
            int eAge=scan.nextInt();
            System.out.println("Enter the emp id");
            int empId=scan.nextInt();
            scan.nextLine();
            System.out.println("Enter his category (bus/bike/car)");
            String type=scan.nextLine();
            empList.add(new Employee(eName,eContactNo,eAge,empId,type));
            System.out.println("Do you want to add more employees?(Y/N)");
            choice=scan.next().charAt(0);
            scan.nextLine();
        }while(choice=='Y');
        do//Input for customers
        {
            System.out.println("Enter the Customer name");
            String cName=scan.nextLine();
            System.out.println("Enter the contact no");
            String cContactNo=scan.nextLine();
            System.out.println("Enter the age");
            int cAge=scan.nextInt();
            scan.nextLine();
            String vName,brand,colour;
            char vChoice;
            ArrayList<Vehicle> vehicleList=new ArrayList<Vehicle>();
            do//Input for customer's vehicle
            {
                System.out.println("Enter the vehicle name(bus/bike/car)");
                vName=scan.nextLine();
                System.out.println("Enter the brand");
                brand=scan.nextLine();
                System.out.println("Enter the colour");
                colour=scan.nextLine();
                vehicleList.add(new Vehicle(vName,brand,colour,empList));
                System.out.println("Do you want to add more vehicles?(Y/N)");
                vChoice=scan.next().charAt(0);
                scan.nextLine();        
            }while(vChoice=='Y');
            System.out.println("Do you want to add more Customers?(Y/N)");
            custList.add(new Customer(cName,cContactNo,cAge,vehicleList));
            choice=scan.next().charAt(0);
            scan.nextLine();
        }while(choice=='Y');
        
        ServiceStation s=new ServiceStation(name,address,contact);
        s.invoice(custList);
    }
}
