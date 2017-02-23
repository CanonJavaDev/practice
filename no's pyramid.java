/*
pyramid no's
*/
import java.util.Scanner;
public class test {

    
  public static void main(String[] strings) {
		int i,j,n,s,x;
		System.out.print ("Input number of rows : ");
	Scanner in = new Scanner(System.in);
			    n = in.nextInt();

   s=n; // used for spaces
    for(i=1;i<=n;i++)
   {
   for(x=s;x!=0;x--) 
    {
   System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
     System.out.print(i+" ");
     }
	System.out.println();
  s--;
   }
}
}