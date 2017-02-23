// Adapter class

interface It1
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}
class X implements It1 // contains empty implementation of the interface
{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
}
/*class Test implements It1 // we can implement all methods by implements It1 or look below for another option
{
	public void m1(){System.out.println("m1");}
	public void m2(){System.out.println("m2");}
	public void m3(){System.out.println("m3");}
	public void m4(){System.out.println("m4");}

	public void m5(){System.out.println("m5");}
	public static void main(String [] args){
	Test t = new Test();
	t.m1();t.m2();t.m3();t.m4();t.m5();
	}*/ 
class Test extends X				// In this class we can only override the method which is not necessary 
{
					public void m2(){System.out.println("m2 method");}
					public static void main(String[] args){
																				new Test().m2();
																				}
}

