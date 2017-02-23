// accessing static and instance variables inside method inner class

class Outer
{int x=10; // instance variable
		static int y = 20; // static variables
	//public void m1() // instance method returns output as 10 20(x and y values)
	public static void m1() // static method returns output as non-static variable x cannot be referenced from a static context
		{																										//System.out.println(x);
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