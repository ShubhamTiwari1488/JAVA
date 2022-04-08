//super keyword for defining constructor

class Super
{
 int x,y;
 
 Super(int x,int y)
 {
  System.out.println("Super class Constructor");
  
  this.x=x;
  this.y=y;
 }
 
}

class Sub extends Super
{ 
 int z;
 
 Sub(int x,int y,int z)
 {
    super(x,y);
    
    System.out.println("Sub Class Constructor");
    
    this.z = z;
 }
 
 void display()
 {
  System.out.printf("X is : %d , Y is : %d and Z is : %d\n",x,y,z);
 }
 
}


class Main
{
 public static void main(String args[])
 {
  Sub subclass = new Sub(10,20,40);
  
  subclass.display();
 }
}  
