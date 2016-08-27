import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String[] ary = A.split("");
        int l = A.length();
        String flag = "Yes";
        
        for(int i=1;i<=l/2;i++){
            if(ary[i].compareTo(ary[l--])!=0){
                flag="No";
                break;
            }
        }
           
        System.out.println(flag);
    }
}
