//Order of Constructor Call in Single Inheritance

class A
{ 
 A()
 {
  System.out.println("Constructor of A");
 }
}

class B extends A
{
 B()
 {
  System.out.println("Constructor of B");
 }
}

class Main
{ 
 public static void main(String[] args)
 {
  B objb = new B();
 }
}      
