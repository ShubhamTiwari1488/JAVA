class OuterClass {

	
	private static String msg = "GeeksForGeeks";

	
	private static void show()
	{
	    System.out.println("Hello");
	}
	
	public void display()
	{
	    System.out.println("Shubham");
	}
	
	public static class NestedStaticClass 
	{

		
		public void printMessage()
		{
            OuterClass sh = new OuterClass();
			// Try making 'message' a non-static
			// variable, there will be compiler error
			System.out.println("Message from nested static class: " + msg);
			
			show();
			
			sh.display();
	
		}
	}

}


class Main
{
    public static void main(String args[])
	{

		// Creating instance of nested Static class
		// inside main() method
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();

		// Calling non-static method of nested
		// static class
		printer.printMessage();

		// Note: In order to create instance of Inner class
		// we need an Outer class instance

		// Creating Outer class instance for creating
		// non-static nested class
		OuterClass outer = new OuterClass();
		
		OuterClass.InnerClass inner	= outer.new InnerClass();

		// Calling non-static method of Inner class
		inner.display();

		// We can also combine above steps in one
		// step to create instance of Inner class
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();

		// Similarly calling inner class defined method
		innerObject.display();
	}
}
