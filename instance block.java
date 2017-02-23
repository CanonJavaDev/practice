//Instance blocks
class Test
{
	Test()                    // Constructor
		{ 
				System.out.println("m1 method 0-arg cons");
		}
		{ 
				System.out.println("Instance Block");
		}

	public static void main(String[] args) 
	{
		new Test();  // nameless object creation
	}
}
// instance are executed before constructors
