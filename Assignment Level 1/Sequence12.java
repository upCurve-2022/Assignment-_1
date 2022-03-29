/*
Q12: Write a program to display the number in following sequence.
-1, 2, -3, 4, -5……..N
 */
import java.util.*;
public class Sequence12 {
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        //generating sequence -1,2,-3,4,-4.....
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
            else
                System.out.print(-i +" ");
        }
    }
}
