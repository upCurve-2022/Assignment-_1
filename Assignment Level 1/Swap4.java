/*
Q4: (a) Write a program to swap 2 numbers.
 (b) Write a program to swap 3 numbers.
 */
import java.util.*;
public class Swap4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input to swap 2 numbers
        System.out.println("Enter two values: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("a= " + a + ", b= " + b);
        System.out.println("After Swaping: ");
        //swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= " + a + ", b= " + b);
        //input to swap 3 numbers
        System.out.println("Enter three values: ");
         a = s.nextInt();
         b = s.nextInt();
        int c=s.nextInt();
        System.out.println("a= " + a + ", b= " + b+", c= "+c);
        System.out.println("After Swaping: ");
        //swap
        temp = a;
        a = b;
        b = c;
        c=temp;
        System.out.println("a= " + a + ", b= " + b+", c= "+c);
    }
}