// Thread arguments concept

class MyThread extends Thread
{
	public void run()
		{
			for (int i=0;i<=5 ;i++ )
			{
				System.out.println("0-arg method");
			}
		}
	public void run(int a)
		{
			for (int i=0;i<=5 ;i++ )
			{
				System.out.println("1-arg method");
			}
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

// " JVM ALWAYS CALLS 0-ARG METHOD" 
/*
C:\Users\Ritesh\Desktop\corejava\Sample>java ThreadDemo
main thread
main thread
main thread
main thread
main thread
main thread
0-arg method
0-arg method
0-arg method
0-arg method
0-arg method
0-arg method

*/