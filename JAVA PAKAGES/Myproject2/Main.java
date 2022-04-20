import InputOutput.Input.*;
import InputOutput.Output.*;
import Area.Fig2D.*;

class Main
{
 public static void main(String args[])
 {
  CalSqArea ar = new CalSqArea();
  
  InputClass in = new InputClass();
  
  OutputClass ou = new OutputClass();
  
  
  double side = in.assignValue();
  
  double area = ar.Area(side);
  
  System.out.print("The area of the square is : ");
  
  ou.displayValue(area);
 }
}  
