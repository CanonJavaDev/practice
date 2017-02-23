//Interface

interface It1
{
	interface It2
	{
		public void m1();
	}
}
class Test implements It1.It2
{
	public void m1(){System.out.println("nested interface");}
	public static void main(String[] args)
	{
		It1.It2 Obj1 = new Test();
			Obj1.m1();
	}
}