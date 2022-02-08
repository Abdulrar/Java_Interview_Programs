package stringPrograms;

public class B1b_Program_to_find_count_the_occurrences_of_each_character {

	public static void main(String[] args) {
	
		String str = "The quick brown fox jumped over the lazy dog.";
		//String str = "T";
		getCharOccuranceMethod1(str, 'a');
		getCharCountMethod2(str, 'T');
		getCharCountMethod2(str, ' ');
		System.out.println("---------->concat strings is: "+str.concat("test"));
		StringBuffer sb = new StringBuffer(str);
		System.out.println("---------->StringBuffer strings is: "+sb.append("test2"));
		System.out.println("---------->StringBuffer reverse strings is: "+sb.reverse());
		
		
		StringBuilder sbuilder = new StringBuilder(str);
		System.out.println("---------->StringBuilder strings is: "+sbuilder.append("test3"));
		System.out.println("---------->StringBuffer reverse strings is: "+sbuilder.reverse());
	}
	
	
	public static void getCharOccuranceMethod1(String str, char val) {
		int count = 0;
		char latter[] = str.toCharArray();

		for(char ch: latter) {	
	         if(ch == val) {
		        count ++;
	         }
        }
		
		System.out.println(val+":"+count);
	}	
		
	public static void getCharCountMethod2(String str, char val) {
		
		int count=0;
		for(int i=0; i<str.length();i++) {
			char latter = str.charAt(i);
			if(latter == val) {
				count++;
			}
			
		}
		System.out.println(val+":"+count);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int countA = 0, countO = 0, countSpace = 0, countDot = 0;

        for (int i = 0; i < test.length(); i++) {
            switch (test.charAt(i)) {
                case 'a':
                case 'A': countA++; break;
                case 'o':
                case 'O': countO++; break;
                //case ' ': countSpace++; break;
                case '.': countDot++; break;
            }
        }

        //System.out.printf("%s%d%n%s%d%n%s%d%n%s%d", "A: ", countA, "O: ", countO, "Space: ", countSpace, "Dot: ", countDot);
        System.out.printf("%s%d%n%s%d%n%s%d", "A: ", countA, "O: ", countO, "Dot: ", countDot);
		*/
		
	
        
}
