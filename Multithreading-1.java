// Basic Multithreading

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
		t.start();		// to initiate run() method in thread class we use start() method

		// logics of main class thread

		for (int i=0;i<=5 ;i++ )
		{
			System.out.println("main thread ");
		}
	}
}