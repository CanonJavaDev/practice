//code to display the names of all files and directories

import java.io.*;

class test
{
	public static void main(String [] args)
		{
			File f = new File("C:\\Users\\Ritesh\\Desktop\\corejava\\Sample"); // comple url path of folder you want read files from
			String[] s = f.list();
			int count = 0;
			for (String s1: s )
			{
				count++;
				System.out.println(s1);
			}
			System.out.println("total no:" +count);
		}
}