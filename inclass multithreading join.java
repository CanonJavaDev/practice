// thread join

class Join extends Thread
{
	public void run(){
	for (int i=0;i<=5 ;i++ )
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println(i);
	}
	}
}

class Join1
{
	public static void main(String[] args){
	Join j1 = new Join();
	Join j2 = new Join();
	j2.setPriority(10);
	Join j3 = new Join();
	j1.start();
	j2.start();
	try
	{
		j2.join();
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	j3.start();
	}
}