package Day9.Assignment;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3, 2, 11, 4, 6, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int array1 : a) {
			list1.add(array1);
		}
		System.out.println(list1);
		
		int max1 = list1.get(0);
		int max2 = list1.get(0);
		
		for(int num : list1) {
			if(num > max1) {
				max2=max1;
				max1=num;
			}
			else if(num > max2){
				max2=num;
			}
		}
		System.out.println(max2);
	}

}
