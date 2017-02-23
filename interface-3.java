//interface inheritance and class interface implementation

interface It1
{
	void m1();
}
interface It2 extends It1  // interface has inheritance option 
{
	void m2();
}
interface It3 extends It1, It2  // interface can extends one or more interfaces at a time
{
	void m3();
}
class Test1 implements It1, It2 // class can implement one or more interfaces at a time.
{
	public void m1(){System.out.println("Class test1 implements It1");}
	public void m2(){System.out.println("Class test1 implements It2");}
}
class Test2 extends Test1 implements It3 // class can extend another class and implement interface at a same time.
{
	public void m3(){System.out.println("Class test2 implements It3");}
	public static void main(String[] args){
					Test2 t = new Test2();
					t.m1();	t.m2(); t.m3();
	}
}

/*
C:\Users\Ritesh\Desktop\corejava\Sample>javac test.java

C:\Users\Ritesh\Desktop\corejava\Sample>java Test2
Class test1 implements It1
Class test1 implements It2
Class test2 implements It3

*/