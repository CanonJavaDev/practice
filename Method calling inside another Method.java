//method calling inisde another method
class test 
{
	void m1()
	{
		test.m2();
		System.out.println("------------method one");
		m3();
	}
	static void m2()
	{
		System.out.println("method two");
	}
	void m3()
	{
		System.out.println("-------------------method three");
	}
	public static void main(String[] args) 
	{
		System.out.println("Method calling inside another Method");
		test t =  new test();
		t.m1();
	}
}
