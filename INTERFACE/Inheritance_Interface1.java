//INHERITANCE IN INTERFACE

interface A
{
 int first_num = 5;
 
 double surfaceAreaSquare(double side);
}

interface B extends A
{
 int second_num = 11;
  
 double surfaceAreaCircle(double radius);
}

interface C extends B
{
 int third_num = 9;
 
 double surfaceAreaRectangle(double length , double breadth);
}


class AreaCalculator implements B
{
 int var1 = first_num;
 
 int var2 = second_num;
 
 //int var3 = third_num;  It will generate error!!
 
 
 public double surfaceAreaSquare(double s)	//You have to define this function
 { 
  return(s*s);
 } 
 
 public double surfaceAreaCircle(double r)	//You have to define this function too!!
 {
  return(3.142*r*r);
 }   
 
 public double surfaceAreaRectangle(double l , double b) //Defining this function is optional
 { 
  return(l*b);
 }
 
}

class Main
{
 public static void main(String args[])
 {
  AreaCalculator ar = new AreaCalculator();
  
  System.out.println("The surface Area of Circle is : "+ar.surfaceAreaCircle(7));  
  
  System.out.println("The surface Area of Square is : "+ar.surfaceAreaSquare(7));
  
  System.out.println("The surface Area of Rectangle is : "+ar.surfaceAreaRectangle(7,4));
  
  
  System.out.println("\n=====================================================\n");
  
  B iB = ar;
  
  System.out.println("The surface Area of Circle is : "+iB.surfaceAreaCircle(7));  
  
  System.out.println("The surface Area of Square is : "+iB.surfaceAreaSquare(7));
  
  //System.out.println("The surface Area of Rectangle is : "+iB.surfaceAreaRectangle(7,4)); Will Generate Error!!
  
  
  System.out.println("\n=====================================================\n");
  
 }
}  
