
import java.util.*;

class Grade
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  int marks=sc.nextInt();
  
  if(marks>=90)
  	System.out.println("Grade is O ");
  	
  else if(marks>=80)
  	System.out.println("Grade is E ");
  	
  else if(marks>=70)
  	System.out.println("Grade is A ");
  	
  else if(marks>=60)
  	System.out.println("Grade is B ");
  	
  else 
  	System.out.println("Grade is below B ");
  	
  sc.close();
  
  	
 }
}

