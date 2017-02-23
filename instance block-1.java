//Instance blocks-1
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
				System.out.println("Instance Block");
		}

	public static void main(String[] args) 
	{
		new Test();  // nameless object creation
		new Test(10);
		new Test(10,20);
	}
}
/*  Out Put 
	C:\Users\Ritesh\Desktop\corejava\Sample>java Test
	In	stance Block
	m1 method 0-arg cons
	Instance Block
	m1 method 1-arg cons
	Instance Block
	m1 method 2-arg cons 
*/