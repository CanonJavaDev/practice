/*Floyds triangle
1
2 3
4 5 6
7 8 9 0
*/
import java.util.Scanner;

public class test {

    
  public static void main(String[] strings) {
		int rows, i, j, num=1;  
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		rows = input.nextInt();
		System.out.println("Floyds triangle");

		for(i=1; i<=rows; i++){  // rows incrementing

		for(j=1; j<=i; j++){     // printing in row
			System.out.print(num+" "); 
			num++;  // numbers incrementation
		}
		System.out.println(" "); // adds new line
		
    }
  }
}