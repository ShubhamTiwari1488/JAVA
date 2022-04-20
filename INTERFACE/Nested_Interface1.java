//NESTED INTERFACE IN A CLASS

class A
{
 interface Nested
 {
  int max(int x,int y);
 }
}

class B implements A.Nested
{
 public int max(int x,int y)
 {
  return(x>y?x:y);
 }
}

class Main
{
 public static void main(String args[])
 {
  B objB = new B();
  
  int bigger = objB.max(50,39);
  
  System.out.println("Bigger number is : "+bigger);
 }
}      
