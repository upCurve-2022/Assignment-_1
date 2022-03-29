/*
Q13: Write a program to display the number in following sequence.
1, 4, 27, 256, 3125 ………….. N
 */
import java.util.*;
public class Sequence13{
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        int r;
        //generating sequence 1,4,27,256....
        for(int i=1;i<=n;i++)
        {
            r=(int)Math.pow(i,i);
            System.out.print(r+",");
        }
    }
}
