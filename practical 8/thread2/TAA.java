package com.mycompany.thread2;
public class TAA extends Thread
{
    public TAA()
    {
        super();
    }
    
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            System.out.println(i);
        }
    }
    
}
