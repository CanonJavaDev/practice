// Writer Method

import java.io.*;
class test
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(100);
		fw.write("ragon \n Is a Beast" );
		fw.write('\n');
		char[] ch1 = {'a' ,'b' ,'c'};
		fw.write(ch1);
		
		fw.flush(); // making sure we have writen everything
		fw.close();
	}
}