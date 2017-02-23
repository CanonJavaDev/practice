
// Example for "Instance and Static variables and methods"
class Test  
{
	static int a=10;
	static int c =90;
	int x = 20;
	int y = 30;
	public static void main(String[] args) 
	{
		Test t = new Test(); // creating object for using Instance variables or calling Instance methods.
		int b = Test.a + Test.c;
		System.out.println("Result of addition is = "+b);
		Test.sub1(); // Calling static method
		t.mul(); // Calling Instance method
	}
	static void sub1() // Static Method
	{
		Test t = new Test();
	 int d = t.x - t.y;
		System.out.println("Substracted result is = "+d);
	}
	void mul()  // Instance method
	{
		double z = x*y;
		System.out.println("Multiplied no ="+z);
	}
}
