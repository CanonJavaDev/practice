// addition of two numbers , substraction and multiplication
/*
for print i
C:\Users\Ritesh\Desktop\corejava\Sample>java Test
5
44
333
2222
11111
for print j
C:\Users\Ritesh\Desktop\corejava\Sample>java Test
5
54
543
5432
54321

for print "*"
C:\Users\Ritesh\Desktop\corejava\Sample>java Test
*
**
***
****
*****
*/ // 
class Test
{
	public static void main(String [] args){
		for (int i =5;i>=1 ;i-- )
		{
			for (int j=5;j>=i ;j-- )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
}
}
