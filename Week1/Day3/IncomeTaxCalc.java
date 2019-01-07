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
class TaxCalc
{
    static String name;
    static char gender;
    static int taxableIncome;
    TaxCalc(String name,char gender,int taxableIncome)
    {
        this.name=name;
        this.gender=gender;
        this.taxableIncome=taxableIncome;
    }
    static void calc()
    {
        double tax;
        if(gender=='M')
        {
            tax=(taxableIncome*0.20);
        }
        else
        {
            tax=(taxableIncome*0.10);
        }
        System.out.println("Name: "+name+" Gender: "+gender+" Taxable Income: "+taxableIncome+" Tax: "+tax);
    }
}
public class IncomeTaxCalc {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char choice;
        ArrayList<TaxCalc> list=new ArrayList<TaxCalc>();
        System.out.println("Enter the name");
        String name=scan.nextLine();
        System.out.println("Enter the gender(F/M)");
        char gender=scan.next().charAt(0);
        scan.nextLine();
        System.out.println("Enter the taxable income");
        int taxableIncome=scan.nextInt();
        TaxCalc object=new TaxCalc(name,gender,taxableIncome);
        object.calc();
    }
}
