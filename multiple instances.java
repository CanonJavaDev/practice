//multiple instance blocks
class Test
{
	Test()                    // Constructor
		{ 
				System.out.println("m1 method 0-arg cons");
		}
		Test(int a)                    // Constructor 1-arg
		{ 
				System.out.println("m1 method 1-arg cons");
		}
		Test(int a, int b)                    // Constructor 2-arg
		{ 
				System.out.println("m1 method 2-arg cons");
		}
		{ 
				System.out.println("Instance Block-1");
		}

		{ 
				System.out.println("Instance Block-2");
		}
	public static void main(String[] args) 
	{
		new Test();  // nameless object creation
		new Test(10);
		new Test(10,20);
	}
}