// type casting overriding method
class Parent
{
	void method()
	{
		System.out.println("method of parent which is overriden");
	}
}
class Child extends Parent
{
	void method()
	{
		System.out.println("method of child which is overriding");
	}
	void method1()
	{
		System.out.println("method #2 in this class child");
	}
	public static void main(String[] args)
	{
		Parent p= new Child();
		p.method(); // As this is a method which is overriding i.e it is in both class Parent class Child it is possible!!!
		// p.method1();  this is not possible as method1() is not the method which is not in both the classes.
		// in this case we have a option called "type-casting"
		Child c = (Child)p;
		c.method1();
	}
}
/*
C:\Users\Ritesh\Desktop\corejava\Sample>javac test.java

C:\Users\Ritesh\Desktop\corejava\Sample>java Child
method of child which is overriding
method #2 in this class child
*/