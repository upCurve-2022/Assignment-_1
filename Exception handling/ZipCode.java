import java.util.*;
public class ZipCode {
    public static void check(int code) throws Undeliverable
    {


            //checking undeliverable zipcode
            int[] a=new int[3];
            int m=code;
            for(int i=0;i<3;i++){
                a[i]=m%10;
                m=m/10;
            }
            if (a[0]==a[1]+1 && a[1]==a[2]+1) {
                throw new Undeliverable("Sorry! Delivery is not available in your area");
            }
            else
                System.out.println("Delivery available in your area");

    }

    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Zip code: ");
        int n=s.nextInt();
        try {
            check(n);
        }
        catch(Undeliverable e){
            System.out.println("Exception occured: "+e);
        }
    }
}
