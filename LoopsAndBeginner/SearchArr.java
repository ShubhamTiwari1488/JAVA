
/*__________SEARCHING ELEMENT IN THE ARRAY USING FOR LOOP______________________*/

class SearchArr{
  public static void main(String args[]){
  
  int nums[]={1,3,6,8,10,16,5,9,11,20};
  
  int n;
  
  n=nums.length;
  
  System.out.println("Size of the array is found to be "+n);
  
  //Assigning the element to be searched into integer;
  
  int integer=5;
  int pos=-1;
  boolean flag=false;
  
  for(int x:nums)
  {
   pos++;
   if(integer==x){
       flag=true;
       break;
    }    
  }
  
  if(flag){
  System.out.println("The element that you've been looking for has been found in the array");
  System.out.println("The element was found at the position "+(pos+1));      
  
  }
 }
}
  
