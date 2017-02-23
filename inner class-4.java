//using this keyword in inner class

class Outer
{
	int x=10;
	class Inner
	{
		int x=100;
		public void m1()
		{
			int x=1000;
			System.out.println(x); // printing local variable
			System.out.println(this.x); // printing inner class variable
			System.out.println(Outer.this.x); // printing outer class variable
		}
	}
	public static void main(String[] args)
	{
		new Outer().new Inner().m1();
	}
}