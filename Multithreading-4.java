// We can write logics outside the run method too!!

class MyThread extends Thread
{
		public void run()
			{
				m1(); m2(); m3();
			}
		void m1()
			{
				System.out.println("m1");
			}
		void m2()
			{
				System.out.println("m2");
			}
		void m3()
			{
				System.out.println("m3");
			}
		
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		// user threaad starting code
		MyThread t = new MyThread();
		t.start();	

		for (int i=0;i<=5 ;i++ )
		{
			System.out.println("main thread ");
		}
	}
}