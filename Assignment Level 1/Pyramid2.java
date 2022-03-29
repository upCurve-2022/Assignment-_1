/*  Q2: Write the Java program to print the following pyramid.
Input: n=5
Output:
 *
 * *
 * * *
* * * *
* * * * *
 */
import java.util.*;
public class Pyramid2 {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Input: ");
        Scanner s = new Scanner(System.in);
        //input
        int n = s.nextInt();
        //pyramid
        for (i = 1; i <= n; i++) {
            for (j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
