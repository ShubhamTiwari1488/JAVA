package userpackage;	//declaring its package

public class Array
{
 public void Aray()
 {
  int[] array1 = new int[]{1,2,3,4};
  
  System.out.print("\nThe elements of the array are : ");
  
  for(int x : array1)
  	System.out.printf("%d ",x);
  	
  System.out.println();
 }
}  
