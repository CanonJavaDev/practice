import java.io.*;

class Example
{
int a = 10;
int b = 20;
static int c = 30;
static int d = 40;
public int add() // method add
	{
	return a+b;
	}
	public static int sub() //static method sub
	{
		return d-c;
	}
}

class Test
{
	public static void main(String[] args)
		{
			Example e = new Example();  // object of class Example
			System.out.println(e.add());
			System.out.println(e.sub());
		}
}