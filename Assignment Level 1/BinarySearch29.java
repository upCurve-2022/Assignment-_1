/*
Q29: Write a program to check if the value is present in the sorted array (Binary Search).
 */
import java.util.*;
public class BinarySearch29 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n=s.nextInt();
        int i,mid,first=0,last=n-1;
        int[] a=new int[n];
        System.out.println("Enter the array elements in an order: ");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter the key: ");
        int key=s.nextInt();
        //Implementing binary search
        while(first<=last) {
            mid = (first+last)/ 2;
            if (a[mid] == key) {
                System.out.println(key +" is present in the array at "+ (mid+1) + " position");
                break;
            }
            else if (key < a[mid]) {
                last=mid-1;}
            else
                first=mid+1;
        }
        if(first>last)
            System.out.println(key+" is not present in the array");
    }
}
