
//OVERLOADING METHODS IN JAVA

class OverloadDemo{

 void test(){
  System.out.println("No parameters");
 }
 
 void test(int a)
 {
  System.out.println("a : "+a);
 }
 
 void test(int a,int b)
 {
  System.out.println("a and b "+a+" "+b);
 }
  
 void test(double a,double b)
 {
  System.out.println("double a and double b "+a+" "+b);
 }
 
  void test(double a)
 {
  System.out.println("double a is "+a);
 }
 
}

class Overloading{
public static void main(String args[])
{
 OverloadDemo obj=new OverloadDemo();
 
 //Note:- Conversion happens automatically from lower heirarchy to upper heirarchy and not vice - versa
 //Eg:- int is converted to double in case proper matching is not found.
 
 obj.test(29);	
 obj.test(14.87);
 obj.test(87,23);
 obj.test(11.45,44.54);
 
}
}
      
