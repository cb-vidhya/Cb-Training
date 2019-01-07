/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week2;

/**
 *
 * @author cb-vidhya
 */
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
class Persons
{
    public final String name;
    public final String address;
    public ArrayList<MobileNumbers> mobileNos;
    Persons(String name,String address,ArrayList<MobileNumbers> mobileNos)
    {
        this.name=name;
        this.address=address;
        this.mobileNos=new ArrayList<>();
        this.mobileNos=(ArrayList<MobileNumbers>) mobileNos.clone();
    }
}
class MobileNumbers
{
    public final String mobileNo;
    public final char tag;
    MobileNumbers(String mobileNo,char tag)
    {
        this.mobileNo=mobileNo;
        this.tag=tag;
    }
}
class Display
{
    ArrayList<Persons> persons=new ArrayList<Persons>();
    Display(ArrayList<Persons> persons)
    {
        this.persons=(ArrayList<Persons>)persons.clone();
        Scanner scan=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Enter your choice\nSearch by Name - 1\nSearch by Partial match - 2\nSearch by mobile No - 3\nExit -4");
            choice=scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the name u want to search");
                    String searchName=scan.nextLine();
                    SearchByName(searchName);
                    break;
                case 2:
                    System.out.println("Enter the prefix u want to search");
                    String searchPrefix=scan.nextLine();
                    SearchByPartialMatch(searchPrefix);
                    break;
                case 3:
                    System.out.println("Enter the mobile no u want to search");
                    String searchNo=scan.nextLine();
                    SearchByMobileNo(searchNo);
                    break;
                case 4:
                    break;
            }
        }while(choice!=4);
    }
    private void toDisplay(Persons p)
    {
        System.out.println("Name: "+p.name+"\nAddress: "+p.address);
        for(MobileNumbers m:p.mobileNos)
        {
            System.out.println("MobileNo: "+m.mobileNo+"\nTag: "+m.tag);
        }
    }
    private void SearchByName(String searchName)
    {
        for(Persons p:persons)
        {
            if(p.name.equals(searchName))
            {
                toDisplay(p);
            }
        }
    }
    private void SearchByPartialMatch(String searchPrefix)
    {
        for(Persons p:persons)
        {
            if((p.name).length()>=searchPrefix.length())
            {
                String sub=(p.name).substring(0,searchPrefix.length());
                if(sub.equals(searchPrefix))
                {
                    toDisplay(p);
                }
            }
        }
    }
    private void SearchByMobileNo(String searchNo)
    {
        for(Persons p:persons)
        {
            for(MobileNumbers m:p.mobileNos)
            {
                if(m.mobileNo.equals(searchNo))
                {
                   toDisplay(p);
                }
            }
        }
    }
}
public class D1_Program3 {
    static Scanner scan=new Scanner(System.in);  
    public static void main(String[] args)
    {
        ArrayList<Persons> persons=new ArrayList<>();
        char choice1,choice2;
        do
        {
            int temp=0;
            System.out.println("Enter the name");
            String name=scan.nextLine();
            System.out.println("Enter the address");
            String address=scan.nextLine();
            ArrayList<MobileNumbers> mobileNos=new ArrayList<>();
            do
            {
                System.out.println("Enter the MobileNumber");
                String mobileNo=scan.nextLine();
                System.out.println("Enter the tag");
                char tag=scan.next().charAt(0);
                scan.nextLine();
                mobileNos.add(new MobileNumbers(mobileNo,tag));
                System.out.println("Do u need to add another number?(Y/N)");
                choice1=scan.next().charAt(0);
                scan.nextLine();
                
            }while(choice1=='Y');
            persons.add(new Persons(name,address,mobileNos));
            System.out.println("Do u want to create more employees?(Y/N)");
            choice2=scan.next().charAt(0);
            scan.nextLine();
        }while(choice2=='Y');
        new Display(persons);
    }
}
