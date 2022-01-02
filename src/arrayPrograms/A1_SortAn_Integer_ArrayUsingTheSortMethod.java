package arrayPrograms;

import java.util.Arrays;

public class A1_SortAn_Integer_ArrayUsingTheSortMethod {

	public static void main(String[] args) {
		
		
		//***  Using the sort() Method  ***// 
		
		//defining an array of integer type   
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
		
		Arrays.sort(array);   
		
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{
			System.out.print(array[i]+" ");
		//System.out.println(array[i]);   
		}   
		
		
		
		System.out.println("Elements of array sorted in decending order: ");  
		for (int i = array.length-1; i >=0; i--)   
		{       
		System.out.println(array[i]);   
		} 
		
	}  

}
