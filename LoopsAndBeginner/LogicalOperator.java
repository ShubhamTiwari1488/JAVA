
/*_______DEMONSTRATING SOME OF THE LOGICAL OPERATORS _________________________*/

class LogicalOperator{
   public static void main(String args[]){
   
   int a=42;
   int b=15;
   
   int c=a&b;        //Bitwise AND
   int d=a|b;        //Bitwise OR
   int e=a^b;         // Bitwise XOR
   int f=~a;          //Bitwise NOT
   
   System.out.println("Bitwise AND "+c);
   System.out.println("Bitwise OR "+d);
   System.out.println("Bitwise XOR "+e);
   System.out.println("Bitwise NOT "+f);
   
  }
  
}
   
