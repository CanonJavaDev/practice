class Test 
{
	public static void main(String[] args)
	{
		String[] s = new String[10];
	s[0] = "even";
	s[1]= "odd";
	s[2] = "even";
	s[3]= "odd";
	s[4] = "even";
		int i=0; int j=0;
		for( i=0; i<= s.length;i+=2)
		{
			System.out.println(s[i]);
		}
		for(j=1;j<=s.length;j+=2)
		{
			System.out.println(s[j]);
		}
		}
}