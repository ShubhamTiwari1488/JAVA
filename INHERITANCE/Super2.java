//Using super keyword to define the constructor of subclass

class Person
{
 Person()
 {
  System.out.println("Person Constructor");
 }
 
}

class Student extends Person
{
 Student()
 {  
  super();	//Call of super must be the first statement of the constructor
  
  System.out.println("Student Constructor"); 
 }
 
}


class Main
{
 public static void main(String args[])
 {
  Student stud = new Student();
  
 }
}     
