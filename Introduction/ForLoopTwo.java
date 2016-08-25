import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ForLoopTwo {

     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);        
        int t = in.nextInt();
        int a,b,c,d;
        
        for (int i=0;i<t;i++){
         a = in.nextInt();
         b = in.nextInt();   
         c = in.nextInt();
		 d = a;
	        for (int j=0;j<c;j++){
				d += ( (int)Math.pow(2,j) * b );
				System.out.print( d + " ");
        	}
            System.out.println();
         }				
    }
}