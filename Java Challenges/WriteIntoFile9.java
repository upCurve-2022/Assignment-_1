/* 9. Write a java program to write a data to the file using FileOutputStream. */
import java.io.*;
import java.io.FileOutputStream;
import java.util.Scanner;
public class WriteIntoFile9 {
    public static void main(String[] args) {
        try{
            //Input
            Scanner s=new Scanner(System.in);
            System.out.println("Enter file name: ");
            String file=s.nextLine();
            System.out.println("Enter the content: ");
            String str=s.nextLine();
            byte[] b=str.getBytes();

            //Writing into file using FileOutputStream
            FileOutputStream obj=new FileOutputStream(file);
            obj.write(b);

            //printing the contents of file after writing
            System.out.println("contents of the file: ");
            FileReader fr =new FileReader(file);
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            obj.close();
            System.out.println("\ncontent is written");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
