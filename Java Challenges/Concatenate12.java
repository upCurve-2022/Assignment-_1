/* 12. Write a java program to concatenate two strings. */
import java.util.*;
public class Concatenate12 {
    public static void main(String []args){
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1=s.nextLine();
        System.out.println("Enter String 2: ");
        String str2=s.nextLine();

        //Concatinating 2 strings using addition operator
        String str3=str1+str2;

        System.out.println(str3);
    }
}
