//Printing Anonymous Inner Class name 

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
		System.out.println(p.getClass().getName()); // requesting to print name of first anonymous class
		p1.taste();
		System.out.println(p1.getClass().getName()); // class name for p1 
		p2.taste();
		System.out.println(p2.getClass().getName()); // requesting to print name of second anonymous classs
	}
}


/*output 
Spicy
Test$1
Salty
Popcorn
Sweet
Test$2
*/