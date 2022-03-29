/*
Q9: Write a program to reverse the number.
Input: 1234567890
Output: 0987654321
 */
import java.util.Scanner;
public class ReverseNum9 {
        public static void main(String []args){
            String rev="";
            //input
            Scanner s=new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n=s.nextInt();
            //converting int to string
            String m=String.valueOf(n);
            //reversing number
            for(int i=m.length()-1; i>=0; i--)
            {
                rev=rev+m.charAt(i);
            }

            System.out.println(rev);
        }
    }
