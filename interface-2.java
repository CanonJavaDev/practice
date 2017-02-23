//interface ---- - abstract and normal class

interface It1
{
	void m1();
	void m2();
	void m3();
}
abstract class Test1 implements It1
{
	public void m1(){System.out.println("method implemented in Test1 class ");}
}
abstract class Test2 extends Test1			/// this class is  abstract class because there are some more methods to be implemented 
{
	public void m2(){System.out.println("method implemented in Test2 class ");}
}
class Test3 extends Test2				// This is not an abstract class because we finally completed methods overrriding in this class 
{
	public void m3(){System.out.println("method 3 finally overriden");}
			public static void main(String[] args){
														Test3 t = new Test3();
														t.m1(); t.m2();	t.m3();
													}
}
