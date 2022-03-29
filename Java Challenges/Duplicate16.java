/* 16. Write a java program to print the duplicate characters of the string. */
import java.util.*;
public class Duplicate16 {
    public static void main(String[] args) {

        //Input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        //String to character array
        char[] a=str.toCharArray();

        //finding duplicates
        for(int i=0;i<a.length;i++)
        {
            int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && a[i]!=' ')
                {
                    count++;
                    a[j]='0';
                }
            }
            if(count>1 && a[i]!='0')
            {
                System.out.println(a[i]);
            }
        }
    }
}
