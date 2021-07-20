
/*_____________THIS PROGRAM INCLUDES A METHOD WITH A RETURN TYPE INSIDE THE BOX CLASS_______________________*/

class Box{
  
  double width;
  double height;
  double depth;
  
  double volume(){
    
    return width*height*depth;
  }
  
}

class MethodInclass{

  public static void main(String args[]){
    
    Box b1=new Box();
    
    b1.height=30;
    b1.width=20;
    b1.depth=10;
    
    double vol;        //A variable to store the value that would be returned by the method named volume in the Box class.
    
    vol=b1.volume();    
    
    System.out.println("The volume of the box is "+vol);
  }
  
}
    
