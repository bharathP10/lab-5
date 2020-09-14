/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

/**
 *
 * @author BHARATH sharan
 */
public class deg {
       public static void main(String[] args) {
 
         degree obj=new degree();         
         undergraduate obj2=new undergraduate();
         postgraduate obj3=new postgraduate();
         obj.getdegree();
         System.out.println("Calling degree using undergraduate subclass");
         obj2.getdegree();
         System.out.println("Calling degree using postgraduate subclass");
         obj3.getdegree();
     }
}

    
class degree
{
   void getdegree()
    {
        System.out.println("I got a DEGREE");
    }
}
class undergraduate extends degree
{
    void getdegree()
    {
        System.out.println("I am an UNDERGRADUATE");
    }
}
class postgraduate extends degree
{
    void getdegree()
    {
        System.out.println("I am a POSTGRADUATE");
    }
}
