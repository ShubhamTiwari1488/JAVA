
//THIS PROGRAM DEMONSTRATE THE USE OF PARAMETERIZED CONSTRUCTOR

class Box{
  double width;
  double height;
  double depth;
  
  Box(double w,double h,double d){
    width=w;
    height=h;
    depth=d;
  }
  
  void setDim(double w,double h,double d){
    width=w;
    height=h;
    depth=d;
  }
  
  double volume(){
    return width*height*depth;
  }
  
}

class BoxDemo{
  public static void main(String args[]){
    
    Box b1=new Box(10,20,30);
    
    double vol1,vol2,vol3;
    
    vol1=b1.volume();
    
    b1.setDim(3,2,1);
    
    vol2=b1.volume();
    
    b1.width=10;
    b1.depth=20;
    b1.height=3;
    
    vol3=b1.volume();
    
    System.out.println("Volume 1 is "+vol1+"\nVolume 2 is "+vol2+"\nVolume 3 is "+vol3);
    
  }
  
}
    
            
