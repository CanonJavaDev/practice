//Based on all class Elements Example
class Test
{
	 int a=10; // instance variables
	 static int b=20; // static variables
	 void m1(int a )  //instance method
	{
		 System.out.println("Instance Method");
	 }
		static void m2(String str) // static method
		{ 
				System.out.println("Static Method");
		}
	Test( )  // constructor
	{
		System.out.println("0-arg constructor");
		}
		
	Test(int a) // constructor 1-arg
	{
		System.out.println("1-arg constructor");
	}         
		{ 
				System.out.println("Instance Block");
		}
		
		static{ 
				System.out.println("Static Block");
		}
	public static void main(String[] args) 
	{
		 Test t =new Test();   // instance, constructor
		 Test t1 =new Test(10);
		 t.m1(10);  //m1 method
		 Test.m2("rithu");
	}

}

/*
		C:\Users\Ritesh\Desktop\corejava\Sample>java Test
		Static Block
		Instance Block
		0-arg constructor
		Instance Block
		1-arg constructor
		Instance Method
		Static Method
*/