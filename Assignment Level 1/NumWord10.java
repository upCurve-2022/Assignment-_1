/*
Q10: Write a program to display numbers in words.
Input: 12344
Output: One Two Three Four Four
 */
import java.util.*;
public class NumWord10 {
    public static void main(String[] args){
        String word="";
        int rev=0,count=0;
        //input
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //reversing the number
        while(n!=0){
            int a=n%10;
            count=count+1;
            rev=(rev*10)+a;
            n=n/10;
        }
        //numbers to words
       for(int i=1;i<=count;i++,rev=rev/10){
            int w=rev%10;
            switch(w) {
                case 0:
                    word = word + "zero ";
                    break;
                case 1:
                    word = word + "one ";
                    break;
                case 2:
                    word = word + "two ";
                    break;
                case 3:
                    word = word + "three ";
                    break;
                case 4:
                    word = word + "four ";
                    break;
                case 5:
                    word = word + "five ";
                    break;
                case 6:
                    word = word + "six ";
                    break;
                case 7:
                    word = word + "seven ";
                    break;
                case 8:
                    word = word + "eight ";
                    break;
                case 9:
                    word = word + "nine ";
                    break;
            }
        }
        System.out.println(word);
    }
}
