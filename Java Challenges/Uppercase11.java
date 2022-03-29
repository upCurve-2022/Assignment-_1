/* 11. Write a java program to convert the string totally to uppercase.*/
import java.util.*;
public class Uppercase11 {
    public static void main(String []args){
        //Input
        System.out.println("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        //converting String to character array
        int size=str.length();
        char arr[]=str.toCharArray();
        //converting lowercase letters to uppercase
        for(int i=0;i<size;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)((int) (arr[i]-32));
            }
        }
        //printing character array
        for(int i=0;i<size;i++)
            System.out.print(arr[i]);
    }
}
