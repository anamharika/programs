package collection;

import java.util.ArrayList;
import java.util.List;

public class Listconcept {

	public static void main(String[] args)
	{
List<String> list = new ArrayList<String>();
// for adding a data 


list.add("mango");
list.add("harika");
list.add("sripathi");
list.add("nikki");
list.add("laxmi");
list.add("niha");
System.out.println(list);

System.out.println("-----------------------");
//  for getting data //
System.out.println(list.get(3));
System.out.println("--------------------------");


// to get the data size 
System.out.println(list.size());
System.out.println("------------------------------");
// we can add data after instillazion //

list.add("abc");
list.add("xyz");

System.out.println(list.size());
System.out.println("---------------------------------------");
// what is the index of the nikki

System.out.println(list.indexOf("nikki"));
System.out.println("--------------------------------");
// we have a requirment add data into particual index
list.add(4, "laxmibai");
System.out.println(list.get(4));

System.out.println("----------------------------------");

// how to get total data 

for(int i = 0; i<list.size();i++) {
	System.out.println(list.get(i));
	
	
}
System.out.println("*******************************");
// using for each loop

 for (String n : list) {
	 System.out.println(n);
 }
 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

//how to know the data is available or not//
		Boolean Contt = list.contains("harika");
		System.out.println(Contt);
		
		System.out.println("**************************************");
// how to remove  element from the string 
		
		list.remove(2);
	System.out.println(list); // removed sripathi
	
	System.out.println("************************");
		System.out.println(list.contains("harika"));
		System.out.println("******************************");
		// how to know the string is empty r not
		
		System.out.println(list.isEmpty());
		
		System.out.println("****************************************");
		// how to clear all the elements from string 
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
		
		
		
	}

}


