package arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] a= {1789,2035,1899,1456,2013};
		
		String[] names= {"Lisa","Joyal","Jomy","Jocelin"};
		
		Arrays.sort(a);
		Arrays.sort(names);
     
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(names));
		
		
	}

}
