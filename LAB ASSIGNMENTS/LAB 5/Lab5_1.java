
class Shape
{
 void area(double r)
 {
  System.out.println("Area of the circle is "+(3.14*r*r));
 }
 
 void area(int a)
 {
  System.out.println("Area of the square is "+(a*a));
 }
 
 void area(double b,double h)
 {
  System.out.println("Area of the triangle is "+(0.5*h*b));
 }
 
}

class Area
{
 public static void main(String args[])
 {
  Shape s = new Shape();
  
  s.area(5);
  
  s.area(7.2);
  
  s.area(9,3);
  
  s.area(2.4,5.6);
 }
}
      
