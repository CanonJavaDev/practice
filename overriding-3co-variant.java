// co-variant return type method overriding
class Animal
{
}
class Dog extends Animal
{
}
class Parent
{
	Animal marry()	//overridden method
	{
		System.out.println("animal class type method");
		Animal a = new Animal(); // Animal class object
		return a;
	}
}
class Child extends Parent
{
	Dog marry() // overriding method
	{
		System.out.println("/*Overriding*/ Dog class method return type");
		return new Dog(); // nameless object creation
	}
	public static void main (String[] arg){
								// new object to call the method

								new Child().marry(); //nameless object method calling 
																}
}
