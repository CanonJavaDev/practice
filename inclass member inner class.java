// inner class -- Member inner class
class Outer
{
	private int a =10;
	class Inner
	{
		public void m1(){
		System.out.println(a);}
	}
}
class test
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}