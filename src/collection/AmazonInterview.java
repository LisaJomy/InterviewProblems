package collection;

import java.util.ArrayList;

public class AmazonInterview {

	public static void main(String[] args) {

// Print the unique numbers from the array list
		
		int a[]= {4,5,5,5,4,6,6,9,4};
		
		//create an empty array list and push all the numbers 1 by 1
		ArrayList<Integer> ab=new ArrayList<Integer>();
		// if the array list does not contain 4 then add 4
		// doest not contain  add 4 to array list \k=1\j=1=5--loop till j=8 if there is 4 again increament k and print the output
		
				// continue for other numbers in the loop
		for(int i=0;i<a.length;i++) {
		int k=0; 
		
		
			if(!ab.contains (a[i])) {
				ab.add(a[i]);
				k=k+1;
			
					for(int j=i+1;j<a.length;j++) {
				
						if(a[i]==a[j]) {
							k=k+1;
						}
				
				
				
					}
			System.out.println(a[i]);
			System.out.println(k);
		
		
		}//if
		
	}//for	
		
		
		
		
		
		
		
		
		


	}

}
