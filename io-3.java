// File i/o buffered reader and buffered writer
import java.io.*;

class test
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("abf.txt"));
			int c;
		while ((c=br.read())!=-1)
		{
			bw.write(c);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}