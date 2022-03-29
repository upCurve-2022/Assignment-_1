/*
Q15: Write a program to display the number in following sequence.
1, 4, 9, 25, 36, 49 ………………N
 */
import java.util.*;
public class Sequence15 {
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        int a=4,r;
        //generating sequence 1,4,9,25,36.........
        for(int i=1;i<=n;i++)
        {
            if(i==4)
            {
                continue;
            }
            r=i*i;
            System.out.print(r+" ");
        }
    }
}
