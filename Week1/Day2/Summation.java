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
public class Summation {
   public static void main(String[] arg)
   {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the  string");
       String str=scan.nextLine();
       int length=str.length(),sum=0,itr;
       char c;
       for(itr=0;itr<length;itr++)
       {
           c=str.charAt(itr);
           if(Character.isLetter(c))
               sum+=c;
       }
       if(sum==0)
       {
           System.out.println("Please enter alphabets");
           return;
       }
       if(sum%2==0)
           System.out.println("even");
       else
           System.out.println("odd");
   }
}
