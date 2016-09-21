import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String inStr=sc.next();
        int k=sc.nextInt();
        
        List<String> str = new ArrayList<String>();  
        
        for(int i=0;i<=inStr.length()-1 && k <= inStr.length();i++){
                str.add(inStr.substring(i,k++));
        }
        
         Collections.sort(str);

        System.out.println(str.get(0));
        System.out.println(str.get(str.size()-1));
        
    }
}