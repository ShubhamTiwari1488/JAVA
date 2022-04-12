//Interface References and Implementing multiple Interfaces

interface IntfaceA
{
 public void show();
}

interface IntfaceB
{
 public int method1(int a, int b); 
}

interface IntfaceC
{
 public double method2(double x);
}

class MultiInterfaceImpliment implements IntfaceA , IntfaceB
{
 //Defining show method
 public void show()
 {
  System.out.println("Hello ! It is java.");
 }
 
 //Defining method1 method
 public int method1(int a, int b)
 {
  return a+=b;
 }
 
 public void display()
 {
  System.out.println("\nI cannot be called by interface references.\nOnly class object can call me.");
 }
 
 //Main
 public static void main(String args[])
 {
 
  //Creating interface references and assigning class objects
  IntfaceA iA = new MultiInterfaceImpliment();
  
  IntfaceB iB = new MultiInterfaceImpliment();
  
  IntfaceC iCC = (double x) -> {return x*x*x;};
  
  
  //invoking the methods
  
  iA.show();
  
  System.out.println("Value after processing a and b = "+ iB.method1(25,15));
  
  System.out.println("Value after processing x = "+ iCC.method2(5.0));
  
  
  //iA.display();  error
  //iB.display();  error
  
  
  MultiInterfaceImpliment m = new MultiInterfaceImpliment();
  
  m.display();
  
 }
}  
     
