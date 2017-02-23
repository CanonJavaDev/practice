//basic inheritance 
class A
{
	void m1()
	{
		System.out.println("m1 method");
	}
	void m2()
	{
		System.out.println("m2 method");
	}
}
class B extends A
{
	void m3()
	{
		System.out.println("m3 method");
	}
}
class C extends B
{
		void m4()
		{
		System.out.println("m4 method");
		}
	public static void main(String[] args)
		{
			A a = new A();
			a.m1(); a.m2();
			B b = new B();
			b.m1(); b.m2(); b.m3();
			C c = new C();
			c.m1(); c.m2(); c.m3(); c.m4();
		}

}