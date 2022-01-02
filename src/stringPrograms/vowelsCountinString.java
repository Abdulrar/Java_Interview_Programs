package stringPrograms;

public class vowelsCountinString {

	public static void main(String[] args) {
		
		String s = "abdul rahaman kj fhjakfdj afhoufha  svkjfka jflnsfjeslkjfnakf";
				
		char[] chars = s.toCharArray();
		
				int count = 0;
				 for(char x: chars) {
					 //System.out.println(x);

					 
				switch(x){

				case 'a':
					case 'e':
						case 'i':
							case 'o':
								case 'u':

				count ++;

				//break;
				}
			}	

				System.out.println("no of wovels are: " + count );

	}

	
}
