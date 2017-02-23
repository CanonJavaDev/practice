//E-H

class Test
{
	public static void main(String[] args)
	{
		int a=0,b=1,c;
		try{c=b/a;}
		catch(ArithmeticException e){System.out.println(e);}
		System.out.println("continue");
	}
}