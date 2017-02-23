import java.io.*;

class Example
{
public static int main(int a, int b)
	{
		return a+b;
	}
public int add(int a, int b,int c)
	{
		return a+b+c;
	}
public double add(double a, double b)
	{
		return a+b;
	}
}

class Test
{
	public static void main(String[] args)
		{
			Example e = new Example();
			System.out.println(e.main(100,200));
			System.out.println(e.add(100,200,300));
			System.out.println(e.add(100.35,200.65));
		}
}