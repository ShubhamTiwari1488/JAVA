
//THIS PROGRAM DEMONSTRATE THE USE OF THIS KEYWORD

class Box{
  double width;
  double height;
  double depth;
  
  void setDim(double width,double height,double depth){
    this.width=width;
    this.height=height;                //Without using the this keyword we would have got an error!!!
    this.depth=depth;
  }
  
  double volume(){
    return width*height*depth;
  }
  
}

class BoxDemo{
  public static void main(String args[]){
    
    Box b1=new Box();
    
    b1.setDim(10,29,30);
    
    double vol;
    
    vol=b1.volume();
    
    System.out.println("The volume of the box is "+vol);
  }
  
}          

