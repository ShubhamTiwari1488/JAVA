
//CREATE CLASS ATM TO ILLUSTRATE THE FUNCTIONALITY OF ATM. USING SWITCH CASE FOR IT

import java.util.*;

class ATM
{
 public static void main(String args[])
 {
  int balance=0,choice,withdraw,deposit;
  
  Scanner sc=new Scanner(System.in);
  
  do{
  
  System.out.println("\nATM Functionality");
  
  System.out.println("1.Check balance");
  System.out.println("2.Deposit Amount");
  System.out.println("3.Withdraw Amount");
  System.out.println("4.Exit");
  
  System.out.print("Enter your choice : ");
  choice=sc.nextInt();
  
  switch(choice)
  {
   case 1:	
   	System.out.println("\nThe balance of your account is : "+balance);
   	break;
   	
   case 2:
   	System.out.println("\nEnter the deposit amount ");
   	deposit=sc.nextInt();
   	
   	balance+=deposit;
   	
   	break;
   	
   case 3:
   	System.out.println("\nEnter the withdraw amount ");
   	
   	withdraw=sc.nextInt();
   	
   	if(withdraw>balance)
   	    System.out.println("\nBalance amount is less than withdraw amount");
   	    
   	else
   	{
   	 System.out.println("\nAmount Withdrawn");
   	 balance-=withdraw;
   	}
   	
   	break;
   	
   case 4:
   	System.out.println("Quitting");
   	break;
   	
   }
   
   System.out.println("\n");
   
  }while(choice<4); 
  
  sc.close();
  
 }
}
  
   
  
  
