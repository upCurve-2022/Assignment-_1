/* 4. Write a java program to find the ASCII value of the character. */
import java.util.*;
public class Ascii4 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character: ");
        //converting character to Ascii value
        char a=s.next().charAt(0);
        System.out.println((int)a);
    }
}
