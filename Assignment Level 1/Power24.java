/*
Q24: Write the program to find the X to the power of n. (Without using inbuilt function)
Input: X = 2, n = 5
Output: 32
 */
import java.util.*;
public class Power24 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter X value: ");
        int X=s.nextInt();
        System.out.println("Enter n value: ");
        int n=s.nextInt();
        //calculating power
        int pro=1;
        for(int i=1;i<=n;i++)
        {
            pro=pro*X;
        }
        System.out.println(pro);
    }
}
