
interface Dimension
{
 //The field variables of Interface are implicitly public , static and final
 int x = 30;
 int y = 20;
}

class Room implements Dimension
{

 public void area()
 {
  int m = x;
  int n = y;
  
  System.out.println("Area is : "+m*n);
  
 }
 
}


class Demo
{
 public static void main(String args[])
 {
 
  Room rm = new Room();
  
  rm.area();
 
 }
}
    
  
