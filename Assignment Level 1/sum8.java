/*
Q8: Write a program to calculate the sum of
(a) Odd numbers from 1- N.
(b) Even numbers from 0 – N.
Example:
Input: N= 10
Even sum = 30 (sum of even numbers 0,2,4,6,8,10)
Odd sum =25 (sum of odd numbers 1,3,5,7,9)
 */
import java.util.*;
public class sum8 {
    public static void main(String []args){
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int od=0,ev=0;
        int n=s.nextInt();
        //sum of even and odd
        for(int i=0;i<=n;i++){
            if(i%2==0){
                //sum of even numbers
                ev=ev+i;
;            }
            else{
                //sum of odd numbers
                od=od+i;
            }
        }
        System.out.println("Even Sum"+ev);
        System.out.println("Odd Sum"+od);
    }
}
