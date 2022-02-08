package stringPrograms;

public class C2_Program_to_find_count_the_characters_in_each_word_in_a_given_sentence {

	public static void main(String[] args) {
		
		String str = "geeks for geeks";
		count(str);
	}
	
	
	static void count(String str)
	{
		// Create an char array of given String
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			// Declare an String with empty initialization
			String s = "";

			// When the character is not space
			while (i < ch.length && ch[i] != ' ') {

				// concat with the declared String
				s = s + ch[i];
				i++;
			}

			System.out.println("------------>"+ s.length());
			
			if (s.length() > 0)
				System.out.println(s + "->" + s.length());		
		}
	}

}
