package patternPrograms;

public class NumberPattrens {

	public static void main(String[] args) {
		
		System.out.println("Pattern_1");	
	     for(int i=1; i<=5; i++) {
				
				for(int j=1; j<=5; j++) {
					System.out.print(j+" ");
				}
				
				System.out.println();
			}
	      
	//OutPut : 
	     // * * * * *
	     // * * * * *
	     // * * * * *
	     // * * * * *

		  System.out.println("Pattern_2");	
	      for(int i=1; i<=5; i++) {
				
				for(int j=1; j<=i; j++) {
					System.out.print(j+" ");
				}
				
				System.out.println();
			}
	      
	//OutPut : 
	     // * 
	     // * * 
	     // * * * 
	     // * * * * 
	     // * * * * *
	      
	      
	      
	      System.out.println("Pattern_3");	
	      for(int i=5; i>=1; i--) {
				
				for(int j=1; j<=i; j++) {
					System.out.print(j+" ");
				}
				
				System.out.println();
			}
	      
	//OutPut : 
	     // * * * * *
	     // * * * * 
	     // * * * 
	     // * *  
	     // *
	      
	      
	      
	      System.out.println("Pattern_4");	
	      for(int i=1; i<=5; i++) {
				
				for(int j=5; j>=i; j--) {
					System.out.print(j+" ");
				}
				
				System.out.println();
			}
	      
	//OutPut : 
	     // * * * * *
	     // * * * * 
	     // * * * 
	     // * *  
	     // *
	      
	      System.out.println("Pattern_5");	
	      for(int i=5; i>=1; i--) {
				
				for(int j=5; j>=i; j--) {
					System.out.print(j+" ");
				}
				
				System.out.println();
			}
	      
	//OutPut : 
	     // * 
	     // * * 
	     // * * * 
	     // * * * * 
	     // * * * * * 
	      
	  //============================================================================//
	    
	      
	      System.out.println("Pattern_6");	
	      
	      int n = 5;
	      for(int i=1; i<=n; i++) {
				
				for(int j=n; j>=1; j--) {
					if(i>=j) {
						System.out.print(j+" ");
					}else {
						System.out.print("  ");
					}
					
				}
				
				System.out.println();
			}
	      
	//OutPut : 
	     //         *
	     //       * *
	     //     * * * 
	     //   * * * *
	     // * * * * *
	      
	      
	      System.out.println("Pattern_7");	
	      for(int i=5; i>=1; i--) {
				
				for(int j=5; j>=1; j--) {
					if(i>=j) {
						System.out.print(j+" ");
					}else {
						System.out.print("  ");
					}
					
				}
				
				System.out.println();
	      }
	//OutPut : 
	      // * * * * *        
	      //   * * * *
	      //     * * * 
	      //       * *
	      //         *      


	}

}
