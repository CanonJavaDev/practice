// inner class -- local inner class
class OuterLocal
{
	private int a=10;
	public void display(){
		class InnerLocal
			{
				public void m1(){
				System.out.println(a);}
			}
				InnerLocal il = new InnerLocal();
				il.m1();
											}

}
class test
{
	public static void main(String[] args)
	{
		OuterLocal obj = new OuterLocal();
		obj.display();
	}
}