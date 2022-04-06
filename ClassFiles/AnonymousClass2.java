class Fruit
{
 void apple()
 {
  System.out.println("Apples");
 }
 
 void mango()
 {
  System.out.println("Mango");
 }
 
 void banana()
 {
  System.out.println("Banana");
 }
}

class Main
{
 public static void main(String args[])
 {
  
  System.out.println("=============================\n");
  
  Fruit f = new Fruit()
  {
     void apple()
     {
      System.out.println("Anonymous Class Apples");
     }
  };
  
  f.apple();
  f.mango();
  f.banana();
  
  System.out.println("==============================\n");
  
  Fruit f_new = new Fruit();
  
  f_new.apple();
  f_new.mango();
  f_new.banana();
   
 }
}      
