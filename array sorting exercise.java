/*
array sorting
*/
import java.util.Arrays;
public class test {

    
  public static void main(String[] strings) {
 int[] a= {12,32,20,9,43};
 String[] s= {"r","a","b","g","h"};
   System.out.println("array before sorting"+Arrays.toString(a));
   Arrays.sort(a);
   System.out.println("array after sorting"+Arrays.toString(a));
   System.out.println("array before sorting"+Arrays.toString(s));
   Arrays.sort(s);
   System.out.println("array after sorting"+Arrays.toString(s));
}
}