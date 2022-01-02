package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_OrderOfIntigerElementsInArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(88);
		list.add(3);
		list.add(44);

		System.out.println("Before reversing list is: "+ list);
		Collections.reverse(list);
		System.out.println("After reversing list is: "+ list);
		
		Collections.sort(list);
		System.out.println("After sort list is: "+ list);
		
	}

}
