
// WRITING A STACK CLASS

class Stack{
  int stck[]=new int[10];
  int top;
  
  Stack(){
    top=-1;
  }
  
  void push(int item){
    if(top==9)
      System.out.println("Overflow");
      
    else
      stck[++top]=item;
      
  }
  
  int pop(){
    if(top<0){
      System.out.println("Underflow");
      return 0;
    }
    
    else
      return stck[top--];
      
  }
  
}

class TestStack{
  public static void main(String args[]){
    Stack mystack=new Stack();
    
    for(int i=0;i<10;i++)
      mystack.push(i);
      
    for(int i=0;i<10;i++)
      System.out.println(mystack.pop());
      
  }
  
}

                        
