// parent method Inheritance
class parent
{
	void m1()
	{
		System.out.println("parent m1");
	}
}
class child extends parent
{
	void m1()
	{
		System.out.println("child m1");
	}
	void m2(int i)
	{
		this.m1();
		System.out.println("child m2");
		super.m1();
		}
		public static void main(String[] args)
	{
			new child().m2(10);
		}
}