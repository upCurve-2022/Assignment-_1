/* Write a program determine length or size of a String  */
import java.util.*;
public class Length5 {
    public static void main(String[] args) {
        //Input
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=obj.nextLine();
        char[] ch=str.toCharArray();
        //finding Size of String
        int n=0;
        for(char c:ch)
        {
            n++;
        }
        System.out.println("Length of the string: "+n);
    }
}
