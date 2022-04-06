import java.util.Arrays;

class ClassArray
{
 public static void main(String[] args)
 {
  int [] intArray = new int[]{9,8,7,6,5,4,3,2,1};
  
  char charArray[] = new char[]{'z','w','x','a','b','y'};
  
  System.out.println("\nBeforing sorting the character array : ");
  
  for(char ch : charArray)
  	System.out.print(ch+" ");
  	
  System.out.println("\n\nAfter sorting the character array : ");
  
  Arrays.sort(charArray);
  
  for(char ch : charArray)
  	System.out.print(ch+" ");
  	
  System.out.println("\n\nBeforing sorting the intArray : ");
  
  for(int x : intArray)
  	System.out.print(x+" ");
  	
  
  Arrays.sort(intArray ,2,5); //Sorting index 2 to 5(excluded)
  
  System.out.println("\n\nAfter sorting the intArray from index to 2 to 5(excluded): ");
  
  for(int x : intArray)
  	System.out.print(x+" ");
  	
  
  float fArray[] = new float[]{1.1f,3.5f,8.0f,9.1f,12.3f,87.9f,90.1f,10.0f};
  
  System.out.println("\n\nBeforing using Arrays.fill ::: ");
  
  for(float x : fArray)
  	System.out.print(x+" ");
  	
  
  Arrays.fill(fArray,1,4,2.53f);	//fill from index 1 to 3 with 2.53f
  
  System.out.println("\n\nAfter using Arrays.fill from index 1 to 4(excluded)::: ");
  
  for(float x : fArray)
  	System.out.print(x+" ");
  	
  System.out.println("");
  	
 }
} 
