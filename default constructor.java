// User defined Constructor
class Test 
{
	void m1() // instance method
	{
		System.out.println("m1 method");
	}
	// user defined constructor
	Test()
	{ System.out.println("0-arg constructor");
	} 
	Test(int a)
	{ System.out.println("1-arg constructor");
	} 
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1();
		new Test(10);
	}
}
