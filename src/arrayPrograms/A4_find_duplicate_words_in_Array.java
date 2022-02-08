package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class A4_find_duplicate_words_in_Array {

	public static void main(String[] args) {
			
			String[] s1 = new String[] {"java","sping","cSharp","cSharp","test","test"};
			
			//HashSet<Object> nonDS = new HashSet<>();
			//HashSet<Object> DS = new HashSet<>();

			Set nonDS = new HashSet();
			Set DS = new HashSet();
			
			for(String s2: s1) {
				
				if(!nonDS.contains(s2)) {
				nonDS.add(s2);
				}else {
					DS.add(s2);
				}
				 
			}
			
			System.out.println(DS); 
			
			
			
			/*
			 String[] strArray = new String[] {"apple", "ball", "cat", "apple", "ball", "apple"};
			    Set set = new HashSet();
			    Set uniqueSet = new HashSet();
			    
			    for(int i = 0; i < strArray.length ; i++ ){
			        boolean b = set.add(strArray[i]);
			        if(b == false){
			            uniqueSet.add(strArray[i]);
			        }
			    }
			    Iterator it = uniqueSet.iterator();
			    while (it.hasNext()){
			        System.out.println(it.next());
			    }
			*/
			
			
			///// creating calling method 
			
			/*
			public static void main(String[] args) {
			    String[] strArray = new String[] {"apple", "ball", "cat", "apple", "ball", "apple"};

			    System.out.println(printUnique(strArray));
			}

			public static Set<String> printUnique(String[] strArray){
			    Set<String> set = new HashSet<String>();
			    Set<String> uniqueSet = new HashSet<String>();
			    for(int i = 0; i < strArray.length ; i++ ){
			        boolean b = set.add(strArray[i]);
			        if(b == false){
			            uniqueSet.add(strArray[i]);
			        }
			    }
			    return(uniqueSet);
			}
			*/
			
		}
		
	}
