/* 7. Write a java program to calculate the average value of the array elements. */
import java.util.*;
public class AvgOfArray7 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the  elements: ");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int sum=0;
        float avg;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        avg=(float)sum/n;
        System.out.println("Average: "+avg);
    }
}
