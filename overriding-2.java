//overriding method return type must be same 
class parent
{
	int marry()  // return type
	{
		System.out.println("parent class");
		return 0;
	}
}
class child extends parent
{
		int marry() // return type
		{
			System.out.println("child class");
			return 20;
		}
		public static void main(String[] args)
		{
			new child().marry();
		}
}
