interface SurfaceArea
{
 double Compute(double x);
}

class Square implements SurfaceArea
{
 public double Compute(double x)
 {
  return (x*x);
 }
}

class Circle implements SurfaceArea
{
 public double Compute(double x)
 {
  return (3.142*x*x);
 }
}

class Area
{
 public static void main(String args[])
 {
  Square sq = new Square();
  
  Circle c = new Circle();

  double Sq_SurfaceArea = sq.Compute(7);
  
  double Circle_SurfaceArea = c.Compute(9.3);

  System.out.println("Surface Area of square is : "+Sq_SurfaceArea);

  System.out.println("Surface Area of Circle is : "+Circle_SurfaceArea);

 }
}

 