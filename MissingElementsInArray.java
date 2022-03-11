package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] arr =  {1,2,3,4,7,6,8};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int arr1 : arr)
		{
			list.add(arr1);
		}

		Collections.sort(list);
		int j = 1;
		for (int i =0; i<list.size(); i++)
		{
			
			if(j != list.get(i))
			{
				System.out.println(i+1);
				j = j+2;
			}
			else
			{
				j++;
			}
			}
		}
	}


