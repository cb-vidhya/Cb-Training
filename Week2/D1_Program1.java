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
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class D1_Program1 {
    static void createMap(String[] words,int count)
    {
        List<String>  list;
        Map<Integer,List<String>> map=new HashMap<Integer,List<String>>();
        int temp,wordLength;
        for(temp=0;temp<count;temp++)
        {
            wordLength=words[temp].length();
            if(map.containsKey(wordLength))
            {
                list=new ArrayList(map.get(wordLength));
                list.add(words[temp]);
                map.put(wordLength, list);
            }
            else
            {
                list=new ArrayList();
                list.add(words[temp]);
                map.put(wordLength,list);
            }
        }
        for(Map.Entry<Integer,List<String>> e:map.entrySet())
        {
            System.out.println("Word length: "+e.getKey());
            list=new ArrayList(e.getValue());
            for(String s:list)
            {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int temp;
        System.out.println("How many words do u want to enter?");
        int count=scan.nextInt();
        scan.nextLine();
        String[] words=new String[count];
        System.out.println("Enter the words");
        for(temp=0;temp<count;temp++)
        {
            words[temp]=scan.nextLine();
        }
        createMap(words,count);
    }
}

