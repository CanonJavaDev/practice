//overriding method
class parent
{
	void marry()
	{
		System.out.println("parent class");
	}
}
	class child extends parent
	{
		void marry()
		{
			System.out.println("child class");
		}
		public static void main(String[] args)
		{
			new child().marry();
		}
	}
