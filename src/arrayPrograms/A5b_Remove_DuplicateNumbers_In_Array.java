package arrayPrograms;

public class A5b_Remove_DuplicateNumbers_In_Array {

	public static void main(String[] args) {
		
		 int [] arr = new int [] {1, 2, 2, 2, 3, 4, 2, 7, 8, 8, 3};   
         
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  {
	                	//System.out.println(arr[j]); 
	                	
	                	arr[j] = 0;
	                	
	                }
	                     
	            }  
	        }  
	        
	        for(int data: arr) {
	        	
	        	if(data != 0) {
	        		System.out.println(data);
	        	}
	        	
	        }

	}

}
