import java.util.Arrays;

class Main
{
 public static void main(String args[]){
 
 int arr1[]={1,2,3,4,5};
 
 System.out.println("Arrays to String : "+Arrays.toString(arr1));
 
 int[] arr2 = Arrays.copyOfRange(arr1,1,4);
 
 for(int x:arr2)
 	System.out.print(x+" ");
 	
 System.out.println("");
 }
} 
