package interviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

// add 5 items to the arraylist
//Allow user to enter new item
//if item is already found- message item already exists
//if item is not found- add a new item
//if quit is pressed he should come out and the final list should be printed








public class Grocerychallenge {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> grocerylist= new ArrayList<String>();
	grocerylist.add("Bananas");
	grocerylist.add("Wheat bread");
	grocerylist.add("Milk");
	grocerylist.add("Oatmeal");
	grocerylist.add("carrot");
	
	System.out.println("The items in the list are  :" +grocerylist.toString());
	
	System.out.println("Enter the item or \" quit\" to exit");
	String newitem= sc.nextLine();
	boolean found = false;
	// scan for the item in the entire list . if found print the item already exists
	
	while(newitem.equalsIgnoreCase("quit")==false){
		
			for(int i=0;i<grocerylist.size();i++) {
				if(newitem.equalsIgnoreCase(grocerylist.get(i))) {
					System.out.println(" The item already exists in the list");
					found = true;
				}
			}
			if(found==false) {
				grocerylist.add(newitem);
				
				
			}
				
				
			   System.out.println("Enter the item or \" quit\" to exit");
			   
			   newitem=sc.nextLine();
			
			
	
	
	
	}System.out.println("\nthe final list is:\n "+grocerylist.toString());
	
	
	
	
	
	
	
	
	
	
	
	}

}
