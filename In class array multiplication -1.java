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
				System.out.println("First array data"  +data2[x][y]);
			}
		}
int data3[][] = new int [2][2]; // second 2*2 (matrix) array
		data3[0][0] = 1;
		data3[0][1] = 2;
		data3[1][0] = 3;
		data3[1][1] = 4;
		
		for (int x=0;x<2 ;x++ )
		{
			for (int y=0;y<2 ;y++ )
			{
				System.out.println("Second array data--------------"  +data3[x][y]);
			}
		}
		
		// multiplication

		int data4[][] = new int [2][2]; // sum of first and second 2*2 arrays
		data4[0][0] = (data2[0][0] * data3[0][0]) + (data2[0][1] * data3[1][0]);
		data4[0][1] = (data2[0][0] * data3[0][1]) + (data2[0][1] * data3[1][1]);
		data4[1][0] = (data2[1][0] * data3[0][0]) + (data2[1][1] * data3[1][0]);
		data4[1][1] = (data2[1][0] * data3[0][1]) + (data2[1][1] * data3[1][1]);
		
		for (int x=0;x<2 ;x++ )
		{    
			for (int y=0;y<2 ;y++ )
			{
				System.out.println("Multiplication of first two arrays"  +data4[x][y]);
			}
		}

}
}
