// runnable interface
class MyRunnable implements Runnable
{
	public void run(){
		for (int i=0;i<=3 ;i++ )
		{
		
								System.out.println("user method");
		}						}
}
class ThreadDemo
{
	public static void main(String[] args)
				{
				MyRunnable r = new MyRunnable();
				Thread t = new Thread(r);
				t.start();
for (int i=0;i<=3 ;i++ )
		{
		
								System.out.println("main thread");
		}
				}
}