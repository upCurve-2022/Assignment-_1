/* 8. Write a java program to create a file in java. */
import java.io.File;
import java.io.IOException;
public class File8 {
    public static void main(String[] args)
    {
        try {
            //Creating file named 'first'
            File f = new File("first");
            if (f.createNewFile()) {
                System.out.println(f.getName()+" file is created");
            } else
                System.out.println("File already exists");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
