// Write a program to perform file merge operation where merging should be done line by line alternatively.
import java.io.*;

class FileMerge2
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		PrintWriter pw = new PrintWriter("file4.txt");
									// reading from first file
	BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
									// reading fro second file  ise
	BufferedReader br1 = new BufferedReader(new FileReader("file2.txt"));
	String line1 = br.readLine();
	String line2 = br1.readLine();
	while (line1 != null || line2 != null)
	{
		if(line1!=null)
			{
				pw.println(line1); // print onto the console
				line1= br.readLine();
			}
			
		if(line2!=null)
			{
				pw.println(line2); // print onto the console
				line2= br1.readLine();
			}		}
	pw.flush();
	br1.close();
	br.close();
	pw.close();
	}
}