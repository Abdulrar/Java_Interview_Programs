package stringPrograms;

public class A2_Program_to_Remove_Duplicate_Words_In_A_String {

	public static void main(String[] args) {
		
		
		// Declare all variables
				//String sentence, 
				
				String result = "";
				
				//Scanner sc = new Scanner(System.in);
				// Accept any sentence from User 
				//System.out.print("Enter your sentence: "); 
				//sentence = sc.nextLine().toLowerCase();  //convert to lower case				
								
				String string = "Big black bug bit a Big black dog on his Big black nose"; 
				
				// Split the given sentence to get each word as String array
				String allWords[] = string.split(" ");
				
				// Use for loop to remove duplicate words
				for(int i=0; i<allWords.length; i++) {
					for(int j=i+1; j<allWords.length; j++) {
						if(allWords[i].equals(allWords[j])) {
							allWords[j] = "remove";
						}
					}
				}
				// Convert to String
				for(String word: allWords) {
					if(word != "remove") {
						result = result + word + " ";
					}
				}
				// Display given String after removing duplicates
				System.out.println("\nSentence after removing duplicate words: " + result);

	}

}
