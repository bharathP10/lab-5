/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.Scanner;

/**
 *
 * @author BHARATH sharan
 */
public class pac2 {
     public void print2()
    {
        System.out.println("Accessing PACKAGE 2");
         System.out.println("ADDITION of TWO number in package 2");
          System.out.println("enter two numbers and b");
       Scanner ab =new Scanner(System.in);
       int a=ab.nextInt();
       int b=ab.nextInt();
       int add=a+b;
        System.out.println("addition of a"+a+"and b "+b+"is"+add);
    }
}
