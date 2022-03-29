/*
Q25: Write a program to reverse the String.
Input: Target
Output: tegraT
 */
import java.util.*;
public class ReverseString25 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.next();
        int l=str.length();
        //Reversing string
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

    }
}
