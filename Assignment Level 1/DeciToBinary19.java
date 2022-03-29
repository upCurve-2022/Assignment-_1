/*
Q19: Write a program to convert decimal number to binary.
Input: 100
Output: 1100100
 */
import java.util.*;
public class DeciToBinary19 {
    //method to convert decimal number to binary
    public void convertion(int n)
    {
        int[] a=new int[30];
        int i=0;
        while(n>0)
        {
            a[i]=n%2;
            n=n/2;
            i++;
        }
        for(i=i-1;i>=0;i--)
            System.out.print(a[i]);
    }
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int num=s.nextInt();
        DeciToBinary19 obj=new DeciToBinary19();
        System.out.println("Binary number: ");
        //calling the method
        obj.convertion(num);
    }
}
