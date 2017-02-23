// this Keyword
class  Test
{
	int x, y;
	public Test(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void add(int x, int y)
   {
		System.out.println("Printing Local Variables");
		System.out.println(x+y);//Local Variables Addition
		System.out.println("Printing Instance Variables");
		System.out.println(this.x+this.y); // Instance Variables Addition 
	}
	public static void main(String[] args) 
	{
		Test t = new Test(10,20);
		Test t1=new Test(11,12);
		t.add(1000 , 2000);		
	}
}
