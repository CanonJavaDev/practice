// packages
package firstpackage;

class Test
{
	public void m1()
	{
		System.out.println("method -1 in first package");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
		System.out.println("my first package");
		
	}
}