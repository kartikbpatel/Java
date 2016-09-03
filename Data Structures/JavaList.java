import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> al = new ArrayList<Integer>();

		for(int i=0;i<n;i++) al.add(sc.nextInt());

			int q = sc.nextInt();

		for(int i=0;i<q;i++){
			String str = sc.next();
			int x = sc.nextInt();

			if(str.equals("Insert")){
				int y = sc.nextInt();
				al.add(x,y);
			}
			else
				al.remove(x);
		}

		for(Integer i:al) System.out.print(i+" ");
	}
}
