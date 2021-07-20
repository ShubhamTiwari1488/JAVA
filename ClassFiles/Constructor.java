
// THIS PROGRAM DEMONSTRATE THE DECLARATION OF THE CONSTRUCTOR IN CLASS 


class Box{
  double width;
  double height;
  double depth;
  
  Box(){
    width=20;
    height=10;
    depth=30;
  }
  
  double volume(){
    return width*height*depth;
  }
  
}

class BoxDemo{
  public static void main(String args[]){
    
    System.out.println("\nThis program demonstrate the use of constructors in class");
    
    Box b1=new Box();
    
    double vol1,vol2;
    
    vol1=b1.volume();
    
    b1.width=3;
    b1.height=2;
    b1.depth=1;
    
    vol2=b1.volume();
    
    System.out.println("\nThis prints the constructor value = "+vol1);
    System.out.println("\nThis prints the user value = "+vol2);
    
  }
  
}
          

