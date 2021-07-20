
/*_______________CREATING A CLASS BOX AND DEFINING SOME INSTANCE VARIABLE WITHIN THE CLASS______________*/

class Box{
  
  int height;
  int width;
  int depth;
  
  void volume()
  {
    int vol;
    
    vol=height*width*depth;
    
    System.out.println("The volume of the box is "+vol);
  
  }
  
}

class BoxDemo{
  public static void main(String args[]){
  
  Box mybox1=new Box();
  Box mybox2=new Box();
  
  mybox1.height=10;
  mybox1.width=20;
  mybox1.depth=30;
  
  mybox2.height=1;
  mybox2.width=2;
  mybox2.depth=3;
  
  mybox1.volume(); 
  mybox2.volume();   
  
  System.out.println("Program ends");
  
 }

}
  
