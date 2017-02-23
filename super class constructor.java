// super class constructor
class parent
{
	parent ()
	{
		System.out.println("parent 0-arg cons");
	}
}
class child extends parent
{
	child ()
	{
		this(10); // super and this cannot be in the same constructor 
		System.out.println("child 0-arg cons");
	}
	child (int a)
	{
		super();  
									// super and this keyword must be in first line of constructor. 
									// if there is no super keyword compiler generates super keyword at first line of constructor 
		System.out.println("child 1-arg cons");
	}	
		public static void main(String[] args)
	{
			new child();
		}
}