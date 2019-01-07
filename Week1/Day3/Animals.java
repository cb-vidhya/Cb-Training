/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day3;

/**
 *
 * @author cb-vidhya
 */
import java.util.Scanner;
import java.util.ArrayList;
class Animal
{
    String name;
    String colour;
    public Animal(String name,String colour)
    {
        this.name=name;
        this.colour=colour;
    }
}
public class Animals {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String name,colour;
        ArrayList<Animal> animals=new ArrayList<Animal>();
        int count=1;
        char choice;
        do
        {
           System.out.println("Enter the name of the animal");
           name=scan.nextLine();
           System.out.println("Enter the colour of the animal");
           colour=scan.nextLine();
           animals.add(new Animal(name,colour));
           System.out.println("The number of animals created is: "+(count));
           ++count;
           System.out.println("Do you want to create more animals(Y/N)"); 
           choice=scan.next().charAt(0);
           scan.nextLine();
        }while(choice=='Y');
       
    }
}
