package com.mycompany.trycatch1;
import java.util.Scanner;
public class TryCatch1 
{
    public static void main(String[] args) 
    {
        Scanner nn=new Scanner(System.in);
        int a,b,z;
        System.out.print("Enter the first number :");
        a=nn.nextInt();
        System.out.print("Enter the second number :");
        b=nn.nextInt();
        
        try
        {
            z=a/b;
            System.out.println("Aswer is :"+z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cann't divided by Zero");
        }
    }
}
