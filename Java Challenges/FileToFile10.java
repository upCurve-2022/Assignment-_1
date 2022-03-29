/* 10. Write a java program to copy data from one file to another file. */
import java.io.IOException;
import java.io.*;
import java.util.*;
public class FileToFile10 {
    public static void main(String[] args) {
        //Input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter source file: ");
        String source=s.nextLine();
        System.out.println("Enter destination file: ");
        String dest=s.nextLine();

        try{
            //Reading data from source file and writing in destination file
            FileReader fin=new FileReader(source);
            FileWriter fout=new FileWriter(dest);
            int c;
            while((c=fin.read())!=-1)
            {
                fout.write(c);
            }
            System.out.println("Data Copied");
            fin.close();
            fout.close();
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
