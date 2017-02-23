//array method return type
class Test
{
	 int[] m1( )  //Method return type is array
	{
		 System.out.println("Method----1");
		 int [ ] a = {10,20,30};
		 return a;
	 }
		void m2(double[] d) // Method argument is array
		{ 
				System.out.println("Method---2");
				for (double dd : d)
				{
					System.out.println(dd);
				}
		}
	public static void main(String[] args) 
	{
		 Test t =new Test();   // instance, constructor
		 int[] x = t.m1();
		 for (int xx : x)
		 {
			 System.out.println(xx);
		 }
		 double[] d = {10.5,20.6,30.7};
		 t.m2(d);
	}

}

/*
		C:\Users\Ritesh\Desktop\corejava\Sample>java Test
		Method----1
		10
		20
		30
		Method---2
		10.5
		20.6
		30.7
*/