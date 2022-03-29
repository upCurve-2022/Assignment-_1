/*
Q3: Write a simple Program to calculate the Simple Interest.
 */
import java.util.*;
public class SimpleInterest {
    public static void main(String []args){
        float A,P,r,t;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter principle amount,interest rate and time(in years)");
        //input
        P=s.nextFloat();
        r=s.nextFloat();
        t=s.nextFloat();
        //simple interest
        A=(P*t*r)/100;
        //output
        System.out.println("Simple Interest "+A);
    }
}
