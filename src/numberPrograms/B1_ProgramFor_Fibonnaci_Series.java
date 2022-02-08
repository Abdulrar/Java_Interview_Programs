package numberPrograms;

public class B1_ProgramFor_Fibonnaci_Series {

	public static void main(String[] args) {
		
		
		//Fionacciseries : is the sum of first two numbers
		
		int count = 10;
		int first = 0;
		int scnd = 1;
		
		for(int i=2; i<count; i++) {
			
			int thirdnum = first+scnd;
			
			System.out.print(thirdnum+",");
			first = scnd;
			scnd = thirdnum;
			
		}
		
		

	}

}
