package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,6,8};
		
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {

			if (a[i+1]!= a[i]+1) {
				System.out.println("Missing Number is :" + (a[i]+1));
			}
			
		}
	} 
	

}
