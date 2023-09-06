package collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setconcept {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<String>();
		
		set.add("harika");
		set.add("sripathi");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("sripathi");
		
		// how to count the total size /
		System.out.println(" the count of set = " +set.size());
		System.err.println("----------------------------------------------");
		// how to get text the total size
		for (String n : set) {
			 System.out.println(n);
			 
		}
		System.out.println("-----------------------------------");
		
		// how to get the data from the list //
		System.out.println(" the list of set is = "+set);
		
		// hoe to get exected index data
		

	}

}
