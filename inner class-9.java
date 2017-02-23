//Anonymous Inner Class

class Popcorn
{
	public void taste()
	{
		System.out.println("Salty");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Popcorn p = new Popcorn()	{public void taste(){System.out.println("Spicy");}}; // anonymous inner class 
		Popcorn p1 = new Popcorn(); 
		Popcorn p2 = new Popcorn(){	public void taste(){System.out.println("Sweet");}};

		p.taste();
		p1.taste();
		p2.taste();
	}
}