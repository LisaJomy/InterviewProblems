package collection;

import java.util.ArrayList;

public class ArListCollection {

	public static void main(String[] args) {
		

		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Lisa");
		list.add("Neena");
		
		list.add("Swetha");
		list.add("Nisha");
		list.add("Kalpana");
		
		System.out.println(list);
		
		list.add(0, "George");
		
		System.out.println(list);
		list.remove(2);

		System.out.println(list);
		System.out.println(list.get(3));
		
		System.out.println("**************") ;
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.contains("Nisha"));
		
		//In array to check a string is present or not we have to iterate the entire array and 
		//if that element is present 
		//check with ==
		//If list==5
		
		//To check at what index the the data is stored
		System.out.println(list.indexOf("Nisha"));
		System.out.println(list.isEmpty());
		
	}

}
