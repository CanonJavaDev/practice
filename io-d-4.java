// Read Method

import java.io.*;
class test
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		File f = new File("abc.txt");
		char[] ch = new char[(int)f.length()];
		FileReader fr = new FileReader(f);
		fr.read(ch);
		for (char ch1 : ch)
		{
			System.out.print(ch1);
		}
		System.out.print('\n');
		FileReader fr1 = new FileReader(f);
		int i = fr1.read();
		while (i != -1)
		{
			System.out.print((char)i);
			i= fr1.read();
		}
	}
}