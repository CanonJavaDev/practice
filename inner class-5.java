// nesting inner classs

class A
{
	class B
	{
		class C
		{
			public void m1(){System.out.println("Nested inner class");}
		}
	}
}
class test
{
	public static void main(String[] args)
	{
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.m1();
	}
}