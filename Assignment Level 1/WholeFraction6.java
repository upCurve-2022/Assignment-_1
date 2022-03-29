/*
Q6: Write a program to separate the Whole number and Fraction value from double and store
it in separate variables.
Example:
Input: 10.25
Output: 10 25
 */
import java.util.*;
public class WholeFraction6 {
    public static void main(String []args){
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a double: ");
        double a=s.nextDouble();
        //whole
        int w=(int)a;
        //fraction
        double f=a-w;
        System.out.println(w+" "+f);
    }
}
