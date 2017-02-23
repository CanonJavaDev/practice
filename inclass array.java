//array 

import java.io.*;
public class test
{
	public static void main(String[] args)
		{
	/*		int data[] = new int[3];
			data[0] = 10;
			data[1] = 20;
			data[2] = 30;
System.out.println(data[0]);
System.out.println(data[1]);
System.out.println(data[2]);

for (int i: data )
{
	System.out.println(i);
}
		}
*/
		int data2[][] = new int [2][2]; // it is 2*2 (matrix) array
		data2[0][0] = 10;
		data2[0][1] = 20;
		data2[1][0] = 30;
		data2[1][1] = 40;
		
		for (int x=0;x<2 ;x++ )
		{
			for (int y=0;y<2 ;y++ )
			{
				System.out.println(data2[x][y]);
			}
		}
}
}
