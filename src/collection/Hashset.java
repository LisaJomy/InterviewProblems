package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	
	// does not maintain insersion order
	// can add only unique values

	public static void main(String[] args) {
		
	HashSet<String>	 a= new HashSet<String>();
	
	a.add("Lisa");
	a.add("Jocelin");
	
	
	a.add("Rita");
	a.add("Lakshmi");
	a.add("Lakshmi");
	System.out.println(a);
	a.remove("Rita");
	a.add("Geetha");
	a.add("Pooja");
	System.out.println(a);
	System.out.println(a.isEmpty());
	System.out.println(a.size());
	System.out.println("*********");
		//set data structure
	// we have to iterate though the set interface with the help of iterator	
	//how iterator is used in traversing in set interface?
	//creat an object for hashset
	//use the refernce obj.iterator
	//this will create an object of iterator
	// with that object reference if we say i.next() it point to first index
Iterator<String> it	=a.iterator();
// it.hasNext()- will check wheather next index is present or not
while(it.hasNext()) {
	System.out.println(it.next());
}


	
		
		
		
		
		
		

	}

}
