package patternPrograms;

public class StarPatternsWithScipRows {

	public static void main(String[] args) {
		
		
	 System.out.println("Pattern_1");	
     for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
      
//OutPut : 
     // * * * * *
     // * * * * *
     // * * * * *
     // * * * * *

	  System.out.println("Pattern_2");	
      for(int i=1; i<=7; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
				//i++;
			}
			
			System.out.println();
			i++;
		}
      
//OutPut : 
     // * 
     // * * 
     // * * * 
     // * * * * 
     // * * * * *
      
           
      
	}

}
