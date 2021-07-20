
/*_______________________PRINTING OF TIME PERIOD OF PENDULUM WITH LENGTH RANGING FROM 10 TO 100 _____________*/

class TimePeriod{
  public static void main(String args[]){
  
  int l;
  double t_p,r,ratio;
  double G;
  
  l=10;
  G=9.8;
  
  System.out.println("=========================================");
  System.out.println("Time period of pendulum with varying length");
  
  for(l=10;l<100;l+=10)
  {
   ratio=l/G;
   r=Math.sqrt(ratio);
   t_p=2*3.142*r;
   
   System.out.println("The Time Period of oscillation of pendulum of length "+l+" is "+t_p);
  }
 System.out.println("===================================");
}
}   
  
