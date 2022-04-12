class Person
{
 void display()
 {
  System.out.println("Person");
 }
  
}

class Main
{
 public static void main(String args[])
 {
  Person person1 = new Person()
  { 
   void display()
   {
    System.out.println("Hey !! I am a robot");
   }
  };
  
  Person person2 = new Person();
  
  Person person3 = new Person();
  
  person3 = person1;
  
  person1.display();
  
  person2.display();
  
  person3.display();
  
 }
}  
     
