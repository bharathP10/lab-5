/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author BHARATH sharan
 */
import java.util.Scanner;
public class book2 {
     int id;
  int flag=2;
 
  public int check2()
  {
     
           if(id==200)
                {
                         System.out.println("Journal book id is found");
                         return flag=2;
                }
           else  if(id==201)
                {
                         System.out.println("Journal book id is found");
                         return flag=2;
                }
           else
           {
               System.out.println("Journal book is not found");
               return flag=0;       
           }
            
      }
}
