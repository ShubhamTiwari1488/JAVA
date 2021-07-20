
class Box{
  
  int width;
  int height;
  int depth;
  
  void volume(){
    
    System.out.print("The volume of the box is ");
    int vol=width*height*depth;
    
    System.out.println(vol);
    
  }
  
}

class ObjectReferenceVariable{

  public static void main(String args[]){
  
    Box b1=new Box();
    
    Box b2=b1;       //Here b2 refer to the same Object . Here the point to be noted is that b2 does'nt hold copy       
                     // of object but copy of reference to the object ...
                     
   b1.width=30;
   b1.height=20;
   b1.depth=10;
   
   System.out.println("\nTo show that b2 is not a copy of object but it is a reference to the object that has been created");
   System.out.println("Here the width is "+b2.width+"\nHere the height is "+b2.height+"\nHere the depth is "+ b2.depth);
   
   b1=null;
   System.out.println("\nAfter b1 is nullified ........we try to call check whether the actual object contains the data or not");
   System.out.println("Here the width is "+b2.width+"\nHere the height is "+b2.height+"\nHere the depth is "+ b2.depth);
   
   System.out.println("So this way we can conclude that b2 and b1 are basically a reference to the actual object that has been created");
 
 }
}
   
                     
