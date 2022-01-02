package stringPrograms;

public class A1_Program_to_find_the_duplicate_words_in_a_string {

	public static void main(String[] args) {
		
		String string = "Big black bug bit bit bit a dog on his nose black";
		//String string = "B b b it a it h h e";
		//String string = "go to gym go";   
        int count;  
          
        //Converts the string into lowercase  
        string = string.toLowerCase();  
          
        //Split the string into words using built-in function  
        String words[] = string.split(" ");    //Note: ****  Work only on words only not charecter **** //
          
        System.out.println("Duplicate words in a given string : ");   
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    count++;  
                    //Set words[j] to 0 to avoid printing visited word  
                    words[j] = "0";  
                }  
            }  
              
            //Displays the duplicate word if count is greater than 1  
            if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }
        	
        //System.out.println("No duplicate words");
        }
        
	}
