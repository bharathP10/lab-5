/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author BHARATH sharan
 */
  import java.util.Scanner;
public class book1 {
  

  int id;
  int i;
  int flag=1;
 public int check()
 {
      for(i=0;i<2;i++)
      {
        switch(id)
        {
            case 100:
            {
                  System.out.println("Book is found:");
                  return flag=1;
            }
              
            case 101:
              {
                  System.out.println("Book is found");
                  return flag=1;
              }
          
            
        }
      }
     return flag=0;
 }
    
}
