package stringPrograms;

import java.util.Arrays;

public class anagramProgramInJava {

	public static void main(String[] args) {
		// An anagram of a string is another string that contains the same characters, 
		// only the order of characters can be different
		
		String s1 = "This Is anagrsM";
		String s2 = "This Is anagrsM";
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");	
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		boolean status = Arrays.equals(a, b);
		
		if(status == true) {
			System.out.println("Given strings are anagram ");
		}else{
			System.out.println("Given strings are not anagram ");
		}
		

	
	String s = "This Is anagrsM";
	 s = "test";
	 s = "test2";
	 
	 System.out.println(s);
	}
}
