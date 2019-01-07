/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author cb-vidhya
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.util.Scanner;
public class D3_Program4 {
    public static void main(String[] arg) throws FileNotFoundException,IOException
    {
        Scanner scan=new Scanner(System.in);
        BufferedReader reader=new BufferedReader(new FileReader("/Users/cb-vidhya/Sample/test.txt"));
        System.out.println("Enter the SearchTerm");
        String searchTerm=scan.nextLine();
        String fileName="/Users/cb-vidhya/Sample/"+searchTerm+".locations.txt";
        FileOutputStream outputStream=new FileOutputStream(fileName);
        String line=reader.readLine();
        int lineNo=1,index;
        while(line!=null)
        {
           if(line.contains(searchTerm))
            {
                outputStream.write(("\n<"+lineNo+"> :  ").getBytes());
                index=0;
                Scanner tempScan=new Scanner(line);
                while(tempScan.hasNext())
                {
                    //System.out.println("hello");
                    String temp=tempScan.next();
                    if(searchTerm.equals(temp))
                    {
                        byte[] strtoBytes=((index+1)+",").getBytes(); 
                        outputStream.write(strtoBytes);
                    }
                    index+= temp.length()+1;
                }
            }
            line=reader.readLine();
            ++lineNo;
        }
    }
}
