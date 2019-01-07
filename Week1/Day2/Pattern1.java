/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day2;

/**
 *
 * @author santa claus
 */
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number  of rows");
        int input=scan.nextInt();
        if(input<=0)
        {
            System.out.print("The input should be a positive number");
            return;
        }
        int row,col,temp1,temp2,printVal;
        temp1=input-1;
        temp2=(2*temp1)+1;
        for(row=0;row<input;row++)
        {
            printVal=1;
            for(col=0;col<temp2;col++)
            {
                if(col>=temp1)
                {
                    System.out.print(printVal);
                    printVal=(col<(input-1))?(printVal+1):(printVal-1);
                    if(printVal==0)
                        break;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            temp1-=1;
            System.out.println();
        }
    }
}

