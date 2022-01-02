package numberPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Given_Number_even_Or_Odd_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		/* When a given number is divided by '2' if remainder is '0' it is even number
		 * 
		 * When a given number is divided by '2' if remainder is not '0' it is odd number
		 * 
		 * To get remainder we user 'modulo' or 'percentile' operator 
		 * 
		 *  4%0 = 0 (remainder)
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("Enter the number");		
		Integer number = Integer.parseInt(br.readLine());
		
		// OR
		
		
		
		if(number%2 == 0) {
			System.out.println(number + " is even number");
			
		}else {
			System.out.println(number + " is odd number");
			
		}
		

	}

}
