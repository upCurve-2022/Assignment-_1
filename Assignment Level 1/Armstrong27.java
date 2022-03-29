/*
Q27: Write a program to check Armstrong Number for 3 digit number.
 */
import java.util.*;
public class Armstrong27 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        int m=n,d,r=0;
        //checking Armstrong or not
        while(m!=0)
        {
            d=m%10;
            r=r+(d*d*d);
            m=m/10;
        }
        if(n==r)
        {
            System.out.println(n +" is a Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }
    }
}
