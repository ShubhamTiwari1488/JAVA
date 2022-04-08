//Using super keyword to distinguish between super class and subclass

class Super
{
 int var = 100;
 
 protected void message()
 {
  System.out.println("Super Class");
 }
 
}

class Sub extends Super
{
 int var = 180;
 
 public void message()	//You can only increase the visibility . Removing public modifier will generate error!!! Since this would decrease the visibility.
 {
  System.out.println("SubClass");
 }
 
 void display()
 {
  System.out.println("Var in SubClass is : "+var);
  
  System.out.println("Var in SuperClass is : "+super.var);
  
  message();
  
  super.message();
 }
 
}

class Main
{
 public static void main(String args[])
 {
  Sub obj = new Sub();
  
  obj.display();
 }
}    
       
