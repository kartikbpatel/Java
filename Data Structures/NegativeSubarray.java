import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NegativeSubarray {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr= new int[t];

		for(int i=0;i<t;i++)
			arr[i] =sc.nextInt();
		
		int neg = 0;

		for(int i=0;i<t;i++){
			for(int j=0;j<t;j++){

				int sum=0;
				for(int k=i;k<=j;k++){
					sum += arr[k];
				}
				if(sum<0)
					neg++;
			}     
		}
		System.out.println(neg);
	}

}