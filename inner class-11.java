// anonymous inner class implementing interface

class ThreadDemo
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable()  /*inner class*/{ 
																		public void run()
																			{
																			for (int i=0;i<5 ;i++ )
																				{
																				System.out.println("Child-1");
																				}
																			}
																				};
		Thread t = new Thread(r);
		t.start();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Main");
		}
	}
} 