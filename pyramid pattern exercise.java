/*pyramid pattern
12345
1234
123
12
1
*/
import java.util.Scanner;
public class test {

    
  public  static void main(String[] strings) {
	int i,j;
		for(i=5; i>0; i--){

		for(j=1; j<=i; j++){
			System.out.print(j);
		}
		System.out.println(" ");
		}
  }
}