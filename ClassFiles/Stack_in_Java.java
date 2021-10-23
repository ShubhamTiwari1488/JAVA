
//Implementing Stack and applying private ,public here.

class Stack
{
 private int stk[]=new int[10];
 private int top;
 
 Stack()
 {
  top=-1;
 }
 
 //Push Operation
 
 void Push(int data)
 {
   if(top==9)
    System.out.println("Stack Overflow");
    
   else
   {
    stk[++top]=data;
   }
   
 }
 
 //Pop Operation
 
 int Pop()
 {
     if(top==-1){
       System.out.println("Stack Underflow");
       return -1;
      }
       
     else
     {
       return stk[top--];
     }
     
 }
 
}


class Main
{
 public static void main(String args[])
 {
  Stack mystack1=new Stack();          
  Stack mystack2=new Stack();
  
  System.out.println("Push Operation being carried out");
  for(int i=0;i<10;i++)
    mystack1.Push(i);
    
  for(int i=0;i<20;i++)
  	mystack2.Push(i);
  	
  System.out.println("Pop Operation being carried out");
  
  for(int i=0;i<10;i++)
  	System.out.println((mystack1.Pop())+"Popped Out");
  
  System.out.println("Pop Operation being carried out");
  	
  for(int i=0;i<20;i++)
  	System.out.println((mystack2.Pop())+"Popped Out");
  	
 }
}
    
