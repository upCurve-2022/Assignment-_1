/*  Write a program to check if the String is Empty in Java  */
import java.util.*;
public class EmptyString4 {
    public static void main(String[] args) {
        //Input
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=obj.nextLine();
        int n=0;
        //Checking whether string is empty or not
        n=str.length();
        if(n==0)
            System.out.println("string is empty");
        else
            System.out.println("string is not empty");

    }
}
