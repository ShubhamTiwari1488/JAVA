
/*_______________DEMONSTRATING THE FOR EACH VERSION OF THE FOR LOOP_______________________*/

class ForEachLoop{
  public static void main(String[] args){
  
  int nums[]={1,2,3,4,5,6,7,8,9,10};
  
  int sum=0;
  
  for(int i=0;i<10;i++)
      sum+=nums[i];
      
  System.out.println("Printing sum through normal for loop ..... sum= "+sum);
  
  //Writing the For Loop in a different manner
  
  sum=0;
  
  for(int x:nums)    
     sum=sum+x;
     
  System.out.println("Printing sum through the new for loop.......sum = "+sum);
  
  }
  
 }     
