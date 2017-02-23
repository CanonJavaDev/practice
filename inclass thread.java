// threads

class Test extends Thread 
{
	public void run()
	{
		for (int i=0;i<6 ;i++ )
		{ 
			if (i==3)
			{
				try{Thread.sleep(10000);}
				catch(Exception e)
					{
						System.out.println(e);
					}
			}
		System.out.println("Hello Java");
		}
	}
}
class Main 
{
	public static void main(String[] args)
	{
		Test obj = new Test();
		obj.start();
	}
}