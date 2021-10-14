
//PASSING OBJECTS TO THE METHODS 

class Test
{
 int a,b;
 
 Test(int a,int b)
 {
  this.a=a;      //In C++ , we write it as this->a=a;
  this.b=b;       // In C++, we write it as this->b=b;
 }
 
 boolean equalTo(Test o)
 {
  if(o.a==a && o.b==b)
   return true;
   
  else 
   return false;
 
 }
 
}

class PassOb
{
 public static void main(String args[])
 {
   Test ob1=new Test(100,22);
   
   Test ob2=new Test(100,22);
   
   Test ob3=new Test(-1,-1);
   
   System.out.println("\nOb1==Ob2 : "+ob1.equalTo(ob2));
   
   System.out.println("Ob1==Ob3 : "+ob1.equalTo(ob3)+"\n");
   
 }
 
}
   
       
       
