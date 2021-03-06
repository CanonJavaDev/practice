//every thread has a name generated by jvm starts from thread 1


class MyThread extends Thread
{
	public void run()
	{
		
	}
}
class ThreadDemo
{
	public static void main(String[] args)
		{
				MyThread t = new MyThread();
				t.start();  
				MyThread t1 = new MyThread();
				t1.start();
				System.out.println(t.getName()); // thread 0
				System.out.println(t1.getName()); // thread 1
				t.setName("rithu");  // sets thread 0 ---> rithu
				System.out.println(t.getName()); // gets the new  thread name after setting it
				System.out.println(Thread.currentThread().getName()); // gets main method name which is mostly by default "main"
				Thread.currentThread().setName("rithu main");  /// setting main thread name to rithu main
				System.out.println(Thread.currentThread().getName()); // vl get the new main thread name which will be "rithu main"
				System.out.println(t.getId());  // every thread has an id we are requesting that ID here 
				System.out.println(t1.getId()); // will get second user thread Id
				System.out.println(t.isAlive()); // this command is to check whether the thread is still alive i.e running or dead
				System.out.println(Thread.activeCount()); // to check how many active threads are there.

		}
}
/*
C:\Users\Ritesh\Desktop\corejava\Sample>javac test.java

C:\Users\Ritesh\Desktop\corejava\Sample>java ThreadDemo
Thread-0
Thread-1
rithu
main
rithu main
10
11
false
1

*/