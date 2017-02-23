// interface inside a interface  inner class concept

interface Outer
{
	public void m1();
		interface Inner
		{
				public void m2();
		} 
}

class Test1 implements Outer
{
	public void m1()
	{
		System.out.println("outer interface");
	}
}
class Test2 implements Outer.Inner
{
	public void m2()
	{
		System.out.println("inner interface");
	}
	public static void main(String[] args)
	{
		Test1 t = new Test1();
		t.m1();
		Test2 t2 = new Test2();
		t2.m2();
	}
}