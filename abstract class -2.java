// abstract class -1 
abstract class Parent
{
	abstract void m1();
	abstract void m2();
	 abstract void m3();
}
class Child extends Parent
{
	void m1(){System.out.println("method I");}
	void m2(){System.out.println("method II");}
	void m3(){
									System.out.println("method III");
								   }
	public static void main(String[] args)
	{
		Child c = new Child(); // Child class object
		c.m1(); c.m2(); c.m3();
		Parent p = new Child(); // Parent class Object 
		p.m1(); p.m2(); p.m3();
	}
}