package stringPrograms;

public class B1_Program_to_find_the_duplicate_characters_in_a_string {

	public static void main(String[] args) {
		
		String string1 = "Big black bug bit a dog on his nose i";
		//String string1 = "B b b it a it h h e";
		//String string1 = "go to gym go";
        
		//String string1 = "Great responsibility";  
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
		
        }
        
	}
