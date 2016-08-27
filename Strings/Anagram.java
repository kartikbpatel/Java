import java.io.*;
import java.util.*;

public class Anagram {
	static boolean isAnagram(String a, String b) {

        // Complete the function by writing your code here.
		if(a.length()==b.length()){

			char[] a_ary = a.toLowerCase().toCharArray(); 
			char[] b_ary = b.toLowerCase().toCharArray(); 

			Arrays.sort(a_ary);
			Arrays.sort(b_ary);

			for(int i=0;i<a.length();i++){

				if ((int)a_ary[i] != (int)b_ary[i])
					return false;
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}