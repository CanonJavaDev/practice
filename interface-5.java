//interface can be also declared inside a class

class A
{
	interface It1
	{
		void m1();
	}
}
class Test implements A.It1	// implementing interface inside the class A
{
	public void m1(){System.out.println("Interface inside a class");}
	public static void main(String[] args){
																	Test t = new Test();
																	t.m1();
																	}
}