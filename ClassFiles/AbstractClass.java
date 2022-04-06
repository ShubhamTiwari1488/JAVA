abstract class Shape
{ 
 abstract void draw();
}

class Square extends Shape
{
 void draw()
 {
  System.out.println("Square");
 }
}

class Circle extends Shape
{
 void draw()
 {
  System.out.println("Circle");
 }
}

class Main
{
 public static void main(String args[])
 {
  Square sq = new Square();
  
  Circle cir = new Circle();
  
  sq.draw();
  cir.draw();
 }
}      
