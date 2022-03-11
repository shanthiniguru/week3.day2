package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicationCollections {
	public static void main(String[] args) {
		// a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		
		//Initialize an integer variable as count
		//int count = 0;
		
		String[] array = text.split(" ");
		Set<String> set = new LinkedHashSet<String>();
		List<String> list = new ArrayList<String>(set);
		//Set<String> set = new LinkedHashSet<String>();
		//List<String> list = new ArrayList<String>(set);
		
		for(String eachList:array)
		{
			list.add(eachList);
			//System.out.println(eachList);
			set.addAll(list);
			
			
		}
		list.clear();
		list.addAll(set);
		for (int i =0 ; i<list.size();i++)
		{
		System.out.print(list.get(i) +" ");
		}
		
	}

}
