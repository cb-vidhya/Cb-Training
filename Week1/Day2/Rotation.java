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
public class Rotation {
    static void rotateLeft(int row,int col,int[][] matrix)
    {
        int currRow,currCol;
        for(currCol=col-1;currCol>=0;currCol--)
        {
            for(currRow=0;currRow<row;currRow++)
                System.out.print(matrix[currRow][currCol]+" ");
            System.out.println();
        }
    }
    static void rotateRight(int row,int col,int[][] matrix)
    {
        int currRow,currCol;
        for(currCol=0;currCol<col;currCol++)
        {
            for(currRow=row-1;currRow>=0;currRow--)
                System.out.print(matrix[currRow][currCol]+" ");
            System.out.println();
        }
    }
 public static void main(String[] arg)
 {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number of rows");
     int row=scan.nextInt();
     System.out.println("Enter the number of columns");
     int col=scan.nextInt();
     if(row<=0 || col<=0)
     {
         System.out.println("The number of rows and cols must be positive");
         return;
     }
     System.out.println("Enter the elements");
     int matrix[][]=new int[row][col];
     int currRow,currCol;
     for(currRow=0;currRow<row;currRow++)
     {
         for(currCol=0;currCol<col;currCol++)
         {
             matrix[currRow][currCol]=scan.nextInt();
         }
     }
     System.out.println("Do you want to rotate left or right(L/R)?");
     char c=scan.next().charAt(0);
     if(c=='L')
         rotateLeft(row,col,matrix);
     else
         rotateRight(row,col,matrix);
 }
}
