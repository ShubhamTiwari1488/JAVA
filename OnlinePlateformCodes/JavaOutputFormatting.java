//Solving Hackerrank Java Output Formatting Question

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n",s1,x);         //This way also we can print the content ..in a particular format.
            }
            System.out.println("================================");

    }
}
