// File I/O BufferedInput Stream and BufferedOutputStream

import java.io.*;

class test
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		BufferedInputStream bir = new BufferedInputStream(new FileInputStream("abc.txt"));
		BufferedOutputStream bow = new BufferedOutputStream(new FileOutputStream("abg.txt")); // file name must be declared as " file.txt"

	int c;
	while ((c=bir.read())!=-1) // end of while checking
	{
		System.out.print((char)c);
		bow.write(c);
	}
	bir.close();
	bow.close();
	}
}