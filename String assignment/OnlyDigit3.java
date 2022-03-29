/*Write a program to check if a String contains only digits?
*/
import java.util.*;
public class OnlyDigit3 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=s.nextLine();
        //string to character array
        char[] ch=str.toCharArray();
        int n=str.length();
        //checking whether array contains only digits
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(ch[i]>='0' && ch[i]<='9')
            {
                flag=0;
            }
            else
            {
                flag=1;
                System.out.println("string does not contain only digits");
                break;
            }
        }
        if(flag==0)
            System.out.println("string contains only digits");
    }

}
