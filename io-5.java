// serialization
import java.io.*;

class test
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Emp e = new Emp(111,"Ritesh" );
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("Serialization Done");
	}
}