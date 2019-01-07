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
import java.nio.file.Files;
public class D3_Program2 {
    static void copyFiles(File sourceDirectory,File destDirectory) throws IOException
    {
        File[] files=sourceDirectory.listFiles();
        for(File current:files)
        {
            if(current.isDirectory())
            {
               //System.out.println(current);
                copyFiles(current,destDirectory);
            }
            else
            {
                File source=new File(""+current);
                File temp=new File("/Users/cb-vidhya/Sample/"+current.getName());
                boolean fileExists=temp.exists();
                String destName=current.getName();
                int version=1,index=destName.lastIndexOf(".");
                String original=destName.substring(0,index);
                String extension=destName.substring(index);
                while(fileExists)
                {
                   destName=original+"-"+version+extension;
                   temp=new File("/Users/cb-vidhya/Sample/"+destName);
                   fileExists=temp.exists();
                   ++version;
                }
                File dest=new File("/Users/cb-vidhya/Sample/"+destName);
                Files.copy(source.toPath(), dest.toPath());
            }
        }
    }
    public static void main(String[] args)
    {
        try
        {
            File sourceDirectory=new File("/Users/cb-vidhya/Sample/Source");  
            File destDirectory=new File("/Users/cb-vidhya/Sample");
            copyFiles(sourceDirectory,destDirectory);
            System.out.println("Files are copied successfully");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
