/*  20. Write a java program to replace ‘a’ with ‘$’ in the following String
“I am always ready to learn although I do not always like being taught.”  */
public class Replace20 {
    public static void main(String []args){
        String s="I am always ready to learn although I do not always like being taught.";
        String s1="";
        for(int i=0;i<s.length();i++){
            //checking if character is 'a' or not
            if(s.charAt(i)=='a'){
                s1=s1+'$';
            }
            //if character is not 'a' assigning actual character
            else{
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
