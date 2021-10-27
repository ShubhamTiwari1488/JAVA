
//Defining an inner class within for loop

import java.util.Scanner;

class Outer
{
 int outer_x;
 
 void test()
 {
  for(int i=0;i<10;i++)
  {
   class Inner
   {
   
    void display()
    {
      System.out.println("Display : outer_x = "+outer_x);
    }
   
   }
  
  
  Inner inner = new Inner();
  
  inner.display();
  }
 
 }
 
}

class Demo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  Outer outer=new Outer();
  
  System.out.print("\nEnter the value of outer_x ");
  
  int val=sc.nextInt();
  
  outer.outer_x=val;
  
  outer.test();
  
  sc.close();
  
 }
}
 
  
  
        
