//Different Threads perform different task


class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("hello world!");
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("HELLO WORLD!");
	}
}
class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("HELLO world!");
	}
}
class ThreadDemo
{
	public static void main(String[] args)
		{
							// Thread 1
				MyThread1 t = new MyThread1();
				t.start();  // invokes run method of first class
							// Thread 2
				MyThread2 t1 = new MyThread2();
				t1.start(); // invokes run method of second class
							// Thread 3
				MyThread3 t2 = new MyThread3();
				t2.start(); // invokes run method of Third class
		}
}