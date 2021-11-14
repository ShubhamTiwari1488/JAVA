
//JAVA INTEGER TO STRING

import java.util.*;

class Int_to_String
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  int n=sc.nextInt();
  
  sc.close();
  
  String s=Integer.toString(n);
  
  if(n==Integer.parseInt(s))
  {
   System.out.println("Good Job\n");
  }
  
  else
  {
   System.out.println("Wrong Answer\n");
  }
  
 }
 
}
    
