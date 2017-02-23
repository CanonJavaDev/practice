import java.io.*;
import java.util.*;

public class Solution {
	    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        char[] firstWord = a.toLowerCase().replaceAll("\\s+", "").toCharArray();
        char[] secondWord = b.toLowerCase().replaceAll("\\s+", "").toCharArray();
        
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);
        return Arrays.equals(firstWord, secondWord);
    }
	    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}