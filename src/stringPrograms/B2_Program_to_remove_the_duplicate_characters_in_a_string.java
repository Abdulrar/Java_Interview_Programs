package stringPrograms;

import java.util.Arrays;

public class B2_Program_to_remove_the_duplicate_characters_in_a_string {

	// main() method starts  
    public static void main(String[] args)   
    {   
        //String info = "javaTpoint is the best learning website";  
        String info = "j a v a T p o i n t  is t he b e s t l e a rn  i n g  w e b s i t e"; 
        //Converting string to character array  
        char str[] = info.toCharArray();  //----->char latter = info.charAt(1);  
        //Calculating length of the character array  
        int len = str.length;   
        //Calling removeDuplicates() method to remove duplicate characters  
        removeDuplicate(str, len);   
	
	
    }
		
		//Creating removeDuplicates() method to remove duplicates from array  
	    static void removeDuplicate(char str[], int length)   
	    {   
	        //Creating index variable to use it as index in the modified string   
	        int index = 0;   
	        // Traversing character array  
	        for (int i = 0; i < length; i++)   
	        {     
	            // Check whether str[i] is present before or not   
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }   	    
	            // If the character is not present before, add it to resulting string   
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
	    }   
	    
	}
