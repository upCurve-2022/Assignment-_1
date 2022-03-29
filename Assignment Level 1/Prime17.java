/*
Q17: Write a program to find the prime number between n and m.
Input: n = 12, m=15
Output: 13
 */
import java.util.*;
public class Prime17 {
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter m value: ");
        int m=s.nextInt();
        System.out.println("Enter n value: ");
        int n=s.nextInt();
        int count;
        //prime number
        for(int i=m+1;i<n;i++)
        {
            count=0;
            for(int j=2;j<=(i/2);j++)
            {
                if(i%j==0)
                {count=count+1;}
            }
            if(count==0)
                System.out.print(i+" ");

        }
    }

}
