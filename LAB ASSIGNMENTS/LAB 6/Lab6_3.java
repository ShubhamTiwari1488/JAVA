
import java.util.*;

class LowerTriangular    
{    
    public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the row and col respectively");
        
    int rows=sc.nextInt();
    int cols=sc.nextInt();
           
        if(rows != cols)
          {    
              System.out.println("Matrix should be a square matrix");    
          }    
          
          else 
          {   
              int a[][] = new int[rows][cols];
              
              for(int i=0;i<rows;i++)
              {
               for(int j=0;j<cols;j++)
               {
                System.out.println("Enter the content for row "+i+" and col "+j);
                a[i][j]=sc.nextInt();
               }
              }
                
              System.out.println("Lower triangular matrix: ");    
              for(int i = 0; i < rows; i++){    
                  for(int j = 0; j < cols; j++){    
                    if(j > i)    
                      System.out.print("0 ");    
                    else    
                      System.out.print(a[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
}    
