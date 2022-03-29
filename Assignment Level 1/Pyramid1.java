/* Q1: Write the Java program to print the following pyramid.
Input: n =5
Output:
*
* *
* * *
* * * *
* * * * *
 */
import java.util.*;
public class Pyramid1 {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Input: ");
        //input
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //pyramid
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}