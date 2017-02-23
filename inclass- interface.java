// Interface

interface It1
{
	public void m1();
}

interface It2 extends It1
{
	public void m2();
}
class Test implements It2
{
	public void m1()
	{
		System.out.println("It1 implementation");
	}
	
	public void m2()
	{
		System.out.println("It2 implementation");
	}
	public static void main(String[] args)
	{
		It1 Obj1 = new Test();
		Obj1.m1();
		//Obj1.m2();
		It2 Obj2 = new Test();
		Obj2.m1();
		Obj2.m2();
	}
}