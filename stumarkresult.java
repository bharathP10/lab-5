/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author BHARATH sharan
 */
import java.util.Scanner;
public class stumarkresult {
     public static void main(String[] args) {
       
        mark obj=new mark();
        obj.getdetails();
        obj.display();
        System.out.println("The average mark is:"+obj.average);
        results obj1=new results();
        obj1.calculateavg( obj.average);
}
}
class student
{
    String name;
    int rollno;
    
    
}
class mark extends student
    {
         int m1,m2,m3;
         double average;
void getdetails()
    {
         Scanner obj=new Scanner (System.in);
         System.out.println("ENTER Student NAME :");             
         name=obj.next();
         System.out.println("Enter the STUDENT roll number:");  
         rollno=obj.nextInt();
         System.out.println("Enter the MARKS:");
        m1=obj.nextInt();
        m2=obj.nextInt();
        m3=obj.nextInt();
        
    }
    double  display()
    {
         System.out.println(" STUDENT NAME:"+name);
         System.out.println("ROLL NUMBER:"+rollno);
         System.out.println("MARKS:"+m1);
         System.out.println(+m2);
         System.out.println(+m3);
         average=(m1+m2+m3)/3;
         
         return average;
    }
}
         
    
 class results extends student
        {
        
  void  calculateavg(double average)
        {
      
           if(average>90 && average<=100)
           {
             System.out.println("YOU have credited grade  A");   
           }
           else  if(average>80 && average<=90)
           {
               System.out.println("YOU have credited grade  B"); 
           }
           else  if(average>=70 && average<=80)
           {
               System.out.println("YOU have credited grade C"); 
           }
           
           else if(average>=60 && average<70)
           {
               System.out.println("YOU have credited grade D"); 
           }
          
           else 
           {
               System.out.println("YOU have credited grade E"); 
           }
       }
 }

