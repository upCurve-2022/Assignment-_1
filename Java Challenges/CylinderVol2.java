/* 2. Write a java program to calculate the volume of the cylinder.*/
import java.util.*;
public class CylinderVol2 {
    public static void main(String []args){
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r=s.nextFloat();
        System.out.println("Enter height: ");
        float h=s.nextFloat();
        //volume
        float vol= (float) (3.14*r*r*h);
        System.out.print("Volume: "+vol);
    }
}
