package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionCollections {

	public static void main(String[] args) {
		
		// a) Declare An array for {3,2,11,4,6,7};
				int [] arr1 = {3,2,11,4,6,7};
				int [] arr2 = {1,2,8,4,9,7};
				
				List<Integer> temp = new ArrayList<Integer>();
				
				List<Integer> list1 = new ArrayList<Integer>();
				for (int i : arr1) {
					list1.add(i);
				}
				
				List<Integer> list2 = new ArrayList<Integer>();
				
				for (int j : arr2) {
					list2.add(j);	
					}
				
				for (int int1 : list1) {
					for(int int2:list2) {
						if(int1==int2) {
							temp.add(int1);
						}	
					}			
				}
				System.out.println(temp);
	}

}
