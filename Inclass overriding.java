//in class overridding method

 class A
{
	int a = 10;
	public int display()
		{
		int b = 10;
		return b;//	System.out.println(b);
		}
}
class Test extends A
{
	int a = 100;
	public int display()
		{
		int b = 20;
		return b;//System.out.println(b);
		}
		public static void main(String[] args)
	{
		Test a=(Test) new A();
		//A b = new A()
		System.out.println(a.display());
		System.out.println(a.a);
		}
}