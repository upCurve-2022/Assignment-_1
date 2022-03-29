/*  19. Write a java program to check whether given number is an ugly number.
Note: In number system, ugly numbers are positive numbers whose only prime factors are
2,3,5. */
import java.util.*;
public class UglyNum19 {
    //Divide with greatest power of a number
    int divide(int n,int i){
        while(n%i==0){
            n=n/i;
        }
        return n;
    }
    //checking whether number is ugly or not
    boolean ugly(int n){
        n=divide(n,2);
        n=divide(n,3);
        n=divide(n,5);
        return (n==1)? true: false;
    }
    public static void main(String []args){
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        int m=n;
        //creating an object for class
        UglyNum19 obj=new UglyNum19();
        //calling method ugly in if block
        if(obj.ugly(n)){
            System.out.println(m+" is an ugly number");
        }
        else{
            System.out.println(m+" is not an ugly number");
        }
    }
}
