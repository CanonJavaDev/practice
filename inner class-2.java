// calling methods inside class

class Outer
{
	class Inner
	{
		public void m1()
			{
				System.out.println(" Inner Class Method");
			}
	}
	public static void main(String[] args)
	{
		new Outer().new Inner().m1(); // nameless object easy codind practice real time
		//Outer o = new Outer(); //  creating outer class object
		//Outer.Inner i = o.new Inner(); // creating inner class object with reference of outer class
		//i.m1();
	}
}