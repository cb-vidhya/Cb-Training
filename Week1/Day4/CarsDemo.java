/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day4;
/**
 *
 * @author cb-vidhya
 */
import java.util.Scanner;
abstract class Car
{
    protected int speed;
    protected double regularPrice;
    protected String colour;
    public Car(int speed,double regularPrice,String colour)
    {
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.colour=colour;
    }
    abstract double getSalePrice();
}
class Truck extends Car
{
    private int weight;
    private double discount;
    public Truck(int speed,double regularPrice,String colour,int weight)
    {
        super(speed,regularPrice,colour);
        this.weight=weight;
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
    private int year;
    private double manufacturerDiscount;
    public Ford(int speed,double regularPrice,String colour,int year,double manufacturerDiscount)
    {
        super(speed,regularPrice,colour);
        this.manufacturerDiscount=manufacturerDiscount;
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
    private int length;
    private double discount;
    public Sedan(int speed,double regularPrice,String colour,int length)
    {
        super(speed,regularPrice,colour);
        this.length=length;
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
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the speed");
        int speed=scan.nextInt();
        System.out.println("Enter the regular Price");
        double regularPrice=scan.nextDouble();
        System.out.println("Enter the colour");
        scan.nextLine();
        String colour=scan.nextLine();
        System.out.println("Truck is executing...");
        System.out.println("Enter the weight for truck");
        int weight=scan.nextInt();
        Car car1=new Truck(speed,regularPrice,colour,weight);
        System.out.println("\nFord is executing...");
        System.out.println("Enter the year");
        int year=scan.nextInt();
        System.out.println("Enter the manufacturer discount");
        double manufacturerDiscount=scan.nextInt();
        Car car2=new Ford(speed,regularPrice,colour,year,manufacturerDiscount);
        System.out.println("\nSedan is executing...");
        System.out.println("Enter the length");
        int length=scan.nextInt();
        Car car3=new Sedan(speed,regularPrice,colour,length);
    }
}
