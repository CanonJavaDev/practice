// Thread class run method can be invoked by any no of objects at a time 

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("hello world!");
	}
}
class ThreadDemo
{
	public static void main(String[] args)
		{
							//object 1
				MyThread t = new MyThread();
				t.start();
							// object 2
				MyThread t1 = new MyThread();
				t1.start();
		}
}