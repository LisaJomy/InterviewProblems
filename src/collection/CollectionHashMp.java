package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionHashMp {

	public static void main(String[] args) {
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		
		mp.put(1, "Lisa");
		mp.put(2, "Geetha");
		mp.put(3, "Rani");
		mp.put(4, "Mishra");
		mp.put(5, "Sneha");
		mp.put(6, "Haron");
		mp.put(7, "Selva");
		//System.out.println(mp.get(6));
		//System.out.println(mp.remove(3, "Rani"));;
		
       Set<Entry<Integer, String>> s  =mp.entrySet();
       Iterator<Entry<Integer, String>> it=s.iterator();
       while(it.hasNext()) {
    	   
    	  System.out.println(it.next()); 
//    	Map.Entry  me=(Map.Entry) it.next();
//    	System.out.println(me.getKey());
//    	System.out.println(me.getValue());
       }
	}

}
