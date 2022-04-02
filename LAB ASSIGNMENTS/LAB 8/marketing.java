package pack1;

import java.util.Scanner;

class sales extends employee
{
 
 public double tallowance(double sal)
 {
  return (0.05*sal);
 }
 
 public double earnings(double sal)
 {
  return(sal+0.8*sal+0.15*sal);
 }
 
 public void print(double sal)
 {
  double earn1=earnings(sal);
  double earn2=tallowance(sal);
  
  System.out.println("The empid of the person is : "+empid+" and total earning is : "+(earn1+earn2));
  
 }

 public static void main(String args[])
 {
  sales s = new sales();
  
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter the basic salary of the employee : ");
  
  double basic = sc.nextDouble();
  
  s.print(basic);
  
  sc.close();
 } 
} 
 
