/* 13. Write a java program to count the number words in a string. */
import java.util.*;
public class NoOfWords13 {
    public static void main(String []args){
        //Input
        System.out.println("Enter text: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        //counting words in string
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            //checking for spaces
            if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
            {
                count=count+1;
            }
        }
        System.out.println("No of words:"+count);
    }
}
