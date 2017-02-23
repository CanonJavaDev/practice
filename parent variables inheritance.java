// parent variables inheritance
//case -1
/*
class  parent
{
	int a = 10;
	int b= 20;
}
class Child extends parent
{
	int x= 100;
	int y= 200;
	void add(int i, int j)
	{
		System.out.println(i+j); // local variables
		System.out.println(x+y); // current class variables
		System.out.println(a+b); // super class variables
	}
	public static void main(String[] args)
	{
		new Child().add(1000,2000);
	}
}
*/
// case -2 if variables are same in all cases 
class  parent
{
	int a = 10;
	int b= 20;
}
class Child extends parent
{
	int a= 100;
	int b= 200;
	void add(int a, int b)
	{
		System.out.println(a+b); // local variables
		System.out.println(this.a + this.b); // current class variables
		System.out.println(super.a + super.b); // super class variables
	}
	public static void main(String[] args)
	{
		new Child().add(1000,2000);
	}
}