// Constructor Overloading
class Test
{
	// Constructor overloading
	Test(int a)
	{
		System.out.println("int 1-arg cons");
	}
	
	Test(int a, int b)
	{
		System.out.println("int int arg cons");
	}
	
	Test(char ch)
	{
		System.out.println("char arg cons");
	}
	public static void main(String[] args)
		{
		new Test(10);
		new Test(10,20);
		new Test('c');
	}
}