/*
Q18: Write a program to find the factorial of a given number.
 */
import java.util.*;
public class Factorial18 {
    public static void main(String[] args){
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        int m=1;
        //factorial
        for(int i=1;i<=n;i++){
            m=m*i;
        }
        System.out.println(m);
    }
}
