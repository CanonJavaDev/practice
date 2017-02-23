// abstract class
abstract class Parent
{
	abstract void m1();
	abstract void m2();
	 void m3(){
									System.out.println("method 3");
								   }
}
class Child extends Parent
{
	void m1(){System.out.println("method 1");}
	void m2(){System.out.println("method 2");}
	public static void main(String[] args)
	{
		Child c = new Child(); // Child class object
		c.m1(); c.m2(); c.m3();
		Parent p = new Child(); // Parent class Object 
		p.m1(); p.m2(); p.m3();
	}
}