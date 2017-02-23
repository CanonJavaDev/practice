// Difference btw t.start(); && t.run();

class MyThread extends Thread
{
	public void run()
		{
			for (int i=0;i<=5 ;i++ )
			{
				System.out.println("user method");
			}
		}
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		// user threaad starting code
		MyThread t = new MyThread();
		//t.start();		// When thread start executed user thread is created
		t.run();  // run() will execute normal as a method no thread is created.
		// logics of main class thread

		for (int i=0;i<=5 ;i++ )
		{
			System.out.println("main thread ");
		}
	}
}