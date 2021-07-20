
/*___________THIS PROGRAM DEMONSTRATE TAKING INPUT IN JAVA (INTEGER,DECIMAL,CHARACTER AND STRING)__________*/


import java.util.*;

class Input{
  public static void main(String args[]){
    
    int n;
    float f;
    char ch;
    String str,str2;
    
    // Creating an object of class Scanner...
    
    Scanner sc=new Scanner(System.in);
    
    //Taking integer value...
    
    System.out.println("Enter an integer value");
    n=sc.nextInt();
    
    //Taking float value...
    
    System.out.println("Enter an decimal value");
    f=sc.nextFloat();
    
    //Taking an character....
    
    System.out.println("Enter an character value");
    ch=sc.next().charAt(0);
    
    //Taking a string input without spaces....
    
    System.out.println("Enter a string without spaces");
    str=sc.next();
    
    
    
    //Taking a string input with spaces....
    
    System.out.println("Enter a string with spaces");
    str2=sc.nextLine();        //Taking a garbage value....
    str2=sc.nextLine();
    
    //Printing the output...
    
    System.out.println("Printing n = "+n+"\nPrinting f = "+f+"\nPrinting ch = "+ch+"\nPrinting str = "+str+"\nPrinting str2 = "+str2);
    
  }
  
}
    
