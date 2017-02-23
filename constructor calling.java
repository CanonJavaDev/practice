// Constructor Calling 
class Test
{
	Test()                    // Constructor
		{
				this(10);  // calling another constructor // calling 1-argument constructor 
				System.out.println("m1 method");
		}

	Test(int a)   // Constructor with 1 argument 
		{
				this(10,20);  // calling two argument constructor
				System.out.println("m2 method");
		}
	Test(int a, int b) /// constructor with 2 arguments
		{
				System.out.println("m3 method");
		}
	public static void main(String[] args) 
	{
		Test t = new Test();  // object creation
	}
}