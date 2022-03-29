/*
Q11: Write a program to display the number in following sequence.
4, 16, 36, 64…….N
 */
import java.util.*;
public class Sequence11 {
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        int a=4,r=1;
        //generating sequence 4,16,36,64...
        for(int i=1;i<=n;i++)
        {
            r=a*(int)Math.pow(i,2);
            System.out.print(r+" ");
        }
    }
}
