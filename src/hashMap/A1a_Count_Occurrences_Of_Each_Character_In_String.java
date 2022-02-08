package hashMap;

import java.util.HashMap;
import java.util.Map;

public class A1a_Count_Occurrences_Of_Each_Character_In_String {

	public static void main(String[] args) {
		
		
		getEachCharCount("test");
		getEachCharCount("test java");
		getEachCharCount("testing");
		getEachCharCount("test    space    test     ");
		
		
		//getSpaceCount("test    space    test     ");
		
	}

	
	public static void getEachCharCount(String word){
		
		char[] latters = word.toCharArray();
		
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for(char c : latters){
			//if(String.valueOf(c).isBlank()) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		//}
		System.out.println(word+":"+hashMap);
		
		
	}
	
	
public static void getSpaceCount(String word){
		
		char[] latters = word.toCharArray();
		
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for(char c : latters){
			
			if(hashMap.containsKey(' ')) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		
		System.out.println(word+":"+hashMap);
		
		
	}
	
}
