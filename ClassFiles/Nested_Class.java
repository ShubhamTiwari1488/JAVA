
//IMPLEMENTING NESTED CLASS CONCEPT

class Outer
{
 int outer_x=100;
 
 void test()
 {
  Inner inner = new Inner();
  
  inner.display();
  
 }
 
 //THIS IS AN INNER CLASS
 
 class Inner
 {
  void display()
  {
   System.out.println("Display : outer_x = "+outer_x);
  }
  
 }
 
}

public class Nested_Class
{
 public static void main(String args[])
 {
  Outer outer = new Outer();
  
  outer.test();
  
 }
 
}

      
