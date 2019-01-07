/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day4;
import java.util.Scanner;
/**
 *
 * @author cb-vidhya
 */

abstract class Car
{
    Scanner scan=new Scanner(System.in);
    int speed;
    double regularPrice;
    String colour;
    public Car()
    {
        System.out.println();
        System.out.println("Enter the speed");
        speed=scan.nextInt();
        System.out.println("Enter the regular Price");
        regularPrice=scan.nextDouble();
        System.out.println("Enter the colour");
        scan.nextLine();
        colour=scan.nextLine();
    }
    abstract double getSalePrice();
}
class Truck extends Car
{
    int weight;
    double discount;
    public Truck()
    {
        
        System.out.println("Enter the weight for truck");
        weight=scan.nextInt();
        System.out.println("Name: Truck\nColour: "+super.colour+"\nSpeed: "+super.speed+"\nThe sale price of Truck is "+getSalePrice());
    }
    @Override
    double getSalePrice()
    {
        if(weight>2000)
            discount=regularPrice*0.10;
        else
            discount=regularPrice*0.20;
        return (regularPrice-discount);
    }
}
class Ford extends Car
{
    int year,manufacturerDiscount;
    public Ford()
    {
        System.out.println("Enter the year");
        year=scan.nextInt();
        System.out.println("Enter the manufacturer discount");
        manufacturerDiscount=scan.nextInt();
        System.out.println("Name: Ford\nColour: "+super.colour+"\nYear:"+year+"\nSpeed: "+super.speed+"\nThe sale price of Ford is "+getSalePrice());
    }
    @Override
    double getSalePrice()
    {
        return (regularPrice-manufacturerDiscount);
    }
}
class Sedan extends Car
{
    int length;
    double discount;
    public Sedan()
    {
        super();
        System.out.println("Enter the length");
        length=scan.nextInt();
        System.out.println("Name: Sedan\nColour: "+super.colour+"\nSpeed: "+super.speed+"\nThe sale price of Sedan is "+getSalePrice() );
    }
    @Override
    double getSalePrice()
    {
        if(length>20)
            discount=regularPrice*0.10;
        else
            discount=regularPrice*0.20;
        return (regularPrice-discount);
    }
}
public class CarsDemo {
    public static void main(String[] arg)
    {   
        System.out.println("Truck is executing...");
        Car car1=new Truck();
        System.out.println("Ford is executing...");
        Car car2=new Ford();
        System.out.println("Sedan is executing...");
        Car car3=new Sedan();
        //Truck t=new Truck();
    }
}
