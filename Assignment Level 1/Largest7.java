/*
Q7: Write a Program to find the largest and second largest of 3 numbers.
Input: 10 5 25
Output: largest: 25
 Second largest: 10
 */
import java.util.*;
public class Largest7 {
    public static void main(String []args){
        //input
        Scanner s = new Scanner(System.in);
        int a,b,c,lar=0,slar=0;
        System.out.println("Enter three values: ");
         a = s.nextInt();
         b = s.nextInt();
         c=s.nextInt();
         //checking for largest number & second largest number
        if(a>b && a>c){
            lar=a;
            if(b>c)
                slar=b;
            else
                slar=c;
        }
        else if(b>a && b>c){
            lar=b;
            if(a>c)
                slar=a;
            else
                slar=c;
        }
        else if(c>a && c>b){
            lar=c;
            if(a>b)
                slar=a;
            else
                slar=b;
        }
        System.out.println("largest= " + lar + "\nSecond largest= " + slar);

    }
}
