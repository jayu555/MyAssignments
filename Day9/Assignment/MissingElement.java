package Day9.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a ={1,2,3,4,10,6,8};
		
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(a));
		Collections.sort(numbers);
		System.out.println(numbers);
		
		int first = numbers.get(0);
		int last  = numbers.get(numbers.size()-1);
		for(int i=first+1; i<last; i++){
		    if(!numbers.contains(i)) {
				System.out.println("Missing Element is : "+i);
			}

	}

}
}
