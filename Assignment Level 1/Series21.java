/*
Q21: Write the program to print below mentioned series.
1, -2, 6, -15, 31, -56 ………….. N
 */
import java.util.*;
public class Series21 {
    public static void main(String[] args) {
        //input
        Scanner s = new Scanner(System.in);
        System.out.println("Input: ");
        int n = s.nextInt();
        int num = 1;
        //generating series 1,-2,6,-15....
        if (n == 1) {
            System.out.print(num);
        } else {
            System.out.print(num + " ");
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    num = num + (i * i);
                    System.out.print(num + " ");
                } else {
                    num = num + (i * i);
                    System.out.print("-" + num + " ");
                }
            }
        }
    }
}
