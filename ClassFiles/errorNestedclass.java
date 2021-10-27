
//THIS PROGRAM WILL NOT COMPILE 

//NESTED CLASSES IN JAVA

import java.util.Scanner;

class Outer
{
 int outer_x;
 
 void test()
 {
  Inner inner = new Inner();
  
  inner.display();
 }
 
 class Inner
 {
  int y=10;
  
  void display()
  {
   System.out.println("display : outer_x = "+outer_x);
  }
 }
 
 void showy()
 {
  System.out.println(y);     //Error , y is not known here !!
  
 }
}

class Demo
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("\nEnter the value of outer_x");
  
  int val= sc.nextInt();
  
  
  Outer outer = new Outer();     //Creating object of the class Outer
  
  outer.outer_x=val;
  
  outer.test();
 }
}
       
