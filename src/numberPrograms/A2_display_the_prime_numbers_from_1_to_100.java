package numberPrograms;

import java.util.Scanner;

public class A2_display_the_prime_numbers_from_1_to_100 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      
	      //Empty String
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      scanner.close();
	      
	      for (int i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(int j =i; j>=1; j--)
	         {
		    if(i%j==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String 
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to "+ n +" are :");
	      System.out.println(primeNumbers);	
	}

}
