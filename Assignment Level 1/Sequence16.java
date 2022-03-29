/*
Q16: Write a program to display the number in following sequence.
1, 5, 13, 29, 49, 77 ………….. N
 */
import java.util.*;
public class Sequence16 {
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        int r=1;
        //generating sequence 1,5,13,29,49....
        System.out.print(r+" ");
        for(int i=0;i<n+2;i++)
        {  if(i%3==0)
        {
            continue;
        }
            r=r+(4*i);
            System.out.print(r+" ");

        }
    }
}
