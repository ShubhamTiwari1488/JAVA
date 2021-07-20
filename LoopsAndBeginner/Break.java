
//Using Break as a civilized form of goto

class Break{
  public static void main(String args[]){
  
  boolean t=true;
  
  System.out.print("Demonstrating Break as a civilized form of goto\n\n");
  
  first:{
    second:{
      third:{
        System.out.println("Before the break");
        
        if(t) break second;
        
        System.out.println("This statement won't execute");
      }
      
      System.out.println("This statement won't execute");
    }
    
    System.out.println("This statement is after second block");
  }
  
 }
}
        
