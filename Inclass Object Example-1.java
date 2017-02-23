import java.io.*;

class Example
{
//static int c = 30;
 static int count=0;
public Example()
		{
			count++;
		}
}

class Test
{
	public static void main(String[] args)
		{
			Example e = new Example();
			Example e1 = new Example();// object of class Example
			System.out.println(Example.count);
		}
}