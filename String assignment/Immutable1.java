/* Write a program to prove String is immutable.*/
public class Immutable1 {
    public static void main(String []args){
        String str1="java";
        System.out.println("Value of str1: "+str1);
        str1.concat("program");//concatenating
        System.out.println("Value of str1 after concatenation: "+str1);//prints only "java"
        String str2=str1.concat("program");
        System.out.println("Value of str2 after concatenating and assigning it to str2: "+str2);//prints "javaprogram"
    }
}
