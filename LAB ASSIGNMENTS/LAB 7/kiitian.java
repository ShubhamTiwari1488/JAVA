package pack;

public class kiitian extends student
{
 public String name = "Shubham Tiwari";
 
 public void course()
 {
  System.out.println("Name : "+name+" \nThe rollno : "+roll);
  System.out.println("Registration no : "+regno);
 }
 
 public static void main(String args[])
 {
  kiitian k = new kiitian();
  
  k.course();
 }
}    
