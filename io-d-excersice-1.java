// Write a program to merge data from 2 Files to 3rd File

import java.io.*;

class FileMerge
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		PrintWriter pw = new PrintWriter("file3.txt");
									// reading from first file
	BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
	String line = br.readLine();
	while (line != null)
	{
		pw.println(line); // print onto the console
		line= br.readLine();
	}
								// reading fro second file  
	BufferedReader br1 = new BufferedReader(new FileReader("file2.txt"));
	line = br1.readLine();
	while (line != null)
	{
		pw.println(line); // print onto the console
		line= br1.readLine();
	}
	pw.flush();
	br.close();
	pw.close();
	}
}