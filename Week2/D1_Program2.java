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
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public class D1_Program2 {
        static void createMap(String[] words,int count)
    {
        List<String>  list;
        Map<String,List<String>> map=new TreeMap<String,List<String>>();
        int temp;
        String prefix=new String();
        for(temp=0;temp<count;temp++)
        {
            prefix=words[temp].substring(0, 3);
            if(map.containsKey(prefix))
            {
                list=new ArrayList(map.get(prefix));
                list.add(words[temp]);
                map.put(prefix, list);
            }
            else
            {
                list=new ArrayList();
                list.add(words[temp]);
                map.put(prefix,list);
            }
        }
        for(Map.Entry<String,List<String>> e:map.entrySet())
        {
            System.out.println("Prefix: "+e.getKey());
            list=new ArrayList(e.getValue());
            Collections.sort(list);
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
        String word=new String();
        for(temp=0;temp<count;temp++)
        {
            word=scan.nextLine();
            if(word.length()<3)
            {
                System.out.println("The word must contain atleast 3 characters");
                temp-=1;
            }
            else
                words[temp]=word;
        }
        createMap(words,count);
    }
}
