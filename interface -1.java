// interface - -- - contains only abstract methods

interface It1				// interface are by default abstract
{
	void m1();			// declare abstract or no 
	void m2();			// in interface methods are by default abstract and public
	void m3();
}
class Test implements It1
{
	public void m1(){System.out.println("method m1 of interface");}		// as in interface methods are public and abstract 
	public void m2(){System.out.println("method m2 of interface");}		// as we have need to maintain level of modifier i.e the reason we declared as public 
	public void m3(){System.out.println("method m3 of interface");}
	public static void main(String[] args){
	// method one to call the methods by class object
			Test t = new Test();
			t.m1();		t.m2();		t.m3();
	// method two to call the methods by using interface
			It1 i = new Test();
			i.m1();			i.m2();		i.m3();
	}
}
