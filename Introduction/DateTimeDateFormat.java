import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DateTimeDateFormat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        String inputDate = day+"/"+month+"/"+year;
        
        SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        try{   
           DateFormat df2 = new SimpleDateFormat("EEEE");
           System.out.println(df2.format(df1.parse(inputDate)).toString().toUpperCase());
       }catch(Exception e){}
       
   }
}
