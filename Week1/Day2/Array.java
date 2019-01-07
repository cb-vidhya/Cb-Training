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
public class Array {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int size=scan.nextInt();
        if(size<=1)
        {
            System.out.println("The array size should be greater than or equal to 2");
            return;
        }
        int[] array=new int[size];
        System.out.println("Enter the elements");
        int temp=0;
        for(temp=0;temp<size;temp++)
            array[temp]=scan.nextInt();
        int smallest=array[0];
        int largest=array[0];
        for(temp=0;temp<size;temp++)
        {
            if(largest<array[temp])
                largest=array[temp];
            else if(smallest>array[temp])
                smallest=array[temp];
        }
        System.out.println("The largest number is: "+largest+"\nThe smallest number is: "+smallest);
    }
}
