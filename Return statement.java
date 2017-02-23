// return Primitive Type
class test 
{
	int m1()
	{
		System.out.println("Method one");
		return 10;
	}
	float m2()
	{
		System.out.println("Method two");
		return 10.5f;
	}
	char m3()
	{
		System.out.println("Method three");
		return 'c';
	}
	public static void main(String[] args) 
	{
		test t = new test();
		int x = t.m1(); // assigning return value to variable x
		System.out.println("Method one ="+x);
		float y = t.m2();
		System.out.println("Method two ="+y);
		char z = t.m3();
		System.out.println("Method three ="+z);
		
	}
}
