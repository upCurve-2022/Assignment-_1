/* 18. Write a java program to calculate the largest number from the given three numbers using
ternary operator. */
import java.util.*;
public class Largest18 {
    public static void main(String []args){
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1,n2,n3;
        n1=s.nextInt();
        n2=s.nextInt();
        n3=s.nextInt();
        //Evaluating largest number using ternary operator
        int lar=(n1>n2 && n1>n3)?n1:(n2>n3)?n2:n3;
        System.out.println("Largest number: "+lar);
    }
}
