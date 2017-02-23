//method local inner class ---> inner class inside outer class method

class Outer
{
	public void m1()
	{
		class Inner
		{
			public void sum(int x, int y)
			{
				System.out.println("sum is  " +(x+y));
			}// end of sum method
		} // end of inner class
			Inner i = new Inner();
			i.sum(10,20);
			i.sum(100,200);
			i.sum(1000,2000);
		
		}// end of m1 method
		public static void main(String[] args)
			{
				Outer o = new Outer();
				o.m1();
			}// end of main
}// end of main class