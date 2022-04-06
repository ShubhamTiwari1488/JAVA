class Outer1
{ 
 static private double length;
 static private double width;
 
 Outer1(double x, double y)
 {
  length = x;
  width = y;
 }
 
 double area()
 {
  return length*width;
 }
 
 static class Inner2
 {
  private double rate;
  
  Inner2(double r)
  {
   rate = r;
  }
  
  void displayInner()
  {
   System.out.println("The cost of fencing = "+rate*2*(length+width));
  }
  
 }
}

class NestedStatic
{
 public static void main(String args[])
 {
  Outer1.Inner2 inn1 = new Outer1.Inner2(10);	//Objects
  
  Outer1 obj = new Outer1(40,30);
  
  System.out.println("Obj_Area = "+obj.area());
  
  inn1.displayInner();
 }
}       
