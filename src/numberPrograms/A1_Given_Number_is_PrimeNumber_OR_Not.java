package numberPrograms;

import java.util.Scanner;

public class A1_Given_Number_is_PrimeNumber_OR_Not {

	public static void main(String[] args) {
		
		/*
		 * A number is a prime if it is divisible by 1 and itself  other wise its not a prime num
		 * 
		 * Ex:- 13 --> Has only two factors - itself and 1. So it is a prime number 
		 * 
		 * to check logic Ex:- 8 --> Exclude 1 and 8     
		 *                       --> Staring 2 up to 7 	check whether 8 is divided by 2,3,4,5,6,7	
		 *                           If 8 is divided  by (2,3,4,5,6,7) any one it is not prime num
		 */

		boolean prime = true ;
		
		System.out.println("Enter the number to check prime or not");	
		
		Scanner sc = new Scanner(System.in); // To take the input from command line 
		Integer num = sc.nextInt(); //Read the num from console 
			
		for (int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				prime = false;
		        break;
			}
		}
		
		if(prime == true) {
			System.out.println("Given number is a prime number");
		}else {
			System.out.println("Given number is not a prime number");
		}
		
	}

}
