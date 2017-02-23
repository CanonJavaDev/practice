// File I/O 

import java.io.*;
class Test
{
	public static void main(String[] args) throws IOException, FileNotFoundException // throws keyword is we have chance of exception occurs
	{
		FileInputStream fis = new FileInputStream("abc.txt"); // existing file 
		FileOutputStream fos = new FileOutputStream("abd.txt"); // generates file and writes from abc.txt
		int c;
		while ((c=fis.read())!=-1) // to search end of the file
		{
			fos.write(c); // writing 
		}
		fis.close(); //closing files
		fos.close();
	}
}