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
abstract class Mobile
{
    String name;
    int remainingCharge;
    public Mobile(String name,int remainingCharge)
    {
        this.name=name;
        this.remainingCharge=remainingCharge;
    }
    abstract public void name();
    abstract public void remainingCharge();
}
public class Mobiles {
    public static void main(String[] args)
    {
        
        Mobile mobile1=new Mobile("Mobile1",10)
        {
            @Override
            public void name()
            {
                System.out.println("Name: "+name);
            }
            @Override
            public void remainingCharge()
            {
                System.out.println("The remaining charge is "+remainingCharge);
            }
        };
        mobile1.name();
        mobile1.remainingCharge();
        Mobile mobile2=new Mobile("Mobile2",20)
        {
            @Override
            public void name()
            {
                System.out.println("Name: "+name);
            }
            @Override
            public void remainingCharge()
            {
                System.out.println("The remaining charge is "+remainingCharge);
            }
        };
        mobile2.name();
        mobile2.remainingCharge();
    }
}
