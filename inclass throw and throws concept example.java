//throws Vs throw

class Test
{
	public static void main(String args[]) throws RiteshException
	{
		String r="rithu";
		if (r!="ritesh")
		{
			throw new RiteshException("String not matched");
		}
		
	}
}
class RiteshException extends Exception
{
	RiteshException(String error)
	{
		super(error);
	}
}