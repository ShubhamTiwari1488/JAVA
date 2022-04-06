import java.util.Arrays;

class Main
{
 public static void main(String []args){
 
 int arr1[] = {1,2,3,4,5};
 int arr2[] = {1,2,3,4,5};
 
 if(Arrays.equals(arr1,arr2))
 	System.out.println("Both arrays are same");
 	
 else
 	System.out.println("Both arrays are different");
 	
 
 int k = 5 , m = 8;
 
 int index1,index2;
 
 index1=Arrays.binarySearch(arr1,k);
 
 index2=Arrays.binarySearch(arr2,m);
 
 System.out.println("Value of index1 is : "+index1+" and Value of index2 is : "+index2);
 
 int arr3[] = Arrays.copyOf(arr1,9);
 
 int arr4[] = Arrays.copyOf(arr1,3);
 
 System.out.print("\nDisplaying array 3 : ");
 
 for(int x : arr3)
 	System.out.print(x+" ");
 	
 System.out.print("\nDisplaying array 4 : ");
 
 for(int x : arr4)
 	System.out.print(x+" ");
 	
 System.out.println("");
 }
} 
