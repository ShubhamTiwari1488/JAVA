

//This Program will have a parameter in the method of the class Box

class Box{
  double width;
  double height;
  double depth;
  
  double volume(){
    return width*height*depth;
  }
  
  void SetDim(double w,double h,double d){
    
    width=w;
    height=h;
    depth=d;  
  }
  
}

class BoxDemo{
  public static void main(String args[]){
    
    Box b1=new Box();
    
    
    double vol;
    
    b1.SetDim(10,20,30);
    
    vol=b1.volume();
    
    System.out.println("The volume of the box is "+vol);
  }
  
}
        
