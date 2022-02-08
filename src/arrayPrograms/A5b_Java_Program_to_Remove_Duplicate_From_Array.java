package arrayPrograms;
import java.util.*;

public class A5b_Java_Program_to_Remove_Duplicate_From_Array {

	public static void main(String[] args) {
		
		// Java Program to Remove Duplicate Elements
		// From the Array using Set
				int a[] = {5,5,5,2,6,8,6,7,5,2,8};
			
				// Function call
				removeDuplicates(a);


	}

	
	// Function to remove duplicate from array
				public static void removeDuplicates(int[] a)
				{
					LinkedHashSet<Integer> set
						= new LinkedHashSet<Integer>();

					// adding elements to LinkedHashSet
					for (int i = 0; i < a.length; i++) {
						set.add(a[i]);
					}
					
					
					// Print the elements of LinkedHashSet
					System.out.print(set);
				}
				
	
}
