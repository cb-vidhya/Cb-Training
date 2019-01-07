/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day2;

/**
 *
 * @author cb-vidhya
 */
import java.util.Scanner;
public class Interest_calculation {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Principal amount");
        double principal=scan.nextDouble();
        System.out.println("Enter the no. of years");
        double years=scan.nextDouble();
        System.out.println("Enter the rate of interest");
        double rate=scan.nextDouble();
        if(principal==0 || years==0 || rate==0)
        {
            System.out.println("Principal,year and rate should be positive");
            return;
        }
        double simpleInterest=(principal*years*rate)/100;
        double compoundInterest=principal*(Math.pow(1+rate/100,years))-principal;
        System.out.println("Simple Interest is "+simpleInterest+"\nThe compound interest is "+compoundInterest);
    }
}
