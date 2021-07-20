
/*_____________SWAPPING TWO NUMBERS USING THIRD VARIABLE__________________*/

class SwapNum{
  public static void main(String args[]){
    
    int a=5,b=9;
    
    int temp;
    
    System.out.println("\nThe numbers before swapping are := a= "+a+" and b= "+b);
    
    temp=a;
    a=b;
    b=temp;
    
    System.out.println("\nThe numbers after being swapped are := a= "+a+" and b= "+b);
  }
}
    
