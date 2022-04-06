
class LocalClass
{
 public static void main(String[] args)
 { 
  class Local
  {
   int num = 8;
   
   void display()
   {
    System.out.println("Hello ....we are in LOCAL CLASS");
    System.out.println("\nThe value of num is "+num);
   }
  }
  
  Local l = new Local();
  
  l.display();
 }
}    
