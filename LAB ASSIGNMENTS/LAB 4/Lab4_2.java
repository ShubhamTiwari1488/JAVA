
import java.util.*;

class Palindrome
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  int org_num,num,rev_num=0;
  
  num=sc.nextInt();
  
  org_num=num;
  
  while(num!=0)
  {
   int rem=num%10;
   
   rev_num=rev_num*10+rem;
   
   num=num/10; 
 }
 
 if(org_num==rev_num)
 	System.out.println("It is a palindrome");
 	
 else
 	System.out.println("It is not a palindrome");
 	
 sc.close();
 }
}
 
  
  
