/* Write a program to remove all occurrences of a given character from input String:
Given string : To test this string >> remove all ‘t/T’ from this string and print .
 */
import java.util.*;
public class RemoveOccur2 {
    public static void main(String[] args) {

        //Given String
        String str="To test this string";
        str=str.toLowerCase();
        char[] ch1=str.toCharArray();
        char[] ch2=new char[str.length()];
        //character to be removed
        char ch='t';

        //removing the occurrences of character
        int j=0;
        int n=str.length();
        int n1=0;
        for(int i=0;i<n;i++)
        {
            if(ch1[i]!=ch)
            {
                ch2[j]=ch1[i];
                n1++;
                j++;
            }

        }
        for(int k=0;k<n1;k++)
            System.out.print(ch2[k]);
    }
}
