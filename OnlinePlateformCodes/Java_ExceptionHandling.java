
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    int x,y;
    
    Scanner sc= new Scanner(System.in);
    
    try
    {
      x=sc.nextInt();
      y=sc.nextInt();
      
      System.out.println(x/y);  
    }    
    
    catch(ArithmeticException e)
    {
        System.out.println("java.lang.ArithmeticException: / by zero");
    }
    
    catch(Exception e)
    {
        System.out.println("java.util.InputMismatchException");
    }
    
    }
}


