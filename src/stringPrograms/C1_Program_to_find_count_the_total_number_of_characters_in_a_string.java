package stringPrograms;

public class C1_Program_to_find_count_the_total_number_of_characters_in_a_string {

	public static void main(String[] args) {
		
		 String string = "The best of both worlds";    
	        
		 int num = 0; 
		 char[] ch = string.toCharArray();
		 for(int i=0;i<ch.length;i++) {
			 
		 //for(char c: ch) {
			if(ch[i] !=' ') {
				 num++;
			 }
		 }
		 System.out.println("Using toCharArray Total number of characters in a string: " + num);
		 
		    int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i)!= ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);  

	}

}
