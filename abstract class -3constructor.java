// abstract class Constructor, Instance and Static Blocks
abstract class Parent
{
	Parent(){
	System.out.println("Abstract class constructor");
	}
	{
		System.out.println("Abstract classInstance block");
	}
	static {
		System.out.println("Abstract class Static block");
	}
	abstract void m1(); //method
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Child class constructor");
	}
	void m1(){System.out.println("abstract class method ");}
public static void main(String[] args){
new Child().m1();
}}

/*
C:\Users\Ritesh\Desktop\corejava\Sample>java Child
Abstract class Static block
Abstract classInstance block
Abstract class constructor
Child class constructor
abstract class method*/