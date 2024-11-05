package Day9.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3, 2, 11, 4, 6, 7};
		int b[] = {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int array1 : a) {
			list1.add(array1);
		}
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		for(int array2 : b) {
			list2.add(array2);
		}
		System.out.println(list2);
		
		List<Integer> commonNumbers = new ArrayList<Integer>();
		for(int num : list1) {
			for(int num2 : list2) {
				if(num == num2) {
					commonNumbers.add(num);
				}
			}
		}
		System.out.println(commonNumbers);
		

	}

}
