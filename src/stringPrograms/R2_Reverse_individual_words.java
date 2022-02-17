package stringPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class R2_Reverse_individual_words {

	public static void main(String[] args) {
		
		String str = "Hi this is my interview?";
		//String str = "Welcome to GFG";
        
        // Splitting the string based on space and reverse each part
        // and then join
        String result = Arrays.asList(str.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
 
        System.out.println(result);
        
        
        //By Using SringBuffer --> recursion (reverse method)
        System.out.println();
        System.out.println(makeReverse(str));
        
	}

	
	
	
	
	static String makeReverse(String str) {
	      StringBuffer s = new StringBuffer(str);
	      str = s.reverse().toString();
	      System.out.println("------------> inside method  :  "+str);
	      
	      String [] rev = str.split(" ");
	      StringBuffer reverse = new StringBuffer();
	      for(int i = rev.length - 1; i >= 0; i--) {
	          reverse.append(rev[i]).append(" ");
	      }
	      return reverse.toString();
	    }
	    
	}
	