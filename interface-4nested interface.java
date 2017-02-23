// nested interface

interface It1
{
	void m1();
	interface It2
	{
		void m2();
	}
}
class Test implements It1, It2
{
	public void m1(){System.out.println("interface 1");}
	public void m2(){System.out.println("interface II");}
	public static void main(String[] args){
		Test t = new Test();
		t.m1();  t.m2();
								
}
