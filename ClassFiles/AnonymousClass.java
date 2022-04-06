abstract class Person
{
 abstract void display();
}

class AnonymousClass
{
 public static void main(String []args)
 {
  Person person = new Person()
  {
   void display()
   {
    System.out.println("Hello");
   }
  };
 
  person.display();
  
 }     
} 
