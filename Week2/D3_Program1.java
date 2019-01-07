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
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class D3_Program1    {
    static HashMap<String,Integer> listAll(HashMap<String,Integer> map,File currentDirectory) throws IOException
    {
        File[] files=currentDirectory.listFiles();
        for(File file:files)
        {
            if(file.isDirectory())
            {
                map=(HashMap<String,Integer>)(listAll(map,file)).clone();
            }
            else
            {
                String fileName=file.getName();
                //System.out.println(fileName);
                int index=fileName.lastIndexOf(".");
                //FilenameUtils.getExtension(fileName);
                String extension=fileName.substring(index+1);
                if(map.containsKey(extension))
                {
                    int value=map.get(extension);
                    map.put(extension, value+1);
                }
                else
                {
                    map.put(extension,1);
                }
            }
        }
        return map;
    }
    public static void main(String[] args)
    {
        try
        {
            HashMap<String,Integer> map=new HashMap<>();
            File currentDirectory=new File(".");
            map=(HashMap<String,Integer>)listAll(map,currentDirectory).clone();
            for(Map.Entry<String,Integer> e:map.entrySet())
            {
                System.out.print("Extension: "+e.getKey()+" - "+e.getValue()+"\n");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
   
}
