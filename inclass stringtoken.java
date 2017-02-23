// String tokenizer

import java.util.*;

class Test
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("Ritesh,Rao,Nallola,",",");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}
}