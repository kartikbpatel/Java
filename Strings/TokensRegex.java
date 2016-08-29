import java.io.*;
import java.util.*;

public class TokensRegex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            String delimiters = "[ !,?._'@]+";
            String[] strings = s.split(delimiters);
            System.out.println(strings.length);
            for(String str : strings){
                System.out.println(str);
            }
        }
    }
}
