/*
 Write a program to demonstrate ways to compare two Strings in Java
 */
import java.util.*;
public class CompareString6 {
    public static void main(String []args){
        String str1="java";
        String str2="program";
        String str3="java";
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("different ways of comparing two strings: ");
        System.out.println("1.equals()   2.character array  3.compareTo() 4.equalsIgnoreCase() \nchoose one: ");
        int n=s.nextInt();
        switch(n)
        {
            case 1://using equals method
                if(str1.equals(str2))
                System.out.println(str1+" is equal to "+str2);
                 else
                System.out.println(str1+" is not equal to "+str2);
                break;
            case 2: //using character array
                char[] ch1=str1.toCharArray();
                char[] ch2=str3.toCharArray();
                int n1=str1.length();
                int n2=str3.length();
                int flag=0;
                if(n1==n2)
                {
                    for(int i=0;i<n1;i++)
                    {
                        if(ch1[i]==ch2[i])
                            flag=0;
                        else
                        {
                            flag=1;
                            break;
                        }
                    }
                }
                else
                    flag=1;
                if(flag==1)
                    System.out.println(str1+" not equal to "+str3);
                else
                    System.out.println(str1+" equal to "+str3);

                break;
            case 3://using compare to method
                int a=str1.compareTo(str2);
                if(a>0)
                {
                    System.out.println(str1+" is greater than "+str2);
                }
                else if(a<0)
                    System.out.println(str1+" is lesser than "+str2);
                else
                    System.out.println(str1+" is equal to "+str2);
                break;
            case 4://using equalsIgnoreCase method
                if(str1.equalsIgnoreCase(str3))
                 {
                             System.out.println(str1+" is equal to "+str3+" by ignoring cases");
                 }
                 else
                     System.out.println(str1+" is not equal to "+str3);
                 break;
            default:
                System.out.println("Enter a valid choice: ");
        }



}
    }
