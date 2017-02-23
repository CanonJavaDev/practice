import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max = -63, currI = 0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for (int x=0; x<4; x++){
            for (int y=0; y<4; y++){
                currI = arr[x][y]   + arr[x][y+1] +   arr[x][y+2] 
                    + arr[x+1][y+1] 
                    + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
                max = Math.max(currI, max);
            }
        }
        System.out.print(max);
    }
}