import java.io.*;

 
 class Example
{
public Example(int a, int b)
	{
		System.out.println(a+b);
	}
public Example(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
public Example(String a, String b)
	{
		System.out.println(a+b);
	}
}

class Test
{
	public static void main(String[] args)
		{
			new Example(10,20);
			new Example(10,20,30);
			new Example("Nallola","Ritesh");
		}
}