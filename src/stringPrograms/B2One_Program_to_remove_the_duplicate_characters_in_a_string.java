package stringPrograms;

import java.util.HashSet;
import java.util.Set;

public class B2One_Program_to_remove_the_duplicate_characters_in_a_string {

	// main() method starts  
    public static void main(String[] args)   
    {   
        //String info = "javaTpoint is the best learning website";  
        //String str = "j a v a T p o i n t  is t he b e s t l e a rn  i n g  w e b s i t e"; 
    	//String str = "j a v a  p p  i i";
    	//String str = "java";
    	String str = "abdul rahaman space";
    	
    	
        //Calling removeDuplicates() method to remove duplicate characters  
        System.out.println("------>In calling method: "+removeDuplicates(str));   
	
	
    }
		
		//Creating removeDuplicates() method to remove duplicates from array  
	    public static String removeDuplicates(String str)   
	    {
	    	Set<Character> set = new HashSet<>();
	    	StringBuffer sb = new StringBuffer();
	    	
	    	char[] ch = str.toCharArray();
	    	for(char c : ch) {
	    		if(!set.contains(c)) {
      				set.add(c);
      				sb.append(c);
      				}
	    	}
	    	
	    	
	    	// OR
	    	/*
              for(int i=0; i<str.length();i++) {
            	  char c = str.charAt(i);				            
            	  
            	  if(!set.contains(c)) {
      				set.add(c);
      				sb.append(c);
      				}
            	  
			}*/
			
			System.out.println("------>In set: "+set); 
	    	
	    	
			return sb.toString();   
	          
	    }   
	    
	}
