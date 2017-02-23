// Instance Block and Static Block in inheritance
class parent
{
	{
		System.out.println("parent instance block");
	}
	parent ()
	{
		System.out.println("parent 0-arg cons");
	}
	static {
		System.out.println("parent static block");
	}
}
class child extends parent
{
	{
		System.out.println("child instance block");
	}
	static {
		System.out.println("child static block");
	}
	child ()
	{
		this(10); // super and this cannot be in the same constructor 
		System.out.println("child 0-arg cons");
	}
	child (int a)
	{
		super();
		System.out.println("child 1-arg cons");
	}	
		public static void main(String[] args)
	{
			new child();
		}
}