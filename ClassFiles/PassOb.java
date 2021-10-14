
//DEMONSTRATING ONE OBJECT TO INITIALISE ANOTHER

class Box
{
 int width;
 int height;
 int depth;
 
 Box(Box o)
 {
 
  width=o.width;
  height=o.height;
  depth=o.depth;
  
 }
 
 Box(int width,int height,int depth)
 {
  this.width=width;
  this.height=height;
  this.depth=depth;
 }
  
 Box()
 {
  width=-1;
  height=-1;
  depth=-1;
  
 }
 
 Box(int len)
 {
  width=height=depth=len;
 }
 
 int volume()
 {
  return width*height*depth;
 }
 
}

class OverloadCons2
{
 public static void main(String args[])
 {
  Box mybox1=new Box(10,20,15);
  
  Box mybox2=new Box();
  
  Box mycube = new Box(7);
  
  Box myclone=new Box(mybox1);
  
  int vol;
  
  vol=mybox1.volume();
  
  System.out.println("Volume of mybox1 is "+vol);
  
  vol=mybox2.volume();
  
  System.out.println("Volume of mybox2 is "+vol);
  
  vol=mycube.volume();
  
  System.out.println("Volume of cube is "+vol);
  
  vol=myclone.volume();
  
  System.out.println("Volume of clone is "+vol);
  
 }
 
}
       
