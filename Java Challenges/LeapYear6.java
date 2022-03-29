/* 6. Write a java program to check if input year is leap year or not. */
import java.util.*;
public class LeapYear6 {
    public static void main(String []args){
        //Input
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //leap year or not
        if((n%400==0)||(n%4==0 && n%100!=0))
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
