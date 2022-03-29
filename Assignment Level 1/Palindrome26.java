/*
Q26: Write a program to check if the given String is palindrome or not.
 */
import java.util.*;
public class Palindrome26 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.next();
        String str1="";
        int l=str.length();
        //checking for palindrome
        for(int i=l-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        if(str1.equalsIgnoreCase(str))
        {
            System.out.println(str+" is a palindrome");
        }
        else
            System.out.println(str+" is not a palindrome");
    }
}
