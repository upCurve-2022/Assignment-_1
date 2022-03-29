/* 1. Write a java program to display current Date and Time.*/
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTime1 {
    public static void main(String []args){
        SimpleDateFormat form=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date d=new Date();
        System.out.println(form.format(d));
    }
}
