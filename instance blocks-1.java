//multiple instance blocks-1
class Test
{
	Test()                    // Constructor
		{ 
			this(10);
				System.out.println("m1 method 0-arg cons");
		}
		Test(int a)                    // Constructor 1-arg
		{ 
			this(10,20);
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
	}
}

/*
	C:\Users\Ritesh\Desktop\corejava\Sample>java Test
	Instance Block-1
	Instance Block-2
	m1 method 2-arg cons
	m1 method 1-arg cons
	m1 method 0-arg cons
*/