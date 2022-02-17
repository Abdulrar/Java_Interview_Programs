package stringPrograms;

public class R1_Reverse_given_String {

	public static void main(String[] args) {
		
		String s1 = "Hi this is my interview?";

		System.out.println();
        for(int i=s1.length()-1; i>=0; i--) {			
			System.out.print(s1.charAt(i));			
		}
        
        String[] str = s1.split(" ");
        
        System.out.println();
        for(int i=str.length-1; i>=0; i--) {			
			System.out.print(str[i]+" ");			
		}
        
	}

}
