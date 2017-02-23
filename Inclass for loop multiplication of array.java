import java.io.*;
public class test
{
	public static void main(String[] args)
		{
		int array1[][] = new int [2][2]; // it is 2*2 (matrix) array
		array1[0][0] = 10;
		array1[0][1] = 20;
		array1[1][0] = 30;
		array1[1][1] = 40;
		
		for (int x=0;x<2 ;x++ )
		{
			for (int y=0;y<2 ;y++ )
			{
				System.out.println("First array data \t"  +array1[x][y]);
			}
		}
int array2[][] = new int [2][2]; // second 2*2 (matrix) array
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[1][0] = 3;
		array2[1][1] = 4;
		
		for (int x=0;x<2 ;x++ )
		{
			for (int y=0;y<2 ;y++ )
			{
				System.out.println("Second array data \t"  +array2[x][y]);
			}
		}

int array3[][] = new int[2][2];

for (int i =0;i<array1.length ;i++ )
{
	for (int j=0;j<array2.length ;j++ )
	{
		for (int k = 0; k < array2.length; k++){
		 array3[i][j] =array3[i][j] + (array1[i][k]*array2[k][j]);
	}
  }
for (int x=0;x<3 ;x++ )
		{
			for (int y=0;y<3 ;y++ )
			{
				System.out.println(array3[x][y] +"\t");
			}
		}
	
}	
	
	
	
	
	
	}
}