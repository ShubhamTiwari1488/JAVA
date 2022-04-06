class Main
{
 public static void main(String args[])
 {
  int arr1[] = {1,2,3,4,5};
  
  int arr2[];
  
  arr2=arr1;	//Array2 becomes a reference of array1
  
  System.out.print("Array 2 is : ");
  
  for(int x: arr2)
  	System.out.print(x+" ");
  	
  for(int i=0;i<5;i++)
  {
   arr1[i]=arr1[i]*2;
  }
   
  System.out.print("\n\nArray 1 is : ");
  
  for(int x: arr1)
  	System.out.print(x+" ");
  	
  System.out.print("\n\nArray 2 now becomes : ");
  
  for(int x : arr2)
  	System.out.print(x+" ");
  	
  System.out.println("");
 }
} 
