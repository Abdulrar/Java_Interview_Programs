package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class A3b_SortAn_Alphabets_Char_InArray {

	public static void main(String[] args) {
		

		char[] s = new char[] {'s','d','f','g','h','j','k'};
		
		Arrays.sort(s);
		System.out.println("second latter after sort: "+s[2]);
		
		for (char string : s) {
			
			System.out.print(string+ ",");
		}
		
		System.out.println();
		System.out.println("================================");
		
		
		 for(int i=s.length-1; i>=0; i--) {
	        	
	        	System.out.println("------------->"+s[i]);
	        }
		
	/*	
		Arrays.sort(s);
		
        for (char string : s) {
			
			System.out.print(string+ ",");
		}
		
     */  
		
	}

}
