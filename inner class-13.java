//static nested class

class test
{
	static class nested
	{
		public void m1()
		{
			System.out.println("Static Nested Class");
		}
	}
	public static void main(String[] args)
	{
	//	System.out.println("main");
nested n = new nested();
n.m1();
	}
}