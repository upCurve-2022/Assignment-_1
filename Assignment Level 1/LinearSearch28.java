/*
Q28: Write the Program to check if the value is present in the array(Linear Search).
 */
import java.util.*;
public class LinearSearch28 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n=s.nextInt();
        int[] a=new int[n];
        int i,c=0;
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter the key element: ");
        int key=s.nextInt();
        //Implementing linear search
        for(i=0;i<n;i++)
        {
            if(key==a[i])
            {
                c=c+1;
                break;}
        }if(c==1)
            System.out.println(key +" is present in the array at "+(i+1)+" position");
        else
            System.out.println(key +" is not present in the array");
    }
}
