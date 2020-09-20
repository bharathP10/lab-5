/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author BHARATH sharan
 */
public class pac1 {
     public void print()
     {
         System.out.println("Accessing PACKAGE 1");
         System.out.println("SWAPPING of TWO number in package 1");
          int a,b,temp;
        System.out.println("Enter the two numbers");
        Scanner obj=new Scanner(System.in);
        a= obj.nextInt();
        b= obj.nextInt();
        System.out.println(" the two numbers before swapping a= "+a);
        System.out.println("b="+b);
        
        temp=a;
        a=b;
        b=temp;
        
        System.out.println("the two numbers after swapping  are a="+a);
        System.out.println("b="+b);
        
     }
    
}
