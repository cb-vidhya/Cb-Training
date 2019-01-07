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
public class Fibonacci_series {
 public static void main(String[] arg)
 {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number of terms in the series");
     int N=scan.nextInt();
     if(N<=0)//basic condition
     {
         System.out.println("The number of terms should be positive");
         return;
     }
     int first=0,second=1,itr,sum;
     System.out.println("The fibonacci series is...");
     for(itr=1;itr<=N;itr++)
     {
         System.out.print(first+" ");
         sum=first+second;
         first=second;
         second=sum;
     }
 }
}
