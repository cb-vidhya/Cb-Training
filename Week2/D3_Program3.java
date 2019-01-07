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
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
public class D3_Program3 {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File file=new File("/Users/cb-vidhya/Sample/test.txt");
        Scanner scan=new Scanner(file);
        Map<String,Integer> map=new TreeMap<>();
        while(scan.hasNext())
        {
            String word=scan.next();
            if(map.containsKey(word))
                map.put(word, map.get(word)+1);
            else
                map.put(word,1);
        }
        FileOutputStream outputStream = new FileOutputStream("/Users/cb-vidhya/Sample/testOutput.txt");
        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            byte[] strToBytes =(e.getKey()+" - "+e.getValue()+"\n").getBytes();
            outputStream.write(strToBytes);
        }
        outputStream.close();
    }
}
