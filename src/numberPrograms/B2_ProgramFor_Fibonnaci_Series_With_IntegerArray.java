package numberPrograms;

public class B2_ProgramFor_Fibonnaci_Series_With_IntegerArray {

	public static void main(String[] args)  {
		
		//Fionacciseries : is the sum of first two numbers
		
				
				int[] count = new int[10]; 
				count[0]=0;
				count[1]=1;
				
				
				for(int i=2; i<10; i++) {
					
					count[i] = count[i-1]+count[i-2];
					
				}
				
				for(int x: count) {
					System.out.print(x+",");
				}

	}

}
