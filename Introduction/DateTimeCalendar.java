import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DateTimeCalendar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        String[] DAY_NAMES = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",  "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.println(DAY_NAMES[cal.get(cal.DAY_OF_WEEK)]);
    }
}
