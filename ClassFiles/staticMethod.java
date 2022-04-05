class staticMethod
{
 static int a = 25;
 int b = 10;
 
 static void print()
 {
  System.out.println("This is static void print()");
 }
 
 void show()
 {
  System.out.println("This is void show()");
 }
 
 static void method()
 {
  print();
  
  /* show(); //Because it is a non-static class member so will raise error. */
  
  System.out.println("Printing a static variable : "+a);
 }    
}

class Main
{
 public static void main(String args[])
 {
  staticMethod.method();
 }
}   
