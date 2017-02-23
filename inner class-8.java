// final keyword use in inner classes

class Outer
{
	public void m1()
	{
		final int x= 10; // valid if intance variables are declared as final
		 //final static int y=20; // static variables of outer class method are not allowed inside a inner class
		class Inner
		{
			public void m2()
			{
			System.out.println(x);
			System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args)
	{
		new Outer().m1();
	}
}