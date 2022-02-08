package numberPrograms;

public class Given_String_Is_Palindrome_Or_Not {

	public static void main(String[] args) {
		
		//String s1 = "madam";
		String s1 = "abdul";
		int size = s1.length()-1;
		int j = s1.length()-1;
		
		for(int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i)==s1.charAt(j)) {
				
				--j;
				if(i==size) {
					System.out.println("Given string is palindrome");				
				}
			}else{
				System.out.println("Given string is not a palindrome");
				break;
			}
			
			
		}

	}

}
