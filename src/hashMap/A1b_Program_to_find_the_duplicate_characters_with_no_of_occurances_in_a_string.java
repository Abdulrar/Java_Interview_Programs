package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A1b_Program_to_find_the_duplicate_characters_with_no_of_occurances_in_a_string {

	public static void main(String[] args) {
		String s1 = "This is duplicate charecter occurances";
		
		duplicateCharOccurance("A");
		duplicateCharOccurance("");
		duplicateCharOccurance(null);
		duplicateCharOccurance("javata");
		duplicateCharOccurance("abdulrahamana");
		//duplicateCharOccurance("1000");
		duplicateCharOccurance("00007 james bond");
		duplicateCharOccurance(s1);
		
        }
	
	
	public static void duplicateCharOccurance(String str) {
		if(str == null) {
			System.out.println("NULL String");
			return; // return nothings means its a void return 
		}
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if(str.length()==1) {
			System.out.println("Single Char String");
			return;
		}
		
		char words[] = str.toCharArray();
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>(); //Map<key, Value>
		for(char ch: words) {
			if(hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch)+1);
			}else {				
				hashMap.put(ch, 1);
			}						
		}
		
		//print the map
	   Set<Map.Entry<Character, Integer>>  entrySet = hashMap.entrySet();
	   for(Map.Entry<Character, Integer> entry: entrySet) {
		if(entry.getValue() > 1) { // Integer(Value --> here not key) count
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
		
	}
        
	}
