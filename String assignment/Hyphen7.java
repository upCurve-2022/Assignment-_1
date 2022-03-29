/* Write a program to remove hyphen (-) from the given string only if it is in b/w digits .
Given string : 134-10/5566 A-block, Manyata Tech-Park */
public class Hyphen7 {
    public static void main(String []args){
        String str="134-10/5566 A-block, manyata Tech-Park";
        String str1="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-' && (str.charAt(i-1)>='0' && str.charAt(i-1)<='9') && (str.charAt(i+1)>='0' && str.charAt(i+1)<='9')){
                continue;
            }
            else{
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
