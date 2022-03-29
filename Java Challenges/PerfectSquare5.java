/* 5. Write a java program to check if given number is a perfect square. */
import java.util.*;
public class PerfectSquare5 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        //Checking whether the number is perfect square or not
        int c=0;
        for(int i=1;i<n ;i++)
        {
            if(n/i==i)
            {
                c=1;
                break;
            }
        }
        if(c==1)
            System.out.println(n+" is a perfect square");
        else
            System.out.println(n+" is not a perfect square");
    }
}
