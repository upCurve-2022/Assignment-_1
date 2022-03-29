/*
Q22: Write the program to print below mentioned series. (Fibonacci)
1, 1, 2, 3, 5, 8, 13 ……….. N
 */
import java.util.*;
public class Fibonacci22 {
    public static void main(String[] args) {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.println("Input: ");
        int n=sc.nextInt();
        int n1=0,n2=1,n3;
        //generating fibonacci series
        if(n==0)
            System.out.print(n1);
        else
        {
            System.out.print(n1+" "+n2+" ");
            for(int i=1;i<=n;i++)
            {
                n3=n1+n2;
                System.out.print(n3+" ");
                n1=n2;
                n2=n3;
            }
        }

    }
}

