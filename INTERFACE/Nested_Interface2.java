interface Outer
{
 int num1 = 20;
 int num2 = 50;
 
 interface Nested
 {
  int max(int x,int y);
 }
}

class CalculateMax implements Outer.Nested
{
 /* Below lines will generate error!!
 int A = num1;
 int B = num2;
 */
 
 public int max(int x,int y)
 {
  return(x>y?x:y);
 }
}

class Main
{
 public static void main(String args[])
 {
  CalculateMax obj = new CalculateMax();
  
  Outer.Nested iNested = obj;
  
  //Outer iOuter = obj;	It will generate error!!
  
  int bigger = obj.max(50,32);  
  
  System.out.println("The bigger number is : "+bigger);
  
  System.out.println("The bigger number is : "+iNested.max(102,18));
 }
}  
