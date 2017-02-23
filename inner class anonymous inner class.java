// anonymous inner class

class popcorn
{
	public void taste()
	{
		System.out.println("salty");
	}
}
class Test
{
	public static void main(String[] args)
		{
			popcorn p = new popcorn()   // anonymous inner class
			{
				 public void taste()
				{
					System.out.println("Spicy");
				}
			};
			p.taste();
			popcorn p1 = new popcorn();          // direct object calling
			p1.taste();


			popcorn p2 = new popcorn()    // anonymous inner class
			{
				public void taste()
				{
					System.out.println("Sweet");
				}
			};
			p2.taste();
					}
}