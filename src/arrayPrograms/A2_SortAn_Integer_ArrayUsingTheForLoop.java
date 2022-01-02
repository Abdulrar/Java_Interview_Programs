package arrayPrograms;

public class A2_SortAn_Integer_ArrayUsingTheForLoop {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		//int[] arr = new int[] {78, 34, 1, 3, 90, 34, 1, 4, 6, 55, 20, 65};
		System.out.println("Array elements after sorting:(AssendingOrder) ");  
		//sorting logic  
		for (int i = 0; i < arr.length; i++)   
		{
			
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}  
		//prints the sorted element of the array  
		System.out.print(arr[i]+",");  
		
		}  
		
		System.out.println();
		System.out.println("=========================================");
		
		for (int i = 0; i < arr.length; i++)   
			//for (int i = arr.length; i > 0; i--)   
		{
			
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] < arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}  
		
			System.out.print(arr[i] + ",");
		}  
		
		//System.out.print("Descending Order:");
        //for (int i = 0; i < arr.length - 1; i++) {
          //  System.out.print(arr[i] + ",");
        //}
        
        //System.out.print(arr[arr.length - 1]);
		
	}  
}  