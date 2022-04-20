interface Area
{
 double surfaceAreaCircle(double radius);
 double areaSquare(double side);
 void setValue(double side);
}

class CalArea implements Area
{
 
 //Stub Methods ...(we don't use these two methods)
 
 public double surfaceAreaCircle(double radius)
 {
  return 0;
 }
 
 public void setValue(double side) {}
 
 //End of Stub Methods
 
 
 //Defining the method that we will use in this program
 
 public double areaSquare(double side)
 {
  return(side*side);
 }
 
}

class Main
{
 public static void main(String args[])
 {
  CalArea ar = new CalArea();
  
  double area = ar.areaSquare(5);
  
  System.out.println("The area of the square is : "+area);
  
  //Calling a Stub Method
  
  ar.setValue(5);	//Nothing will happen when we invoke it
 }
}      
