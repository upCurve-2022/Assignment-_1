/* 14. Write a java program to read two string user input and check if first contains the second. */
import java.util.*;
public class FirstConSecond14 {

    //method for checking whether string 1 contains string 2
    void isSubString(String s1,String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int flag=0;

        //loop through each char of s1
        for (int i = 0; i < n1; i++) {
            int j;
            //loop through each char of s2
            for (j = 0; j < n2; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == n2) {
                flag=1;
                System.out.println(s1+" contains "+s2);
            }
        }
        if(flag==0){
            System.out.println(s1+" does not contains "+s2);
        }
    }
    public static void main(String []args){
        //Input
        System.out.println("Enter string 1: ");
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        System.out.println("Enter string 2: ");
        String str2=s.nextLine();
        //creating object and calling isSubString function
        FirstConSecond14 obj=new FirstConSecond14();
        obj.isSubString(str1,str2);
    }
}
