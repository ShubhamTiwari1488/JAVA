
import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int len= A.length()+B.length();
        
        System.out.println(len);
        
        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        
        else{
            System.out.println("No");
            
        }
        
        String str=A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);
        
        System.out.println(str); 
    }
}




