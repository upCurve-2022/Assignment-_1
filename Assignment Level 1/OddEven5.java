/*
Q5: Write a program to Check if the given number is odd or even.
 */
import java.util.*;
public class OddEven5 {
    public static void main(String[] args) {
        //input
        Scanner s = new Scanner(System.in);
        System.out.println("Input: ");
        int a = s.nextInt();
        //checking odd or even
        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else
            System.out.println(a + " is odd");
    }
}
