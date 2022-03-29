/* 15. Write a java program to print all the permutations of String “GOD”. */
public class Permutation15 {
    //method for finding permutations
    void permutation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans+" ");
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String r=str.substring(0,i)+str.substring(i+1);
            permutation(r,ans+ch);             //recursion
        }
    }
    //main method
    public static void main(String[] args) {

        String str="GOD";
        Permutation15 p=new Permutation15();
        p.permutation(str,"");

    }

}
