

/*________WAP IN JAVA TO CREATE VARIABLE SIZE 2 D ARRAY________________*/

import java.util.*;

class Var2Darray{
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  
  int a[][]=new int[4][];
  
   a[0]=new int[1];
   a[1]=new int[2];
   a[2]=new int[3];
   a[3]=new int[4];
  
  for(int i=0;i<4;i++)
    for(int j=0;j<i+1;j++)
    {
      System.out.printf("\nEnter the element of row %d and column %d : ",(i+1),(j+1));
      a[i][j]=sc.nextInt();
    }
  
  for(int i=0;i<4;i++){
    for(int j=0;j<i+1;j++){
      System.out.print(a[i][j]+"\t");
      }
      System.out.print("\n");
    }
      
  System.out.println("\n");
  
  }
}
            
      
  
