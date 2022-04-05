import java.util.Random;

class Main
{
 public static void main(String args[])
 {
  Random rand = new Random();
  
  System.out.println(1+Math.abs(rand.nextInt())%20);
  
  System.out.println(Math.random());	//Ranges from 0 to 1.0
 }
}  
