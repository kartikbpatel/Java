import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class IpAddressRegEx{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}

class myRegex{
        String zeroTo255 = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])"; 
        public String pattern =  "^" + 
            zeroTo255 + "\\." +
            zeroTo255 + "\\." + 
            zeroTo255 + "\\." + 
            zeroTo255 + "$";     
}