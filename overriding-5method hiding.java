// method hiding

class Parent
{
	static void method(){
											System.out.println("Method of parent class");
									}
}
class Child extends Parent
{
	static void method(){ // In java static method over riding is not possible
										System.out.println("method of class overriding");
										}
	public static void main(String[] args)
	{
	Parent p= new Child();
	p.method();
	}
}

//   O/p:-- method of parent class coouz static method  cannot be overriden