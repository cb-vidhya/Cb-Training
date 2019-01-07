/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb.Week1.Day5;

/**
 *
 * @author cb-vidhya
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;
class Factorial implements Iterable<String>
{
    static int count;
    int lowerLimit,upperLimit;
    ArrayList<String> factList=new ArrayList<String>();
    Factorial(ArrayList list)
    {
        factList=(ArrayList)list.clone();
    }
    Factorial(int lowerLimit,int upperLimit)
    {
        this.lowerLimit=lowerLimit;
        this.upperLimit=upperLimit;
    }
    @Override
    public Iterator<String> iterator()
    {
        return new Inner(factList);
    }
        class Inner implements Iterator<String>
        {
            ArrayList<String> factList=new ArrayList<String>();
            Inner(ArrayList<String> list)
            {
                this.factList=list;
            }
            @Override
            public boolean hasNext()
            {
                if(count<factList.size())
                return true;
                else
                    return false;
            }
            @Override
            public String next()
            {
                if(count>factList.size())
                    throw new NoSuchElementException();
                else
                {
                    count++;
                    return factList.get(count-1);
                }
                
            }
            @Override
            public void remove()
            {
                throw new UnsupportedOperationException();
            }
        }
    public ArrayList<String> fact(ArrayList<String> list)
    {
        int currVal=1,fact=1;
        while(fact<=lowerLimit)
        {
           fact=fact*currVal;
           ++currVal;
        }
        while(fact<=upperLimit)
        {
            list.add(Integer.toString(fact));
            fact=fact*currVal;
            ++currVal;
        }
        Factorial obj=new Factorial(list);
        System.out.println("The factorial between "+lowerLimit+" and "+upperLimit+" is ");
        for(String s:obj)
        {
            System.out.print(s+" ");
        }
        return list;
    }
    public String toString(ArrayList<String> list)
    {
        String result="\"";
        for(String s:list)
        {
            System.out.print(s+" ");
        }
        return result+"\"";
    }
    
}
public class FactorialDemo {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int lowerLimit=scan.nextInt();
        System.out.println("Enter the upper limit");
        int upperLimit=scan.nextInt();
        ArrayList<String> list=new ArrayList<String>();
        Factorial object=new Factorial(lowerLimit,upperLimit);
        list=(ArrayList<String>) (object.fact(list)).clone();
        String result=object.toString(list);
        System.out.print(list.get(0)+"\nThe String format is "+result);
    }
}
