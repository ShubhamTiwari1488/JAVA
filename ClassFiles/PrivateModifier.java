class example
{
 int a;
 
 private class sub
 {
  void show()
  {
   System.out.println("Hello");
  }
 }
 
 public class sub2
 {
  void show2()
  {
   sub s = new sub();
   
   s.show();
  }
 }
   
 void display()
 {
  sub s = new sub();
  
  s.show();
  
  sub2 m = new sub2();
  
  m.show2();
 }   
}


class Demo extends example
{
 void showme()
 {
  sub2 n = new sub2();
  
  n.show2();
 }
}
  
class Main
{
 public static void main(String args[])
 {
  example e = new example();
  
  e.display();
  
  Demo h = new Demo();
  
  h.showme();
 }
}
   
