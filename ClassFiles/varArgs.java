class varArgs{

 static void show(String...values)
 {
  System.out.println("The number of arguments are : "+values.length);
  
  System.out.print("Displaying the variable arguments :: ");
  
  for(String str : values)
    System.out.print(str);
    
  System.out.println("");
 }

 public static void main(String args[])
 {
  show();
 
  show("My"," name ","Shubham Tiwari");
  
 }
}   
