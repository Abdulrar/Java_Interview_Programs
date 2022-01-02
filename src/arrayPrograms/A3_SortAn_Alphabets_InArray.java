package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class A3_SortAn_Alphabets_InArray {

	public static void main(String[] args) {
		
		String[] s = new String[] {"s","f","e","b","d","f","a"};

		Arrays.sort(s);
		System.out.println("second latter after sort: "+s[2]);
		
		for (String string : s) {
			
			System.out.print(string+ ",");
		}
		
		System.out.println();
		System.out.println("================================");
		Arrays.sort(s, Collections.reverseOrder());
		
        for (String string : s) {
			
			System.out.print(string+ ",");
		}
		
		
	}

}
