/*
Q20: Write a program to convert binary to decimal.
Input: 1100100
Output: 100
 */
import java.util.*;
public class BinaryToDeci20 {
    //method to convert binary to decimal number
    public int convertion(long n)
    {
        int d=0,i=0;
        long rem;
        while(n!=0)
        {
            rem=n%10;
            d=d+(int)(rem*Math.pow(2,i));
            n=n/10;
            i++;
        }
        return d;
    }
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter binary number: ");
        long num=s.nextLong();
        BinaryToDeci20 obj=new BinaryToDeci20();
        //calling the method
        int decimal=obj.convertion(num);
        System.out.println("Decimal number: ");
        System.out.println(decimal);
    }
}
