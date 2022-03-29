/* 3. A pen costs 50$ and it is been sold at a discount of 12%, Write a program to display discount
amount and selling price of the pen?*/
import java.util.*;
public class Discount3 {
    public static void main(String[] args) {
        //Input
        int c=50;
        int d=12;
        //discount
        float disc=(d*c)/100;
        System.out.println("Discount: $"+disc);
        //selling price
        float sp=c-disc;
        System.out.println("Selling price: "+sp);
    }
}
