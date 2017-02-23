//File I/O file reader and file writer

import java.io.*;

class test 
{
	public static void main(String[] args) throws  FileNotFoundException, IOException
	{
		FileReader fr = new FileReader("abc.txt");
		FileWriter fw = new FileWriter("abe.txt");
		int c;
		while ((c=fr.read())!=-1)
		{
			//System.out.println(c);
			fw.write(c);
		}
		fr.close();
		fw.close();
	}
}