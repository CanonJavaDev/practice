// second class type example of i/o-1

import java.io.*;

class test
{
	public static void main(String args[]) throws IOException, FileNotFoundException
	{
		File f = new File("abc.txt");
		System.out.println(f.exists());
	}
}