interface Motor
{
 double capacity = 100.00;
 
 void run();
 void consume();
}

class WashingMachine implements Motor
{
 public void run()
 {
  System.out.println("We are in run() method");
 }
 
 public void consume()
 {
  System.out.println("We are in consume() method");
 }
 
}

class Main
{
 public static void main(String args[])
 {
  WashingMachine wm = new WashingMachine();
  
  wm.run();
  wm.consume();
  
  System.out.println("The value of capacity is : "+wm.capacity);
 }
}      
