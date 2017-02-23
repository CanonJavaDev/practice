/*factorial program
*/
import java.util.Scanner;
public class test {

    
  public static void main(String[] strings) {
	int i,j;
		for(i=1; i<=100; i++){
		System.out.print("factors of a number "+i+ ");
		for(j=1; j<=i; j++){
			if (i%j==0)
			{
					System.out.print(" "+j);
			}
		}
	}
  }
}