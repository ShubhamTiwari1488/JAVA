
class Plate
{
 Plate()
 {
  System.out.println("This is constructor of plate ");
 }
}

class Box extends Plate
{
 Box()
 {
  System.out.println("This is constructor of Box ");
 }
}

class WoodBox extends Box
{
 WoodBox()
 {
  System.out.println("This is constructor of WoodBox ");
 }
}

class Constructor
{
 public static void main(String args[])
 {
   new WoodBox();
 }
}
        
